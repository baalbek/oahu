package oahu.aspects.cache;

/**
 * Created by rcs on 10.09.16.
 *
 */
public interface CacheKeyFactory<T,T2> {
    T2 keyFor(T joinPoint);
}
