package oahu.aspects.cache;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Created by rcs on 28.08.16.
 *
 */
public interface CacheKeyFactory {
    String getKey(ProceedingJoinPoint jp, Object thisObj);
}
