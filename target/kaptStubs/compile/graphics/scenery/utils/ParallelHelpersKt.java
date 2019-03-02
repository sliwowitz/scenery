package graphics.scenery.utils;

import java.lang.System;

@kotlin.Suppress(names = {"unused"})
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000H\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u001aH\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00042\"\u0010\u0005\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\t\u001aN\u0010\n\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00042(\u0010\u0005\u001a$\b\u0001\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u000b\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\r\u001aF\u0010\u000e\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u000f\"\u0004\b\u0001\u0010\u0010*\u000e\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u0002H\u00100\u00112\b\b\u0002\u0010\u0012\u001a\u00020\f2\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u00020\u00010\u0006\u001aD\u0010\u000e\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0014\"\u0004\b\u0001\u0010\u0015*\b\u0012\u0004\u0012\u0002H\u00140\u00042\b\b\u0002\u0010\u0016\u001a\u00020\f2\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u0002H\u0014\u0012\u0004\u0012\u0002H\u00150\u001a\u001aN\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u00030\u001c\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00042\"\u0010\u0005\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001d\u001aJ\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u00150\u001c\"\u0004\b\u0000\u0010\u0014\"\u0004\b\u0001\u0010\u0015*\b\u0012\u0004\u0012\u0002H\u00140\u00042\b\b\u0002\u0010\u0016\u001a\u00020\f2\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u0002H\u0014\u0012\u0004\u0012\u0002H\u00150\u001a\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001f"}, d2 = {"forEachAsync", "", "A", "B", "", "f", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "(Ljava/lang/Iterable;Lkotlin/jvm/functions/Function2;)V", "forEachIndexedAsync", "Lkotlin/Function3;", "", "(Ljava/lang/Iterable;Lkotlin/jvm/functions/Function3;)V", "forEachParallel", "K", "V", "Ljava/util/HashMap;", "maxThreads", "action", "T", "R", "numThreads", "exec", "Ljava/util/concurrent/ExecutorService;", "transform", "Lkotlin/Function1;", "mapAsync", "", "(Ljava/lang/Iterable;Lkotlin/jvm/functions/Function2;)Ljava/util/List;", "mapParallel", "scenery"})
public final class ParallelHelpersKt {
    
    /**
     * * Maps the function [f] asynchronously on [this], returning the resultant list.
     * *
     * * Works via Kotlin Coroutines.
     */
    @org.jetbrains.annotations.NotNull()
    public static final <A extends java.lang.Object, B extends java.lang.Object>java.util.List<B> mapAsync(@org.jetbrains.annotations.NotNull()
    java.lang.Iterable<? extends A> $receiver, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super A, ? super kotlin.coroutines.Continuation<? super B>, ? extends java.lang.Object> f) {
        return null;
    }
    
    /**
     * * Runs the function [f] asynchronously on [this].
     * *
     * * Works via Kotlin Coroutines.
     */
    public static final <A extends java.lang.Object, B extends java.lang.Object>void forEachAsync(@org.jetbrains.annotations.NotNull()
    java.lang.Iterable<? extends A> $receiver, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super A, ? super kotlin.coroutines.Continuation<? super B>, ? extends java.lang.Object> f) {
    }
    
    /**
     * * Runs the function [f] indexed asynchronously on [this].
     * *
     * * Works via Kotlin Coroutines.
     */
    public static final <A extends java.lang.Object, B extends java.lang.Object>void forEachIndexedAsync(@org.jetbrains.annotations.NotNull()
    java.lang.Iterable<? extends A> $receiver, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super A, ? super kotlin.coroutines.Continuation<? super B>, ? extends java.lang.Object> f) {
    }
    
    /**
     * * Maps the function [transform] asynchronously on [this], returning the resultant list.
     * * An optional [ExecutorService] may be given via [exec], the number of threads can be limited
     * * by setting [numThreads], default number is (availableCores - 2).
     * *
     * * Works via Executor Services.
     * * by Holger Brandl, https://stackoverflow.com/a/35638609
     */
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object, R extends java.lang.Object>java.util.List<R> mapParallel(@org.jetbrains.annotations.NotNull()
    java.lang.Iterable<? extends T> $receiver, int numThreads, @org.jetbrains.annotations.NotNull()
    java.util.concurrent.ExecutorService exec, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, ? extends R> transform) {
        return null;
    }
    
    /**
     * * Runs the function [transform] asynchronously on [this], returning the resultant list.
     * * An optional [ExecutorService] may be given via [exec], the number of threads can be limited
     * * by setting [numThreads], default number is (availableCores - 2).
     * *
     * * Works via Executor Services.
     * * derived from Holger Brandl's solution for map, https://stackoverflow.com/a/35638609
     */
    public static final <T extends java.lang.Object, R extends java.lang.Object>void forEachParallel(@org.jetbrains.annotations.NotNull()
    java.lang.Iterable<? extends T> $receiver, int numThreads, @org.jetbrains.annotations.NotNull()
    java.util.concurrent.ExecutorService exec, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, ? extends R> transform) {
    }
    
    /**
     * * Parallel forEach implementation for HashMaps.
     * *
     * * @param[maxThreads] Maximum number of parallel threads
     * * @param[action] Lambda containing the action to be executed for each key, value pair.
     */
    public static final <K extends java.lang.Object, V extends java.lang.Object>void forEachParallel(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<K, V> $receiver, int maxThreads, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super K, ? super V, kotlin.Unit> action) {
    }
}