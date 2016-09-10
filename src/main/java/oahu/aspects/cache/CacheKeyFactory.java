package oahu.aspects.cache;

import org.aspectj.lang.JoinPoint;

/**
 * Created by rcs on 10.09.16.
 *
 */
public interface CacheKeyFactory<T> {
    T keyFor(JoinPoint joinPoint);
}
