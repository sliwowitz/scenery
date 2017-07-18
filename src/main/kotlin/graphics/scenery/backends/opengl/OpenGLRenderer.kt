package graphics.scenery.backends.opengl

import cleargl.*
import com.jogamp.common.nio.Buffers
import com.jogamp.opengl.*
import com.jogamp.opengl.util.FPSAnimator
import com.jogamp.opengl.util.awt.AWTGLReadBufferUtil
import graphics.scenery.*
import graphics.scenery.backends.*
import graphics.scenery.backends.vulkan.VulkanRenderer
import graphics.scenery.controls.TrackerInput
import graphics.scenery.fonts.SDFFontAtlas
import graphics.scenery.spirvcrossj.Loader
import graphics.scenery.spirvcrossj.libspirvcrossj
import graphics.scenery.utils.GPUStats
import graphics.scenery.utils.NvidiaGPUStats
import graphics.scenery.utils.SceneryPanel
import graphics.scenery.utils.Statistics
import javafx.application.Platform
import org.lwjgl.system.MemoryUtil
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import java.io.File
import java.lang.reflect.Field
import java.nio.ByteBuffer
import java.nio.FloatBuffer
import java.nio.IntBuffer
import java.text.SimpleDateFormat
import java.util.*
import java.util.concurrent.ConcurrentHashMap
import java.util.concurrent.TimeUnit
import javax.imageio.ImageIO
import kotlin.collections.LinkedHashMap
import kotlin.concurrent.thread
import kotlin.concurrent.withLock

/**
 * Deferred Lighting Renderer for scenery
 *
 * This is the main class of scenery's Deferred Lighting Renderer. Currently,
 * a rendering strategy using a 32bit position, 16bit normal, 32bit RGBA diffuse/albedo,
 * and 24bit depth buffer is employed. The renderer supports HDR rendering and does that
 * by default. By deactivating the `hdr.Active` [Settings], HDR can be programmatically
 * deactivated. The renderer also supports drawing to HMDs via OpenVR. If this is intended,
 * make sure the `vr.Active` [Settings] is set to `true`, and that the `Hub` has a HMD
 * instance attached.
 *
 * @param[hub] A [Hub] instance needed for Scenery-internal communication
 * @param[applicationName] The name of this application
 * @param[scene] The initial scene to use
 * @param[width] Initial window width, will be used for framebuffer construction
 * @param[height] Initial window height, will be used for framebuffer construction
 * @param[embedIn] JavaFX SceneryPanel where this renderer might be embedded in, otherwise null
 *
 * @constructor Initializes the [OpenGLRenderer] with the given window dimensions and GL context
 *
 * @author Ulrik Günther <hello@ulrik.is>
 */

class OpenGLRenderer(hub: Hub,
                     applicationName: String,
                     scene: Scene,
                     width: Int,
                     height: Int,
                     override var embedIn: SceneryPanel? = null,
                     renderConfigFile: String = System.getProperty("scenery.Renderer.Config", "DeferredShading.yml")) : Renderer, Hubable, ClearGLDefaultEventListener() {
    /** slf4j logger */
    private var logger: Logger = LoggerFactory.getLogger("OpenGLRenderer")
    /** [GL4] instance handed over, coming from [ClearGLDefaultEventListener]*/
    lateinit private var gl: GL4
    /** should the window close on next looping? */
    override var shouldClose = false
    /** the scenery window */
    override var window: SceneryWindow = SceneryWindow.UninitializedWindow()
    /** separately stored ClearGLWindow */
    var cglWindow: ClearGLWindow? = null
    /** drawble for offscreen rendering */
    var drawable: GLOffscreenAutoDrawable? = null
    /** Whether the renderer manages its own event loop, which is the case for this one. */
    override var managesRenderLoop = true

    /** The currently active scene */
    var scene: Scene = Scene()

    /** Cache of [Node]s, needed e.g. for fullscreen quad rendering */
    private var nodeStore = ConcurrentHashMap<String, Node>()

    /** Cache for [SDFFontAtlas]es used for font rendering */
    private var fontAtlas = HashMap<String, SDFFontAtlas>()

    /** [Settings] for the renderer */
    override var settings: Settings = Settings()

    /** The hub used for communication between the components */
    override var hub: Hub? = null

    /** Texture cache */
    private var textures = HashMap<String, GLTexture>()

    /** Shader Property cache */
    private var shaderPropertyCache = HashMap<Class<*>, List<Field>>()

    /** JOGL Drawable */
    private var joglDrawable: GLAutoDrawable? = null

    /** Flag set when a screenshot is requested */
    private var screenshotRequested = false

    /** Eyes of the stereo render targets */
    var eyes = (0..0)

    /** time since last resizing */
    private var lastResizeTimer = Timer()

    /** Window resizing timeout */
    private var WINDOW_RESIZE_TIMEOUT = 200L

    /** Flag to indicate whether framebuffers have to be recreated */
    private var mustRecreateFramebuffers = false

    /** GPU stats object */
    private var gpuStats: GPUStats? = null

    /** heartbeat timer */
    private var heartbeatTimer = Timer()

    var initialized = false
        private set

    private val pbos: IntArray = intArrayOf(0, 0)
    private var readIndex = 0
    private var updateIndex = 0

    private var renderConfig: RenderConfigReader.RenderConfig
    var renderConfigFile = ""
        set(config) {
            field = config
            this.renderConfig = RenderConfigReader().loadFromFile(renderConfigFile)

            mustRecreateFramebuffers = true
        }

    private var renderpasses = LinkedHashMap<String, OpenGLRenderpass>()
    private var flow: List<String>

    /**
     * Extension function of Boolean to use Booleans in GLSL
     *
     * This function converts a Boolean to Int 0, if false, and to 1, if true
     */
    fun Boolean.toInt(): Int {
        if (this) {
            return 1
        } else {
            return 0
        }
    }

    var applicationName = ""

    private val MATERIAL_HAS_DIFFUSE = 0x0001
    private val MATERIAL_HAS_AMBIENT = 0x0002
    private val MATERIAL_HAS_SPECULAR = 0x0004
    private val MATERIAL_HAS_NORMAL = 0x0008
    private val MATERIAL_HAS_ALPHAMASK = 0x0010

    inner class ResizeHandler {
        @Volatile var lastResize = -1L
        var lastWidth = 0
        var lastHeight = 0

        @Synchronized fun queryResize() {
            if (lastWidth <= 0 || lastHeight <= 0) {
                lastWidth = Math.max(1, lastWidth)
                lastHeight = Math.max(1, lastHeight)
                return
            }

            if (lastResize > 0L && lastResize + WINDOW_RESIZE_TIMEOUT < System.nanoTime()) {
                lastResize = System.nanoTime()
                return
            }

            if (lastWidth == window.width && lastHeight == window.height) {
                return
            }

            window.width = lastWidth
            window.height = lastHeight

            drawable?.setSurfaceSize(window.width, window.height)
            mustRecreateFramebuffers = true
            pbos[0] = 0
            pbos[1] = 0

            embedIn?.let { panel ->
                panel.prefWidth = window.width.toDouble()
                panel.prefHeight = window.height.toDouble()
            }

            lastResize = -1L
        }
    }

    inner class OpenGLBuffer(var gl: GL4, var size: Int) {
        var buffer: ByteBuffer
        var id = intArrayOf(-1)
        var alignment = 256L

        init {
            gl.glGenBuffers(1, id, 0)
            buffer = MemoryUtil.memAlloc(size)

            gl.glBindBuffer(GL4.GL_UNIFORM_BUFFER, id[0])
            gl.glBufferData(GL4.GL_UNIFORM_BUFFER, size * 1L, null, GL.GL_DYNAMIC_DRAW)
            gl.glBindBuffer(GL4.GL_UNIFORM_BUFFER, 0)
        }

        fun copyFromStagingBuffer() {
            buffer.flip()
            gl.glBufferSubData(GL4.GL_UNIFORM_BUFFER, 0, buffer.capacity() * 1L, buffer)
        }

        fun reset() {
            buffer.position(0)
            buffer.limit(size)
        }

        fun advance(align: Long = this.alignment): Int {
            val pos = buffer.position()
            val rem = pos.rem(align)

            if (rem != 0L) {
                val newpos = pos + align.toInt() - rem.toInt()
                buffer.position(newpos)
            }

            return buffer.position()
        }
    }

    internal val buffers = HashMap<String, OpenGLBuffer>()
    internal val sceneUBOs = ArrayList<Node>()

    internal val resizeHandler = ResizeHandler()

    /**
     * Constructor for OpenGLRenderer, initialises geometry buffers
     * according to eye configuration. Also initialises different rendering passes.
     *
     */
    init {

        Loader.loadNatives()
        libspirvcrossj.initializeProcess()

        logger.info("Initializing OpenGL Renderer...")
        this.hub = hub
        this.settings = loadDefaultRendererSettings(hub.get(SceneryElement.Settings) as Settings)
        this.window.width = width
        this.window.height = height

        this.renderConfigFile = renderConfigFile
        this.renderConfig = RenderConfigReader().loadFromFile(renderConfigFile)

        this.flow = this.renderConfig.createRenderpassFlow()

        logger.info("Loaded ${renderConfig.name} (${renderConfig.description ?: "no description"}")

        this.scene = scene
        this.applicationName = applicationName

        val hmd = hub.getWorkingHMDDisplay()
        if (settings.get("vr.Active") && hmd != null) {
            this.window.width = hmd.getRenderTargetSize().x().toInt() * 2
            this.window.height = hmd.getRenderTargetSize().y().toInt()
        }

        if (embedIn != null) {
            val profile = GLProfile.getMaxProgrammableCore(true)
            val caps = GLCapabilities(profile)
            caps.hardwareAccelerated = true
            caps.doubleBuffered = true
            caps.isOnscreen = false
            caps.isPBuffer = true
            caps.redBits = 8
            caps.greenBits = 8
            caps.blueBits = 8
            caps.alphaBits = 8

            val factory = GLDrawableFactory.getFactory(profile)
            drawable = factory.createOffscreenAutoDrawable(factory.defaultDevice, caps,
                DefaultGLCapabilitiesChooser(), window.width, window.height)
                .apply {

                    addGLEventListener(this@OpenGLRenderer)

                    animator = FPSAnimator(this, 600)
                    animator.setUpdateFPSFrames(600, null)
                    animator.start()

                    embedIn?.let { panel ->
                        panel.imageView.scaleY = -1.0

                        panel.widthProperty()?.addListener { _, _, newWidth ->
                            resizeHandler.lastWidth = newWidth.toInt()
                        }

                        panel.heightProperty()?.addListener { _, _, newHeight ->
                            resizeHandler.lastHeight = newHeight.toInt()
                        }

                        panel.minWidth = 100.0
                        panel.minHeight = 100.0
                        panel.prefWidth = window.width.toDouble()
                        panel.prefHeight = window.height.toDouble()
                    }

                    window = SceneryWindow.JavaFXStage(embedIn!!)
                    window.width = width
                    window.height = height

                    resizeHandler.lastWidth = window.width
                    resizeHandler.lastHeight = window.height

                }
        } else {
            val w = this.window.width
            val h = this.window.height

            cglWindow = ClearGLWindow("",
                w,
                h, this).apply {

                if (embedIn != null) {

                } else {
                    window = SceneryWindow.ClearGLWindow(this)
                    window.width = w
                    window.height = h

                    this.setFPS(300)
                    this.start()

                    this.isVisible = true
                }
            }
        }
    }

    override fun init(pDrawable: GLAutoDrawable) {
        this.gl = pDrawable.gl.gL4

        val width = this.window.width
        val height = this.window.height

        gl.swapInterval = 0

        val driverString = gl.glGetString(GL.GL_RENDERER)
        val driverVersion = gl.glGetString(GL.GL_VERSION)
        logger.info("OpenGLRenderer: $width x $height on $driverString, $driverVersion")

        if (driverVersion.toLowerCase().indexOf("nvidia") != -1 && System.getProperty("os.name").toLowerCase().indexOf("windows") != -1) {
            gpuStats = NvidiaGPUStats()
        }

        val numExtensionsBuffer = IntBuffer.allocate(1)
        gl.glGetIntegerv(GL4.GL_NUM_EXTENSIONS, numExtensionsBuffer)
        val extensions = (0..numExtensionsBuffer[0] - 1).map { gl.glGetStringi(GL4.GL_EXTENSIONS, it) }
        logger.debug("Available OpenGL extensions: ${extensions.joinToString(", ")}")

        settings.set("ssao.FilterRadius", GLVector(5.0f / width, 5.0f / height))

        buffers.put("UBOBuffer", OpenGLBuffer(gl, 10 * 1024 * 1024))
        buffers.put("LightParametersBuffer", OpenGLBuffer(gl, 10 * 1024 * 1024))
        buffers.put("VRParametersBuffer", OpenGLBuffer(gl, 2 * 1024))
        buffers.put("ShaderPropertyBuffer", OpenGLBuffer(gl, 10 * 1024 * 1024))
        buffers.put("ShaderParameterBuffer", OpenGLBuffer(gl, 128 * 1024))

        settings.set("Renderer.displayWidth", window.width)
        settings.set("Renderer.displayHeight", window.height)

        renderpasses = prepareRenderpasses(renderConfig, window.width, window.height)

        // enable required features
        gl.glEnable(GL4.GL_TEXTURE_GATHER)

        initialized = true

        heartbeatTimer.scheduleAtFixedRate(object : TimerTask() {
            override fun run() {
                gpuStats?.let {
                    it.update(0)

                    hub?.get(SceneryElement.Statistics).let { s ->
                        val stats = s as Statistics

                        stats.add("GPU", it.get("GPU"), isTime = false)
                        stats.add("GPU bus", it.get("Bus"), isTime = false)
                        stats.add("GPU mem", it.get("AvailableDedicatedVideoMemory"), isTime = false)
                    }

                    if (settings.get<Boolean>("OpenGLRenderer.PrintGPUStats")) {
                        logger.info(it.utilisationToString())
                        logger.info(it.memoryUtilisationToString())
                    }
                }
            }
        }, 0, 1000)

        initializeScene()
    }

    fun prepareRenderpasses(config: RenderConfigReader.RenderConfig, windowWidth: Int, windowHeight: Int): LinkedHashMap<String, OpenGLRenderpass> {
        val framebuffers = ConcurrentHashMap<String, GLFramebuffer>()
        val passes = LinkedHashMap<String, OpenGLRenderpass>()

        val flow = renderConfig.createRenderpassFlow()

        flow.map { passName ->
            val passConfig = config.renderpasses[passName]!!
            val pass = OpenGLRenderpass(passName, passConfig)

            var width = windowWidth
            var height = windowHeight

            config.rendertargets?.filter { it.key == passConfig.output }?.map { rt ->
                logger.info("Creating render framebuffer ${rt.key} for pass $passName")
                width = (settings.get<Float>("Renderer.SupersamplingFactor") * windowWidth).toInt()
                height = (settings.get<Float>("Renderer.SupersamplingFactor") * windowHeight).toInt()

                if (framebuffers.containsKey(rt.key)) {
                    logger.info("Reusing already created framebuffer")
                    pass.output.put(rt.key, framebuffers[rt.key]!!)
                } else {
                    val framebuffer = GLFramebuffer(gl, width, height)

                    rt.value.forEach { att ->
                        logger.info(" + attachment ${att.key}, ${att.value.format.name}")

                        when (att.value.format) {
                            RenderConfigReader.TargetFormat.RGBA_Float32 -> framebuffer.addFloatRGBABuffer(gl, 32)
                            RenderConfigReader.TargetFormat.RGBA_Float16 -> framebuffer.addFloatRGBABuffer(gl, 16)

                            RenderConfigReader.TargetFormat.RGB_Float32 -> framebuffer.addFloatRGBBuffer(gl, 32)
                            RenderConfigReader.TargetFormat.RGB_Float16 -> framebuffer.addFloatRGBBuffer(gl, 16)

                            RenderConfigReader.TargetFormat.RG_Float32 -> framebuffer.addFloatRGBuffer(gl, 32)
                            RenderConfigReader.TargetFormat.RG_Float16 -> framebuffer.addFloatRGBuffer(gl, 16)

                            RenderConfigReader.TargetFormat.RGBA_UInt16 -> framebuffer.addUnsignedByteRGBABuffer(gl, 16)
                            RenderConfigReader.TargetFormat.RGBA_UInt8 -> framebuffer.addUnsignedByteRGBABuffer(gl, 8)

                            RenderConfigReader.TargetFormat.Depth32 -> framebuffer.addDepthBuffer(gl, 32)
                            RenderConfigReader.TargetFormat.Depth24 -> framebuffer.addDepthBuffer(gl, 24)
                        }
                    }

                    pass.output.put(rt.key, framebuffer)
                    framebuffers.put(rt.key, framebuffer)
                }
            }

            pass.openglMetadata.renderArea = OpenGLRenderpass.Rect2D(
                (pass.passConfig.viewportSize.first * width).toInt(),
                (pass.passConfig.viewportSize.second * height).toInt(),
                (pass.passConfig.viewportOffset.first * width).toInt(),
                (pass.passConfig.viewportOffset.second * height).toInt())
            logger.debug("Render area for $passName: ${pass.openglMetadata.renderArea.width}x${pass.openglMetadata.renderArea.height}")

            pass.openglMetadata.viewport = OpenGLRenderpass.Viewport(OpenGLRenderpass.Rect2D(
                (pass.passConfig.viewportOffset.first * width).toInt(),
                (pass.passConfig.viewportOffset.second * height).toInt(),
                (pass.passConfig.viewportSize.first * width).toInt(),
                (pass.passConfig.viewportSize.second * height).toInt()),
                0.0f, 1.0f)

            pass.openglMetadata.scissor = OpenGLRenderpass.Rect2D(
                (pass.passConfig.viewportSize.first * width).toInt(),
                (pass.passConfig.viewportSize.second * height).toInt(),
                (pass.passConfig.viewportOffset.first * width).toInt(),
                (pass.passConfig.viewportOffset.second * height).toInt())

            pass.openglMetadata.eye = pass.passConfig.eye
            pass.defaultShader = prepareShaderProgram(pass.passConfig.shaders.toTypedArray())

            pass.initializeShaderParameters(settings, buffers["ShaderParameterBuffer"]!!)

            passes.put(passName, pass)
        }

        // connect inputs
        passes.forEach { pass ->
            val passConfig = config.renderpasses[pass.key]!!

            passConfig.inputs?.forEach { inputTarget ->
                passes.filter {
                    it.value.output.keys.contains(inputTarget)
                }.forEach { pass.value.inputs.put(inputTarget, it.value.output[inputTarget]!!) }
            }

            with(pass.value) {
                // initialize pass if needed
            }
        }

        return passes
    }

    fun prepareShaderProgram(shaders: Array<String>): GLProgram {

        val modules = HashMap<GLShaderType, GLShader>()

        shaders.forEach {
            val m = OpenGLShaderModule(gl, "main", VulkanRenderer::class.java, "shaders/" + it)
            modules.put(m.shaderType, m.shader)
        }

        logger.info("Creating shader program from ${modules.keys.joinToString(", ")}")

        val program = GLProgram(gl, modules)

        return program
    }

    override fun display(pDrawable: GLAutoDrawable) {
        super.display(pDrawable)

        val fps = pDrawable.animator?.lastFPS ?: 0.0f

        window.setTitle("$applicationName [${this@OpenGLRenderer.javaClass.simpleName}] - $fps fps")

        this.joglDrawable = pDrawable

        if (mustRecreateFramebuffers) {
            renderpasses = prepareRenderpasses(renderConfig, window.width, window.height)

            gl.glClear(GL.GL_DEPTH_BUFFER_BIT or GL.GL_COLOR_BUFFER_BIT)
            gl.glViewport(0, 0, window.width, window.height)

            mustRecreateFramebuffers = false
        }

        this@OpenGLRenderer.render()
    }

    override fun setClearGLWindow(pClearGLWindow: ClearGLWindow) {
        cglWindow = pClearGLWindow
    }

    override fun getClearGLWindow(): ClearGLDisplayable {
        return cglWindow!!
    }

    override fun reshape(pDrawable: GLAutoDrawable,
                         pX: Int,
                         pY: Int,
                         pWidth: Int,
                         pHeight: Int) {
        var height = pHeight

        if (height == 0)
            height = 1

        this@OpenGLRenderer.reshape(pWidth, height)
    }

    override fun dispose(pDrawable: GLAutoDrawable) {
        pDrawable.animator?.stop()

        this.shouldClose = true
    }

    /**
     * Returns the default [Settings] for [OpenGLRenderer]
     *
     * Providing some sane defaults that may of course be overridden after
     * construction of the renderer.
     *
     * @return Default [Settings] values
     */
    private fun loadDefaultRendererSettings(ds: Settings): Settings {
        val base = OpenGLRenderer::class.java.simpleName

        ds.set("wantsFullscreen", false)
        ds.set("isFullscreen", false)

        ds.set("ssao.Active", true)
        ds.set("ssao.FilterRadius", GLVector(0.0f, 0.0f))
        ds.set("ssao.DistanceThreshold", 50.0f)
        ds.set("ssao.Algorithm", 1)

        ds.set("vr.Active", false)
        ds.set("vr.DoAnaglyph", false)
        ds.set("vr.IPD", 0.0f)
        ds.set("vr.EyeDivisor", 1)

        ds.set("hdr.Active", true)
        ds.set("hdr.Exposure", 10.0f)
        ds.set("hdr.Gamma", 2.2f)

        ds.set("sdf.MaxDistance", 10)

        ds.set("debug.DebugDeferredBuffers", false)
        ds.set("$base.PrintGPUStats", false)

        ds.set("Renderer.SupersamplingFactor", 1.0f)

        return ds
    }

    /**
     * Based on the [GLFramebuffer], devises a texture unit that can be used
     * for object textures.
     *
     * @param[type] texture type
     * @return Int of the texture unit to be used
     */
    fun GLFramebuffer.textureTypeToUnit(type: String): Int {
        return this.boundBufferNum + when (type) {
            "ambient" -> 0
            "diffuse" -> 1
            "specular" -> 2
            "normal" -> 3
            "alphamask" -> 4
            "displacement" -> 5
            else -> {
                logger.warn("Unknown texture type $type"); 10
            }
        }
    }

    private fun textureTypeToArrayName(type: String): String {
        return when (type) {
            "ambient" -> "ObjectTextures[0]"
            "diffuse" -> "ObjectTextures[1]"
            "specular" -> "ObjectTextures[2]"
            "normal" -> "ObjectTextures[3]"
            "alphamask" -> "ObjectTextures[4]"
            "displacement" -> "ObjectTextures[5]"
            else -> {
                logger.warn("Unknown texture type $type")
                "ObjectTextures[0]"
            }
        }
    }

    /**
     * Converts a [GeometryType] to an OpenGL geometry type
     *
     * @return Int of the OpenGL geometry type.
     */
    private fun GeometryType.toOpenGLType(): Int {
        return when (this) {
            GeometryType.TRIANGLE_STRIP -> GL.GL_TRIANGLE_STRIP
            GeometryType.POLYGON -> GL.GL_TRIANGLES
            GeometryType.TRIANGLES -> GL.GL_TRIANGLES
            GeometryType.TRIANGLE_FAN -> GL.GL_TRIANGLE_FAN
            GeometryType.POINTS -> GL.GL_POINTS
            GeometryType.LINE -> GL.GL_LINE_STRIP
            GeometryType.LINES_ADJACENCY -> GL4.GL_LINES_ADJACENCY
            GeometryType.LINE_STRIP_ADJACENCY -> GL4.GL_LINE_STRIP_ADJACENCY
        }
    }


    /**
     * Toggles deferred shading buffer debug view. Used for e.g.
     * [graphics.scenery.controls.behaviours.ToggleCommand]
     */
    @Suppress("UNUSED")
    fun toggleDebug() {
        if (!settings.get<Boolean>("debug.DebugDeferredBuffers")) {
            settings.set("debug.DebugDeferredBuffers", true)
        } else {
            settings.set("debug.DebugDeferredBuffers", false)
        }
    }

    /**
     * Toggles Screen-space ambient occlusion. Used for e.g.
     * [graphics.scenery.controls.behaviours.ToggleCommand].
     */
    @Suppress("UNUSED")
    fun toggleSSAO() {
        if (!settings.get<Boolean>("ssao.Active")) {
            settings.set("ssao.Active", true)
        } else {
            settings.set("ssao.Active", false)
        }
    }

    /**
     * Toggles HDR rendering. Used for e.g.
     * [graphics.scenery.controls.behaviours.ToggleCommand].
     */
    @Suppress("UNUSED")
    fun toggleHDR() {
        if (!settings.get<Boolean>("hdr.Active")) {
            settings.set("hdr.Active", true)
        } else {
            settings.set("hdr.Active", false)
        }
    }

    /**
     * Toggles VR on and off
     */
    @Suppress("UNUSED")
    fun toggleVR() {
        if (!settings.get<Boolean>("vr.Active")) {
            settings.set("vr.Active", true)
        } else {
            settings.set("vr.Active", false)
        }

        mustRecreateFramebuffers = true
    }

    /**
     * Increases the HDR exposure value. Used for e.g.
     * [graphics.scenery.controls.behaviours.ToggleCommand].
     */
    @Suppress("UNUSED")
    fun increaseExposure() {
        val exp: Float = settings.get<Float>("hdr.Exposure")
        settings.set("hdr.Exposure", exp + 0.05f)
    }

    /**
     * Decreases the HDR exposure value.Used for e.g.
     * [graphics.scenery.controls.behaviours.ToggleCommand].
     */
    @Suppress("UNUSED")
    fun decreaseExposure() {
        val exp: Float = settings.get<Float>("hdr.Exposure")
        settings.set("hdr.Exposure", exp - 0.05f)
    }

    /**
     * Increases the HDR gamma value. Used for e.g.
     * [graphics.scenery.controls.behaviours.ToggleCommand].
     */
    @Suppress("unused")
    fun increaseGamma() {
        val gamma: Float = settings.get<Float>("hdr.Gamma")
        settings.set("hdr.Gamma", gamma + 0.05f)
    }

    /**
     * Decreases the HDR gamma value. Used for e.g.
     * [graphics.scenery.controls.behaviours.ToggleCommand].
     */
    @Suppress("unused")
    fun decreaseGamma() {
        val gamma: Float = settings.get<Float>("hdr.Gamma")
        if (gamma - 0.05f >= 0) settings.set("hdr.Gamma", gamma - 0.05f)
    }

    /**
     * Toggles fullscreen. Used for e.g.
     * [graphics.scenery.controls.behaviours.ToggleCommand].
     */
    @Suppress("unused")
    fun toggleFullscreen() {
        if (!settings.get<Boolean>("wantsFullscreen")) {
            settings.set("wantsFullscreen", true)
        } else {
            settings.set("wantsFullscreen", false)
        }
    }

    /**
     * Convenience function that extracts the [OpenGLObjectState] from a [Node]'s
     * metadata.
     *
     * @param[node] The node of interest
     * @return The [OpenGLObjectState] of the [Node]
     */
    fun getOpenGLObjectStateFromNode(node: Node): OpenGLObjectState {
        return node.metadata["OpenGLRenderer"] as OpenGLObjectState
    }

    /**
     * Initializes the [Scene] with the [OpenGLRenderer], to be called
     * before [render].
     */
    override fun initializeScene() {
        scene.discover(scene, { it is HasGeometry })
            .forEach { it ->
                it.metadata.put("OpenGLRenderer", OpenGLObjectState())
                initializeNode(it)
            }

        scene.initialized = true
        logger.info("Initialized ${textures.size} textures")
    }

    private fun Display.wantsVR(): Display? {
        if (settings.get<Boolean>("vr.Active")) {
            return this@wantsVR
        } else {
            return null
        }
    }

    @Synchronized fun updateDefaultUBOs() {
        // find observer, if none, return
        val cam = scene.findObserver() ?: return

        if (!cam.lock.tryLock()) {
            return
        }

        val hmd = hub?.getWorkingHMDDisplay()?.wantsVR()

        cam.view = cam.getTransformation()

        buffers["VRParametersBuffer"]!!.reset()
        val vrUbo = OpenGLUBO(backingBuffer = buffers["VRParametersBuffer"]!!)

//        vrUbo.createUniformBuffer(memoryProperties)
        vrUbo.members.put("projection0", {
            (hmd?.getEyeProjection(0, cam.nearPlaneDistance, cam.farPlaneDistance)
                ?: cam.projection)
        })
        vrUbo.members.put("projection1", {
            (hmd?.getEyeProjection(1, cam.nearPlaneDistance, cam.farPlaneDistance)
                ?: cam.projection)
        })
        vrUbo.members.put("headShift", { hmd?.getHeadToEyeTransform(0) ?: GLMatrix.getIdentity() })
        vrUbo.members.put("IPD", { hmd?.getIPD() ?: 0.05f })
        vrUbo.members.put("stereoEnabled", { renderConfig.stereoEnabled.toInt() })

        vrUbo.populate()
        buffers["VRParametersBuffer"]!!.copyFromStagingBuffer()

        buffers["UBOBuffer"]!!.reset()
        buffers["ShaderPropertyBuffer"]!!.reset()

        sceneUBOs.forEach { node ->
            node.lock.withLock {
                if (!node.metadata.containsKey(this.javaClass.simpleName)) {
                    return@withLock
                }

                val s = node.metadata[this.javaClass.simpleName] as OpenGLObjectState

                val ubo = s.UBOs["Matrices"]!!

                node.updateWorld(true, false)

                var bufferOffset = ubo.backingBuffer!!.advance()
                ubo.offset = bufferOffset
                node.projection.copyFrom(cam.projection)
                node.view.copyFrom(cam.view)
                ubo.populate(offset = bufferOffset.toLong())

                val materialUbo = (node.metadata["OpenGLRenderer"]!! as OpenGLObjectState).UBOs["MaterialProperties"]!!
                bufferOffset = ubo.backingBuffer.advance()
                ubo.offset = bufferOffset

                materialUbo.populate(offset = bufferOffset.toLong())

//                if(s.requiredDescriptorSets.containsKey("ShaderProperties")) {
//                    val propertyUbo = s.UBOs["ShaderProperties"]!!.second
//                    // TODO: Correct buffer advancement
//                    val offset = propertyUbo.backingBuffer!!.advance()
//                    propertyUbo.populate(offset = offset.toLong())
//                    propertyUbo.offsets.put(0, offset)
//                }
            }
        }

        buffers["UBOBuffer"]!!.copyFromStagingBuffer()

        buffers["LightParametersBuffer"]!!.reset()

        val lights = scene.discover(scene, { n -> n is PointLight })

        val lightUbo = OpenGLUBO(backingBuffer = buffers["LightParametersBuffer"]!!)
        lightUbo.members.put("numLights", { lights.size })
        lightUbo.members.put("filler1", { 0.0f })
        lightUbo.members.put("filler2", { 0.0f })
        lightUbo.members.put("filler3", { 0.0f })

        lights.forEachIndexed { i, light ->
            val l = light as PointLight
            l.updateWorld(true, false)

            lightUbo.members.put("Linear-$i", { l.linear })
            lightUbo.members.put("Quadratic-$i", { l.quadratic })
            lightUbo.members.put("Intensity-$i", { l.intensity })
            lightUbo.members.put("Radius-$i", { -l.linear + Math.sqrt(l.linear * l.linear - 4 * l.quadratic * (1.0 - (256.0f / 5.0) * 100)).toFloat() })
            lightUbo.members.put("Position-$i", { l.position })
            lightUbo.members.put("Color-$i", { l.emissionColor })
            lightUbo.members.put("filler-$i", { 0.0f })
        }

//        lightUbo.createUniformBuffer(memoryProperties)
        lightUbo.populate()

        buffers["LightParametersBuffer"]!!.copyFromStagingBuffer()
        buffers["ShaderPropertyBuffer"]!!.copyFromStagingBuffer()

        cam.lock.unlock()
    }

    /**
     * Updates a [FontBoard], in case it's fontFamily or contents have changed.
     *
     * If a SDFFontAtlas has already been created for the given fontFamily, this will be used, and
     * cached as well. Else, a new one will be created.
     *
     * @param[board] The [FontBoard] instance.
     */
    private fun updateFontBoard(board: FontBoard) {
        val atlas = fontAtlas.getOrPut(board.fontFamily, { SDFFontAtlas(this.hub!!, board.fontFamily, maxDistance = settings.get<Int>("sdf.MaxDistance")) })
        val m = atlas.createMeshForString(board.text)

        board.vertices = m.vertices
        board.normals = m.normals
        board.indices = m.indices
        board.texcoords = m.texcoords

        board.metadata.remove("OpenGLRenderer")
        board.metadata.put("OpenGLRenderer", OpenGLObjectState())
        initializeNode(board)

        val s = getOpenGLObjectStateFromNode(board)
        val texture = textures.getOrPut("sdf-${board.fontFamily}", {
            val t = GLTexture(gl, GLTypeEnum.Float, 1,
                atlas.atlasWidth,
                atlas.atlasHeight,
                1,
                true,
                1)

            t.setClamp(false, false)
            t.copyFrom(atlas.getAtlas(),
                0,
                true)
            t
        })
        s.textures.put("diffuse", texture)
    }

    /**
     * Update a [Node]'s geometry, if needed and run it's preDraw() routine.
     *
     * @param[n] The Node to update and preDraw()
     */
    private fun preDrawAndUpdateGeometryForNode(n: Node) {
        if (n is HasGeometry) {
            if (n.dirty) {
                if (n.lock.tryLock()) {
                    if (n is FontBoard) {
                        updateFontBoard(n)
                    }

                    if (n.vertices.remaining() > 0 && n.normals.remaining() > 0) {
                        updateVertices(n)
                        updateNormals(n)
                    }

                    if (n.texcoords.remaining() > 0) {
                        updateTextureCoords(n)
                    }

                    if (n.indices.remaining() > 0) {
                        updateIndices(n)
                    }

                    n.dirty = false

                    n.lock.unlock()
                }
            }

            n.preDraw()
        }
    }

    /**
     * Set a [GLProgram]'s uniforms according to a [Node]'s [ShaderProperty]s.
     *
     * This functions uses reflection to query for a Node's declared fields and checks
     * whether they are marked up with the [ShaderProperty] annotation. If this is the case,
     * the [GLProgram]'s uniform with the same name as the field is set to its value.
     *
     * Currently limited to GLVector, GLMatrix, Int and Float properties.
     *
     * @param[n] The Node to search for [ShaderProperty]s
     * @param[program] The [GLProgram] used to render the Node
     */
    private fun setShaderPropertiesForNode(n: Node, program: GLProgram) {
        shaderPropertyCache
            .getOrPut(n.javaClass, { n.javaClass.declaredFields.filter { it.isAnnotationPresent(ShaderProperty::class.java) } })
            .forEach { property ->
                property.isAccessible = true
                val field = property.get(n)

                when (property.type) {
                    GLVector::class.java -> {
                        program.getUniform(property.name).setFloatVector(field as GLVector)
                    }

                    Int::class.java -> {
                        program.getUniform(property.name).setInt(field as Int)
                    }

                    Float::class.java -> {
                        program.getUniform(property.name).setFloat(field as Float)
                    }

                    GLMatrix::class.java -> {
                        program.getUniform(property.name).setFloatMatrix((field as GLMatrix).floatArray, false)
                    }

                    else -> {
                        logger.warn("Could not derive shader data type for @ShaderProperty ${n.javaClass.canonicalName}.${property.name} of type ${property.type}!")
                    }
                }
            }
    }

    /**
     * Renders the [Scene].
     *
     * The general rendering workflow works like this:
     *
     * 1) All visible elements of the Scene are gathered into the renderOrderList, based on their position
     * 2) Nodes that are an instance of another Node, as indicated by their instanceOf property, are gathered
     *    into the instanceGroups map.
     * 3) The eye-dependent geometry buffers are cleared, both color and depth buffers.
     * 4) First for the non-instanced Nodes, then for the instanced Nodes the following steps are executed
     *    for each eye:
     *
     *      i) The world state of the given Node is updated
     *     ii) Model, view, and model-view-projection matrices are calculated for each. If a HMD is present,
     *         the transformation coming from that is taken into account.
     *    iii) The Node's geometry is updated, if necessary.
     *     iv) The eye's geometry buffer is activated and the Node drawn into it.
     *
     * 5) The deferred shading pass is executed, together with eventual post-processing steps, such as SSAO.
     * 6) If HDR is active, Exposure/Gamma tone mapping is performed. Else, this part is skipped.
     * 7) The resulting image is drawn to the screen, or -- if a HMD is present -- submitted to the OpenVR
     *    compositor.
     */
    override fun render() {
        if (shouldClose) {
            joglDrawable?.animator?.stop()
            return
        }

        val vrActive = settings.get<Boolean>("vr.Active")

        if (scene.children.count() == 0 || renderpasses.isEmpty()) {
            logger.info("Waiting for initialization")
            Thread.sleep(200)
            return
        }

        updateDefaultUBOs()

        val renderOrderList = ArrayList<Node>()
        // find observer, or return immediately
        val cam: Camera = scene.findObserver() ?: return

        val hmd: Display? = if (hub!!.has(SceneryElement.HMDInput)
            && (hub!!.get(SceneryElement.HMDInput) as Display).initializedAndWorking()) {
            hub!!.get(SceneryElement.HMDInput) as Display
        } else {
            null
        }

        val tracker: TrackerInput? = if (hub!!.has(SceneryElement.HMDInput)
            && (hub!!.get(SceneryElement.HMDInput) as TrackerInput).initializedAndWorking()) {
            hub!!.get(SceneryElement.HMDInput) as TrackerInput
        } else {
            null
        }

        scene.discover(scene, { n -> n is Renderable && n is HasGeometry && n.visible }).forEach {
            renderOrderList.add(it)
        }

        val instanceGroups = renderOrderList.groupBy { it.instanceOf }

        val headToEye = eyes.map { i ->
            if (hmd == null) {
                GLMatrix.getTranslation(settings.get<Float>("vr.IPD") * -1.0f * Math.pow(-1.0, 1.0 * i).toFloat(), 0.0f, 0.0f).transpose()
            } else {
                hmd.getHeadToEyeTransform(i).clone()
            }
        }

        val pose = tracker?.getPose() ?: GLMatrix.getIdentity()
        cam.view = cam.getTransformation()
        val projection = eyes.map { i ->
            if (vrActive) {
                hmd?.getEyeProjection(i, cam.nearPlaneDistance, cam.farPlaneDistance) ?: cam.projection
            } else {
                cam.projection
            }
        }

        buffers["ShaderParameterBuffer"]!!.reset()

        flow.forEach { t ->
            val target = renderpasses[t]!!

            target.updateShaderParameters()

            if(target.output.isNotEmpty()) {
                target.output.values.first().setDrawBuffers(gl)
            } else {
                gl.glBindFramebuffer(GL.GL_FRAMEBUFFER, 0)
            }
            target.inputs.values.forEach { it.bindTexturesToUnitsWithOffset(gl, 0) }

            gl.glClearColor(
                target.openglMetadata.clearValues.clearColor.x(),
                target.openglMetadata.clearValues.clearColor.y(),
                target.openglMetadata.clearValues.clearColor.z(),
                target.openglMetadata.clearValues.clearColor.w())

            target.output.values.forEach { if(it.hasDepthAttachment(gl)) { gl.glClear(GL.GL_DEPTH_BUFFER_BIT) } }
            gl.glClear(GL.GL_COLOR_BUFFER_BIT)

            gl.glViewport(
                target.openglMetadata.viewport.area.offsetX,
                target.openglMetadata.viewport.area.offsetY,
                target.openglMetadata.viewport.area.width,
                target.openglMetadata.viewport.area.height)

            gl.glScissor(
                target.openglMetadata.scissor.offsetX,
                target.openglMetadata.scissor.offsetY,
                target.openglMetadata.scissor.width,
                target.openglMetadata.scissor.height
            )

            gl.glDepthRange(
                target.openglMetadata.viewport.minDepth.toDouble(),
                target.openglMetadata.viewport.maxDepth.toDouble())

            if (target.passConfig.type == RenderConfigReader.RenderpassType.geometry) {

                instanceGroups[null]?.forEach nonInstancedDrawing@ { n ->
                    if (n in instanceGroups.keys) {
                        return@nonInstancedDrawing
                    }

                    if (!n.metadata.containsKey("OpenGLRenderer")) {
                        n.metadata.put("OpenGLRenderer", OpenGLObjectState())
                        initializeNode(n)
                    }

                    var s = getOpenGLObjectStateFromNode(n)

                    if (n.material.needsTextureReload) {
                        s = loadTexturesForNode(n, s)
                    }

                    if (n is Skybox) {
                        gl.glCullFace(GL.GL_FRONT)
                        gl.glDepthFunc(GL.GL_LEQUAL)
                    }

                    preDrawAndUpdateGeometryForNode(n)

                    val shader = if (s.shader != null) {
                        s.shader!!
                    } else {
                        target.defaultShader!!
                    }

                    shader.bind()

                    gl.glBindBuffer(GL4.GL_UNIFORM_BUFFER, buffers["UBOBuffer"]!!.id[0])

                    var binding = 0
                    s.UBOs.forEach { name, ubo ->
                        val index = gl.glGetUniformBlockIndex(shader.id, name)
                        gl.glUniformBlockBinding(shader.id, index, binding)
                        gl.glBindBufferRange(GL4.GL_UNIFORM_BUFFER, index, ubo.backingBuffer!!.id[0], 1L * ubo.offset, 1L * ubo.getSize())

                        if(index == -1) {
                            logger.error("Failed to bind UBO $name for ${n.name} to $binding")
                        }
                        binding++
                    }

                    drawNode(n)
                }

                instanceGroups.keys.filterNotNull().forEach instancedDrawing@ { n ->
                    var start = System.nanoTime()

                    if (!n.metadata.containsKey("OpenGLRenderer")) {
                        n.metadata.put("OpenGLRenderer", OpenGLObjectState())
                        initializeNode(n)
                    }

                    val s = getOpenGLObjectStateFromNode(n)
                    val instances = instanceGroups[n]!!

                    logger.trace("${n.name} has additional instance buffers: ${s.additionalBufferIds.keys}")
                    logger.trace("${n.name} instancing: Instancing group size is ${instances.size}")

                    instances.forEach { node ->
                        if (!node.metadata.containsKey("OpenGLRenderer")) {
                            node.metadata.put("OpenGLRenderer", OpenGLObjectState())
                            initializeNode(node)
                        }

                        node.updateWorld(true, false)
                    }

                    val matrixSize = 4 * 4
                    val models = ArrayList<Float>(matrixSize * instances.size)
                    val modelviews = ArrayList<Float>(matrixSize * instances.size)
                    val modelviewprojs = ArrayList<Float>(matrixSize * instances.size)

                    eyes.forEach {
                        eye ->

                        models.clear()
                        modelviews.clear()
                        modelviewprojs.clear()

                        instances.forEach { node ->
                            node.modelView.copyFrom(headToEye[eye])
                            node.modelView.mult(pose)
                            node.modelView.mult(cam.view)
                            node.modelView.mult(node.world)

                            node.mvp.copyFrom(projection[eye])
                            node.mvp.mult(node.modelView)

                            node.projection.copyFrom(projection[eye])
                            node.view.copyFrom(cam.view)

                            models.addAll(node.world.floatArray.asSequence())
                            modelviews.addAll(node.modelView.floatArray.asSequence())
                            modelviewprojs.addAll(node.mvp.floatArray.asSequence())
                        }

                        logger.trace("${n.name} instancing: Collected ${modelviewprojs.size / matrixSize} MVPs in ${(System.nanoTime() - start) / 10e6}ms")

                        // bind instance buffers
                        start = System.nanoTime()
                        val matrixSizeBytes: Long = 1L * Buffers.SIZEOF_FLOAT * matrixSize * instances.size

                        gl.gL4.glBindVertexArray(s.mVertexArrayObject[0])

                        gl.gL4.glBindBuffer(GL.GL_ARRAY_BUFFER, s.additionalBufferIds["Model"]!!)
                        gl.gL4.glBufferData(GL.GL_ARRAY_BUFFER, matrixSizeBytes,
                            FloatBuffer.wrap(models.toFloatArray()), GL.GL_DYNAMIC_DRAW)

                        gl.gL4.glBindBuffer(GL.GL_ARRAY_BUFFER, s.additionalBufferIds["ModelView"]!!)
                        gl.gL4.glBufferData(GL.GL_ARRAY_BUFFER, matrixSizeBytes,
                            FloatBuffer.wrap(modelviews.toFloatArray()), GL.GL_DYNAMIC_DRAW)

                        gl.gL4.glBindBuffer(GL.GL_ARRAY_BUFFER, s.additionalBufferIds["MVP"]!!)
                        gl.gL4.glBufferData(GL.GL_ARRAY_BUFFER, matrixSizeBytes,
                            FloatBuffer.wrap(modelviewprojs.toFloatArray()), GL.GL_DYNAMIC_DRAW)

                        logger.trace("${n.name} instancing: Updated matrix buffers in ${(System.nanoTime() - start) / 10e6}ms")

                        preDrawAndUpdateGeometryForNode(n)

                        target.output.values.first().setDrawBuffers(gl)
                        drawNodeInstanced(n, count = instances.size)
                    }
                }
            } else {
                gl.glDisable(GL.GL_CULL_FACE)
                gl.glDisable(GL.GL_BLEND)
                gl.glDisable(GL.GL_DEPTH_TEST)

                gl.glBindBuffer(GL4.GL_UNIFORM_BUFFER, buffers["ShaderParameterBuffer"]!!.id[0])

                target.defaultShader?.let { shader ->
                    shader.bind()

                    var binding = 0
                    target.UBOs.forEach { name, ubo ->
                        val actualName = if(name.contains("ShaderParameters")) {
                            "ShaderParameters"
                        } else {
                            name
                        }

                        val index = gl.glGetUniformBlockIndex(shader.id, actualName)
                        gl.glUniformBlockBinding(shader.id, index, binding)
                        gl.glBindBufferRange(GL4.GL_UNIFORM_BUFFER, index, ubo.backingBuffer!!.id[0], 1L * ubo.offset, 1L * ubo.getSize())

                        if(index == -1) {
                            logger.error("Failed to bind shader parameter UBO $actualName for ${target.passName} to $binding")
                        }
                        binding++
                    }

                    renderFullscreenQuad(shader)
                }
            }
        }

        logger.info("Error: ${gl.glGetError()}")

        embedIn?.let { embedPanel ->
            if (shouldClose) {
                return
            }

            readIndex = (readIndex + 1) % 2
            updateIndex = (readIndex + 1) % 2

            if (pbos[0] == 0 || pbos[1] == 0) {
                gl.glGenBuffers(2, pbos, 0)

                gl.glBindBuffer(GL4.GL_PIXEL_PACK_BUFFER, pbos[0])
                gl.glBufferData(GL4.GL_PIXEL_PACK_BUFFER, embedPanel.width.toInt() * embedPanel.height.toInt() * 4L, null, GL4.GL_STREAM_READ)

                gl.glBindBuffer(GL4.GL_PIXEL_PACK_BUFFER, pbos[1])
                gl.glBufferData(GL4.GL_PIXEL_PACK_BUFFER, embedPanel.width.toInt() * embedPanel.height.toInt() * 4L, null, GL4.GL_STREAM_READ)

                gl.glBindBuffer(GL4.GL_PIXEL_PACK_BUFFER, 0)
            }

            gl.glBindBuffer(GL4.GL_PIXEL_PACK_BUFFER, pbos[readIndex])

            gl.glReadBuffer(GL4.GL_FRONT)
            gl.glReadPixels(0, 0, window.width, window.height, GL4.GL_BGRA, GL4.GL_UNSIGNED_BYTE, 0)

            gl.glBindBuffer(GL4.GL_PIXEL_PACK_BUFFER, pbos[updateIndex])

            val buffer = gl.glMapBuffer(GL4.GL_PIXEL_PACK_BUFFER, GL4.GL_READ_ONLY)
            if (buffer != null) {
                Platform.runLater {
                    if (!mustRecreateFramebuffers) embedPanel.update(buffer)
                }
                gl.glUnmapBuffer(GL4.GL_PIXEL_PACK_BUFFER)
            }

            gl.glBindBuffer(GL4.GL_PIXEL_PACK_BUFFER, 0)

            resizeHandler.queryResize()
        }

        if (screenshotRequested && joglDrawable != null) {
            try {
                val readBufferUtil = AWTGLReadBufferUtil(joglDrawable!!.glProfile, false)
                val image = readBufferUtil.readPixelsToBufferedImage(gl, true)
                val file = File(System.getProperty("user.home"), "Desktop" + File.separator + "$applicationName - ${SimpleDateFormat("yyyy-MM-dd HH.mm.ss").format(Date())}.png")

                ImageIO.write(image, "png", file)
                logger.info("Screenshot saved to ${file.absolutePath}")
            } catch (e: Exception) {
                System.err.println("Unable to take screenshot: ")
                e.printStackTrace()
            }

            screenshotRequested = false
        }
    }

    /**
     * Renders a fullscreen quad, using from an on-the-fly generated
     * Node that is saved in [nodeStore], with the [GLProgram]'s ID.
     *
     * @param[program] The [GLProgram] to draw into the fullscreen quad.
     */
    fun renderFullscreenQuad(program: GLProgram) {
        val quad: Node
        val quadName = "fullscreenQuad-${program.id}"

        if (!nodeStore.containsKey(quadName)) {
            quad = Plane(GLVector(1.0f, 1.0f, 0.0f))
            val material = OpenGLMaterial()

            material.program = program

            quad.material = material
            quad.metadata.put("OpenGLRenderer", OpenGLObjectState())
            initializeNode(quad)

            nodeStore.put(quadName, quad)
        } else {
            quad = nodeStore[quadName]!!
        }

        (quad.material as OpenGLMaterial).program = program

        drawNode(quad)
        program.gl.gL4.glBindTexture(GL.GL_TEXTURE_2D, 0)
    }

    /**
     * Initializes a given [Node].
     *
     * This function initializes a Node, equipping its metadata with an [OpenGLObjectState],
     * generating VAOs and VBOs. If the Node has a [Material] assigned, a [GLProgram] fitting
     * this Material will be used. Else, a default GLProgram will be used.
     *
     * For the assigned Material case, the GLProgram is derived either from the class name of the
     * Node (if useClassDerivedShader is set), or from a set [ShaderPreference] which may define
     * the whole shader pipeline for the Node.
     *
     * If the [Node] implements [HasGeometry], it's geometry is also initialized by this function.
     *
     * @param[node]: The [Node] to initialise.
     * @return True if the initialisation went alright, False if it failed.
     */
    fun initializeNode(node: Node): Boolean {
        val s: OpenGLObjectState

        if (node.instanceOf == null) {
            s = node.metadata["OpenGLRenderer"] as OpenGLObjectState
        } else {
            s = node.instanceOf!!.metadata["OpenGLRenderer"] as OpenGLObjectState
            node.metadata["OpenGLRenderer"] = s

            if (!s.initialized) {
                logger.trace("Instance not yet initialized, doing now...")
                initializeNode(node.instanceOf!!)
            }

            if (!s.additionalBufferIds.containsKey("Model") || !s.additionalBufferIds.containsKey("ModelView") || !s.additionalBufferIds.containsKey("MVP")) {
                logger.trace("${node.name} triggered instance buffer creation")
                createInstanceBuffer(node.instanceOf!!)
                logger.trace("---")
            }
            return true
        }

        if (s.initialized) {
            return true
        }

        // generate VAO for attachment of VBO and indices
        gl.gL3.glGenVertexArrays(1, s.mVertexArrayObject, 0)

        // generate three VBOs for coords, normals, texcoords
        gl.glGenBuffers(3, s.mVertexBuffers, 0)
        gl.glGenBuffers(1, s.mIndexBuffer, 0)

        if (node.material !is OpenGLMaterial || (node.material as OpenGLMaterial).program == null) {
            if (node.useClassDerivedShader) {
                val javaClass = node.javaClass.simpleName
                val className = javaClass.substring(javaClass.indexOf(".") + 1)

                val shaders = arrayOf(".vert", ".geom", ".tese", ".tesc", ".frag", ".comp")
                    .map { "shaders/$className$it" }
                    .filter {
                        OpenGLRenderer::class.java.getResource(it) != null
                    }

                s.program = GLProgram.buildProgram(gl, OpenGLRenderer::class.java,
                    shaders.toTypedArray())
            } else if (node.metadata.filter { it.value is ShaderPreference }.isNotEmpty()) {
                val prefs = node.metadata["ShaderPreference"] as ShaderPreference

                if (prefs.parameters.size > 0) {
                    s.program = GLProgram.buildProgram(gl, node.javaClass,
                        prefs.shaders.toTypedArray(), prefs.parameters)
                } else {
                    try {
                        s.program = GLProgram.buildProgram(gl, node.javaClass,
                            prefs.shaders.toTypedArray())
                    } catch(e: NullPointerException) {
                        s.program = GLProgram.buildProgram(gl, this.javaClass,
                            prefs.shaders.map { "shaders/" + it }.toTypedArray())
                    }

                }
            } else {
                s.program = GLProgram.buildProgram(gl, OpenGLRenderer::class.java,
                    arrayOf("shaders/DefaultDeferred.vert", "shaders/DefaultDeferred.frag"))
            }
        } else {
            s.program = (node.material as OpenGLMaterial).program
        }

        if (node is HasGeometry) {
            node.lock.tryLock(100, TimeUnit.MILLISECONDS)
            if (node.lock.tryLock()) {
                setVerticesAndCreateBufferForNode(node)
                setNormalsAndCreateBufferForNode(node)

                if (node.texcoords.limit() > 0) {
                    setTextureCoordsAndCreateBufferForNode(node)
                }

                if (node.indices.limit() > 0) {
                    setIndicesAndCreateBufferForNode(node)
                }

                node.lock.unlock()
            }
        }

        val matricesUbo = OpenGLUBO(backingBuffer = buffers["UBOBuffer"])
        with(matricesUbo) {
            name = "Matrices"
            members.put("ModelMatrix", { node.world })
            members.put("ViewMatrix", { node.view })
            members.put("NormalMatrix", { node.world.inverse.transpose() })
            members.put("ProjectionMatrix", { node.projection })
            members.put("CamPosition", { scene.activeObserver?.position ?: GLVector(0.0f, 0.0f, 0.0f) })
            members.put("isBillboard", { node.isBillboard.toInt() })

            sceneUBOs.add(node)

            s.UBOs.put("Matrices", this)
        }

        loadTexturesForNode(node, s)

        val materialUbo = OpenGLUBO(backingBuffer = buffers["UBOBuffer"])
        var materialType = 0

        if (node.material.textures.containsKey("ambient") && !s.defaultTexturesFor.contains("ambient")) {
            materialType = materialType or MATERIAL_HAS_AMBIENT
        }

        if (node.material.textures.containsKey("diffuse") && !s.defaultTexturesFor.contains("diffuse")) {
            materialType = materialType or MATERIAL_HAS_DIFFUSE
        }

        if (node.material.textures.containsKey("specular") && !s.defaultTexturesFor.contains("specular")) {
            materialType = materialType or MATERIAL_HAS_SPECULAR
        }

        if (node.material.textures.containsKey("normal") && !s.defaultTexturesFor.contains("normal")) {
            materialType = materialType or MATERIAL_HAS_NORMAL
        }

        if (node.material.textures.containsKey("alphamask") && !s.defaultTexturesFor.contains("alphamask")) {
            materialType = materialType or MATERIAL_HAS_ALPHAMASK
        }

        with(materialUbo) {
            name = "MaterialProperties"
            members.put("Ka", { node.material.ambient })
            members.put("Kd", { node.material.diffuse })
            members.put("Ks", { node.material.specular })
            members.put("Shininess", { node.material.specularExponent })
            members.put("materialType", { materialType })

            s.UBOs.put("MaterialProperties", this)
        }

        s.initialized = true
        node.initialized = true
        node.metadata["VulkanRenderer"] = s

        s.initialized = true
        return true
    }

    /**
     * Parallel forEach implementation for HashMaps.
     *
     * @param[maxThreads] Maximum number of parallel threads
     * @param[action] Lambda containing the action to be executed for each key, value pair.
     */
    @Suppress("unused")
    fun <K, V> HashMap<K, V>.forEachParallel(maxThreads: Int = 5, action: ((K, V) -> Unit)) {
        val iterator = this.asSequence().iterator()
        var threadCount = 0

        while (iterator.hasNext()) {
            val current = iterator.next()

            thread {
                threadCount++
                while (threadCount > maxThreads) {
                    Thread.sleep(50)
                }

                action.invoke(current.key, current.value)
                threadCount--
            }
        }
    }

    /**
     * Loads textures for a [Node]. The textures either come from a [Material.transferTextures] buffer,
     * or from a file. This is indicated by stating fromBuffer:bufferName in the textures hash map.
     *
     * @param[node] The [Node] to load textures for.
     * @param[s] The [Node]'s [OpenGLObjectState]
     */
    private fun loadTexturesForNode(node: Node, s: OpenGLObjectState): OpenGLObjectState {
        if (node.lock.tryLock()) {
            node.material.textures.forEach {
                type, texture ->
                if (!textures.containsKey(texture) || node.material.needsTextureReload) {
                    logger.trace("Loading texture $texture for ${node.name}")
                    val glTexture = if (texture.startsWith("fromBuffer:")) {
                        val gt = node.material.transferTextures[texture.substringAfter("fromBuffer:")]

                        val t = GLTexture(gl, gt!!.type, gt.channels,
                            gt.dimensions.x().toInt(),
                            gt.dimensions.y().toInt(),
                            1,
                            true,
                            1)

                        t.setClamp(!gt.repeatS, !gt.repeatT)
                        t.copyFrom(gt.contents)
                        t
                    } else {
                        GLTexture.loadFromFile(gl, texture, true, 1)
                    }

                    s.textures.put(type, glTexture)
                    textures.put(texture, glTexture)
                } else {
                    s.textures.put(type, textures[texture]!!)
                }
            }

            arrayOf("ambient", "diffuse", "specular", "normal", "alphamask", "displacement").forEach {
                if (!s.textures.containsKey(it)) {
//                    s.textures.putIfAbsent(it, textureCache["DefaultTexture"]!!)
                    s.defaultTexturesFor.add(it)
                }
            }

            node.material.needsTextureReload = false
            s.initialized = true
            node.lock.unlock()
            return s
        } else {
            return s
        }
    }

    /**
     * Reshape the renderer's viewports
     *
     * This routine is called when a change in window size is detected, e.g. when resizing
     * it manually or toggling fullscreen. This function updates the sizes of all used
     * geometry buffers and will also create new buffers in case vr.Active is changed.
     *
     * This function also clears color and depth buffer bits.
     *
     * @param[newWidth] The resized window's width
     * @param[newHeight] The resized window's height
     */
    override fun reshape(newWidth: Int, newHeight: Int) {
        if (!initialized) {
            return
        }

        lastResizeTimer.cancel()

        lastResizeTimer = Timer()
        lastResizeTimer.schedule(object : TimerTask() {
            override fun run() {
                window.width = newWidth
                window.height = newHeight

                mustRecreateFramebuffers = true
            }
        }, WINDOW_RESIZE_TIMEOUT)
    }

    /**
     * Creates an instance buffer for a [Node]'s model, view and mvp matrices.
     *
     * @param[node] The [Node] to create the instance buffer for.
     */
    private fun createInstanceBuffer(node: Node) {
        val s = getOpenGLObjectStateFromNode(node)

        val matrixSize = 4 * 4
        val vectorSize = 4
        val locationBase = 3
        val matrices = arrayOf("Model", "ModelView", "MVP")
        val i = IntArray(matrices.size)

        gl.gL4.glBindVertexArray(s.mVertexArrayObject[0])
        gl.gL4.glGenBuffers(matrices.size, i, 0)

        i.forEachIndexed { locationOffset, bufferId ->
            s.additionalBufferIds.put(matrices[locationOffset], bufferId)

            gl.gL4.glBindBuffer(GL.GL_ARRAY_BUFFER, bufferId)

            for (offset in 0..3) {
                val l = locationBase + locationOffset * vectorSize + offset

                val pointerOffsetBytes: Long = 1L * Buffers.SIZEOF_FLOAT * offset * vectorSize
                val matrixSizeBytes = matrixSize * Buffers.SIZEOF_FLOAT

                gl.gL4.glEnableVertexAttribArray(l)
                gl.gL4.glVertexAttribPointer(l, vectorSize, GL.GL_FLOAT, false,
                    matrixSizeBytes, pointerOffsetBytes)
                gl.gL4.glVertexAttribDivisor(l, 1)
            }
        }

        gl.gL4.glBindBuffer(GL.GL_ARRAY_BUFFER, 0)
        gl.gL4.glBindVertexArray(0)
    }

    /**
     * Creates VAOs and VBO for a given [Node]'s vertices.
     *
     * @param[node] The [Node] to create the VAO/VBO for.
     */
    fun setVerticesAndCreateBufferForNode(node: Node) {
        val s = getOpenGLObjectStateFromNode(node)
        val pVertexBuffer: FloatBuffer = (node as HasGeometry).vertices

        s.mStoredPrimitiveCount = pVertexBuffer.remaining() / node.vertexSize

        gl.gL3.glBindVertexArray(s.mVertexArrayObject[0])
        gl.glBindBuffer(GL.GL_ARRAY_BUFFER, s.mVertexBuffers[0])

        gl.gL3.glEnableVertexAttribArray(0)
        gl.glBufferData(GL.GL_ARRAY_BUFFER,
            (pVertexBuffer.remaining() * (java.lang.Float.SIZE / java.lang.Byte.SIZE)).toLong(),
            pVertexBuffer,
            if (s.isDynamic)
                GL.GL_DYNAMIC_DRAW
            else
                GL.GL_STATIC_DRAW)

        gl.gL3.glVertexAttribPointer(0,
            node.vertexSize,
            GL.GL_FLOAT,
            false,
            0,
            0)

        gl.gL3.glBindVertexArray(0)
        gl.glBindBuffer(GL.GL_ARRAY_BUFFER, 0)
    }

    /**
     * Updates a [Node]'s vertices.
     *
     * @param[node] The [Node] to update the vertices for.
     */
    fun updateVertices(node: Node) {
        val s = getOpenGLObjectStateFromNode(node)
        val pVertexBuffer: FloatBuffer = (node as HasGeometry).vertices

        s.mStoredPrimitiveCount = pVertexBuffer.remaining() / node.vertexSize

        gl.gL3.glBindVertexArray(s.mVertexArrayObject[0])
        gl.glBindBuffer(GL.GL_ARRAY_BUFFER, s.mVertexBuffers[0])

        gl.gL3.glEnableVertexAttribArray(0)
        gl.glBufferData(GL.GL_ARRAY_BUFFER,
            (pVertexBuffer.remaining() * (java.lang.Float.SIZE / java.lang.Byte.SIZE)).toLong(),
            pVertexBuffer,
            GL.GL_DYNAMIC_DRAW)

        gl.gL3.glVertexAttribPointer(0,
            node.vertexSize,
            GL.GL_FLOAT,
            false,
            0,
            0)

        gl.gL3.glBindVertexArray(0)
        gl.glBindBuffer(GL.GL_ARRAY_BUFFER, 0)
    }

    /**
     * Creates VAOs and VBO for a given [Node]'s normals.
     *
     * @param[node] The [Node] to create the normals VBO for.
     */
    fun setNormalsAndCreateBufferForNode(node: Node) {
        val s = getOpenGLObjectStateFromNode(node)
        val pNormalBuffer: FloatBuffer = (node as HasGeometry).normals

        gl.gL3.glBindVertexArray(s.mVertexArrayObject[0])
        gl.glBindBuffer(GL.GL_ARRAY_BUFFER, s.mVertexBuffers[1])

        if (pNormalBuffer.limit() > 0) {
            gl.gL3.glEnableVertexAttribArray(1)
            gl.glBufferData(GL.GL_ARRAY_BUFFER,
                (pNormalBuffer.remaining() * (java.lang.Float.SIZE / java.lang.Byte.SIZE)).toLong(),
                pNormalBuffer,
                if (s.isDynamic)
                    GL.GL_DYNAMIC_DRAW
                else
                    GL.GL_STATIC_DRAW)

            gl.gL3.glVertexAttribPointer(1,
                node.vertexSize,
                GL.GL_FLOAT,
                false,
                0,
                0)

        }
        gl.gL3.glBindVertexArray(0)
        gl.glBindBuffer(GL.GL_ARRAY_BUFFER, 0)
    }

    /**
     * Updates a given [Node]'s normals.
     *
     * @param[node] The [Node] whose normals need updating.
     */
    fun updateNormals(node: Node) {
        val s = getOpenGLObjectStateFromNode(node)
        val pNormalBuffer: FloatBuffer = (node as HasGeometry).normals

        gl.gL3.glBindVertexArray(s.mVertexArrayObject[0])
        gl.glBindBuffer(GL.GL_ARRAY_BUFFER, s.mVertexBuffers[1])

        gl.gL3.glEnableVertexAttribArray(1)
        gl.glBufferData(GL.GL_ARRAY_BUFFER,
            (pNormalBuffer.remaining() * (java.lang.Float.SIZE / java.lang.Byte.SIZE)).toLong(),
            pNormalBuffer,
            if (s.isDynamic)
                GL.GL_DYNAMIC_DRAW
            else
                GL.GL_STATIC_DRAW)

        gl.gL3.glVertexAttribPointer(1,
            node.vertexSize,
            GL.GL_FLOAT,
            false,
            0,
            0)

        gl.gL3.glBindVertexArray(0)
        gl.glBindBuffer(GL.GL_ARRAY_BUFFER, 0)
    }

    /**
     * Creates VAOs and VBO for a given [Node]'s texcoords.
     *
     * @param[node] The [Node] to create the texcoord VBO for.
     */
    fun setTextureCoordsAndCreateBufferForNode(node: Node) {
        val s = getOpenGLObjectStateFromNode(node)
        val pTextureCoordsBuffer: FloatBuffer = (node as HasGeometry).texcoords

        gl.gL3.glBindVertexArray(s.mVertexArrayObject[0])
        gl.glBindBuffer(GL.GL_ARRAY_BUFFER, s.mVertexBuffers[2])

        gl.gL3.glEnableVertexAttribArray(2)
        gl.glBufferData(GL.GL_ARRAY_BUFFER,
            (pTextureCoordsBuffer.remaining() * (java.lang.Float.SIZE / java.lang.Byte.SIZE)).toLong(),
            pTextureCoordsBuffer,
            if (s.isDynamic)
                GL.GL_DYNAMIC_DRAW
            else
                GL.GL_STATIC_DRAW)

        gl.gL3.glVertexAttribPointer(2,
            node.texcoordSize,
            GL.GL_FLOAT,
            false,
            0,
            0)

        gl.gL3.glBindVertexArray(0)
        gl.glBindBuffer(GL.GL_ARRAY_BUFFER, 0)
    }

    /**
     * Updates a given [Node]'s texcoords.
     *
     * @param[node] The [Node] whose texcoords need updating.
     */
    fun updateTextureCoords(node: Node) {
        val s = getOpenGLObjectStateFromNode(node)
        val pTextureCoordsBuffer: FloatBuffer = (node as HasGeometry).texcoords

        gl.gL3.glBindVertexArray(s.mVertexArrayObject[0])
        gl.gL3.glBindBuffer(GL.GL_ARRAY_BUFFER,
            s.mVertexBuffers[2])

        gl.gL3.glEnableVertexAttribArray(2)
        gl.glBufferData(GL.GL_ARRAY_BUFFER,
            (pTextureCoordsBuffer.remaining() * (java.lang.Float.SIZE / java.lang.Byte.SIZE)).toLong(),
            pTextureCoordsBuffer,
            if (s.isDynamic)
                GL.GL_DYNAMIC_DRAW
            else
                GL.GL_STATIC_DRAW)

        gl.gL3.glVertexAttribPointer(2,
            node.texcoordSize,
            GL.GL_FLOAT,
            false,
            0,
            0)

        gl.gL3.glBindVertexArray(0)
        gl.glBindBuffer(GL.GL_ARRAY_BUFFER, 0)
    }

    /**
     * Creates a index buffer for a given [Node]'s indices.
     *
     * @param[node] The [Node] to create the index buffer for.
     */
    fun setIndicesAndCreateBufferForNode(node: Node) {
        val s = getOpenGLObjectStateFromNode(node)
        val pIndexBuffer: IntBuffer = (node as HasGeometry).indices

        s.mStoredIndexCount = pIndexBuffer.remaining()

        gl.gL3.glBindVertexArray(s.mVertexArrayObject[0])
        gl.glBindBuffer(GL.GL_ELEMENT_ARRAY_BUFFER, s.mIndexBuffer[0])

        gl.glBufferData(GL.GL_ELEMENT_ARRAY_BUFFER,
            (pIndexBuffer.remaining() * (Integer.SIZE / java.lang.Byte.SIZE)).toLong(),
            pIndexBuffer,
            if (s.isDynamic)
                GL.GL_DYNAMIC_DRAW
            else
                GL.GL_STATIC_DRAW)

        gl.gL3.glBindVertexArray(0)
        gl.glBindBuffer(GL.GL_ELEMENT_ARRAY_BUFFER, 0)
    }

    /**
     * Updates a given [Node]'s indices.
     *
     * @param[node] The [Node] whose indices need updating.
     */
    fun updateIndices(node: Node) {
        val s = getOpenGLObjectStateFromNode(node)
        val pIndexBuffer: IntBuffer = (node as HasGeometry).indices

        s.mStoredIndexCount = pIndexBuffer.remaining()

        gl.gL3.glBindVertexArray(s.mVertexArrayObject[0])
        gl.glBindBuffer(GL.GL_ELEMENT_ARRAY_BUFFER, s.mIndexBuffer[0])

        gl.glBufferSubData(GL.GL_ELEMENT_ARRAY_BUFFER,
            0,
            (pIndexBuffer.remaining() * (Integer.SIZE / java.lang.Byte.SIZE)).toLong(),
            pIndexBuffer)

        gl.gL3.glBindVertexArray(0)
        gl.glBindBuffer(GL.GL_ELEMENT_ARRAY_BUFFER, 0)
    }

    /**
     * Draws a given [Node], either in element or in index draw mode.
     *
     * @param[node] The node to be drawn.
     * @param[offset] offset in the array or index buffer.
     */
    fun drawNode(node: Node, offset: Int = 0) {
        val s = getOpenGLObjectStateFromNode(node)

        if (s.mStoredIndexCount == 0 && s.mStoredPrimitiveCount == 0) {
            return
        }

        s.program?.use(gl)

        gl.gL3.glBindVertexArray(s.mVertexArrayObject[0])

        if (s.mStoredIndexCount > 0) {
            gl.glBindBuffer(GL.GL_ELEMENT_ARRAY_BUFFER,
                s.mIndexBuffer[0])
            gl.glDrawElements((node as HasGeometry).geometryType.toOpenGLType(),
                s.mStoredIndexCount,
                GL.GL_UNSIGNED_INT,
                offset.toLong())

            gl.glBindBuffer(GL.GL_ELEMENT_ARRAY_BUFFER, 0)
        } else {
            gl.glDrawArrays((node as HasGeometry).geometryType.toOpenGLType(), offset, s.mStoredPrimitiveCount)
        }

        gl.gL3.glUseProgram(0)
        gl.gL4.glBindVertexArray(0)
    }

    /**
     * Draws a given instanced [Node] either in element or in index draw mode.
     *
     * @param[node] The node to be drawn.
     * @param[count] The number of instances to be drawn.
     * @param[offset] offset in the array or index buffer.
     */
    fun drawNodeInstanced(node: Node, count: Int, offset: Long = 0) {
        val s = getOpenGLObjectStateFromNode(node)

        s.program?.use(gl)

        gl.gL4.glBindVertexArray(s.mVertexArrayObject[0])

        if (s.mStoredIndexCount > 0) {
            gl.gL4.glDrawElementsInstanced(
                (node as HasGeometry).geometryType.toOpenGLType(),
                s.mStoredIndexCount,
                GL.GL_UNSIGNED_INT,
                offset,
                count)
        } else {
            gl.gL4.glDrawArraysInstanced(
                (node as HasGeometry).geometryType.toOpenGLType(),
                0, s.mStoredPrimitiveCount, count)

        }

        gl.gL4.glUseProgram(0)
        gl.gL4.glBindVertexArray(0)
    }

    override fun screenshot() {
        screenshotRequested = true
    }

    override fun close() {
        libspirvcrossj.finalizeProcess()
    }
}
