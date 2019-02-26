package graphics.scenery.utils;

/**
 * * Statistics class, attached to a [hub].
 * *
 * * @author Ulrik Guenther <hello@ulrik.is>
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u0004\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\'B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J \u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001eJ \u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001f2\b\b\u0002\u0010\u001d\u001a\u00020\u001eJ\u001f\u0010 \u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00122\f\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"H\u0086\bJ\u0014\u0010$\u001a\b\u0018\u00010\u0013R\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0012J\u0006\u0010%\u001a\u00020\u0019J\b\u0010&\u001a\u00020\u0012H\u0016J\u000e\u0010&\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0012R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0004R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR*\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u0012\u0012\b\u0012\u00060\u0013R\u00020\u00000\u0011X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017\u00a8\u0006("}, d2 = {"Lgraphics/scenery/utils/Statistics;", "Lgraphics/scenery/Hubable;", "hub", "Lgraphics/scenery/Hub;", "(Lgraphics/scenery/Hub;)V", "dataSize", "", "getHub", "()Lgraphics/scenery/Hub;", "setHub", "logger", "Lorg/slf4j/Logger;", "getLogger", "()Lorg/slf4j/Logger;", "logger$delegate", "Lkotlin/Lazy;", "stats", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lgraphics/scenery/utils/Statistics$StatisticData;", "getStats", "()Ljava/util/concurrent/ConcurrentHashMap;", "setStats", "(Ljava/util/concurrent/ConcurrentHashMap;)V", "add", "", "name", "value", "", "isTime", "", "", "addTimed", "lambda", "Lkotlin/Function0;", "", "get", "log", "toString", "StatisticData", "scenery"})
public final class Statistics implements graphics.scenery.Hubable {
    private final kotlin.Lazy logger$delegate = null;
    private final int dataSize = 100;
    @org.jetbrains.annotations.NotNull()
    private java.util.concurrent.ConcurrentHashMap<java.lang.String, graphics.scenery.utils.Statistics.StatisticData> stats;
    @org.jetbrains.annotations.Nullable()
    private graphics.scenery.Hub hub;

    public Statistics(@org.jetbrains.annotations.Nullable()
                          graphics.scenery.Hub hub) {
        super();
    }

    private final org.slf4j.Logger getLogger() {
        return null;
    }

    @org.jetbrains.annotations.NotNull()
    protected final java.util.concurrent.ConcurrentHashMap<java.lang.String, graphics.scenery.utils.Statistics.StatisticData> getStats() {
        return null;
    }

    protected final void setStats(@org.jetbrains.annotations.NotNull()
                                      java.util.concurrent.ConcurrentHashMap<java.lang.String, graphics.scenery.utils.Statistics.StatisticData> p0) {
    }

    /**
     * * Adds a new datum to the statistic about [name] with [value].
     * * Set [isTime] to true if the datum contains time information.
     */
    public final void add(@org.jetbrains.annotations.NotNull()
                              java.lang.String name, float value, boolean isTime) {
    }

    /**
     * * Adds a new datum to the statistic about [name] with [value].
     * * Accepts all types of numbers.
     * *
     * * Set [isTime] to true if the datum contains time information.
     */
    public final void add(@org.jetbrains.annotations.NotNull()
                              java.lang.String name, @org.jetbrains.annotations.NotNull()
                              java.lang.Number value, boolean isTime) {
    }

    /**
     * * Adds a new datum to the statistic about [name], with the value
     * * determined as the duration of running [lambda].
     */
    public final void addTimed(@org.jetbrains.annotations.NotNull()
                                   java.lang.String name, @org.jetbrains.annotations.NotNull()
                                   kotlin.jvm.functions.Function0<? extends java.lang.Object> lambda) {
    }

    /**
     * Returns the statistic of [name], or null if not found
     */
    @org.jetbrains.annotations.Nullable()
    public final graphics.scenery.utils.Statistics.StatisticData get(@org.jetbrains.annotations.NotNull()
                                                                         java.lang.String name) {
        return null;
    }

    /**
     * Returns all collected stats as string
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }

    /**
     * Returns the statistics for [name] as string
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String toString(@org.jetbrains.annotations.NotNull()
                                               java.lang.String name) {
        return null;
    }

    /**
     * Logs all statistics as info via the logger infrastructure
     */
    @kotlin.Suppress(names = {"unused"})
    public final void log() {
    }

    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public graphics.scenery.Hub getHub() {
        return null;
    }

    @java.lang.Override()
    public void setHub(@org.jetbrains.annotations.Nullable()
                           graphics.scenery.Hub p0) {
    }

    /**
     * * Keeps statistical data, such as time points, and
     * * provides min, max, averages, etc. Set [isTime] to true if the
     * * kept data is time data.
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\r\u001a\u00020\u0007J\u0006\u0010\u000e\u001a\u00020\u0007J\u0006\u0010\u000f\u001a\u00020\u0007J\u0006\u0010\u0010\u001a\u00020\u0007J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\n\u0010\u0013\u001a\u00020\u0012*\u00020\u0007R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\f\u00a8\u0006\u0014"}, d2 = {"Lgraphics/scenery/utils/Statistics$StatisticData;", "", "isTime", "", "(Lgraphics/scenery/utils/Statistics;Z)V", "data", "Ljava/util/Deque;", "", "getData", "()Ljava/util/Deque;", "setData", "(Ljava/util/Deque;)V", "()Z", "avg", "max", "min", "stddev", "toString", "", "inMillisecondsIfTime", "scenery"})
    public final class StatisticData {

        private final boolean isTime = false;
        /**
         * Data storage
         */
        @org.jetbrains.annotations.NotNull()
        private java.util.Deque<java.lang.Float> data;

        public StatisticData(boolean isTime) {
            super();
        }

        @org.jetbrains.annotations.NotNull()
        public final java.util.Deque<java.lang.Float> getData() {
            return null;
        }

        public final void setData(@org.jetbrains.annotations.NotNull()
                                      java.util.Deque<java.lang.Float> p0) {
        }

        /**
         * Returns the average of the [data]
         */
        public final float avg() {
            return 0.0F;
        }

        /**
         * Returns the minimum of the [data] or 0.0f if empty
         */
        public final float min() {
            return 0.0F;
        }

        /**
         * Returns the maximum of the [data] or 0.0f if empty
         */
        public final float max() {
            return 0.0F;
        }

        /**
         * Returns the standard deviation of the [data] or 0.0f if empty
         */
        public final float stddev() {
            return 0.0F;
        }

        /**
         * * Returns a nanosecond float datum formatted converted to milliseconds with two digits
         * * precision, if [isTime] is true.
         */
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String inMillisecondsIfTime(float $receiver) {
            return null;
        }

        /**
         * Returns all the stats about [data] formatted as string
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }

        public final boolean isTime() {
            return false;
        }
    }
}
