package oahu.aspects.cache.impl;

import oahu.annotations.Cache;
import oahu.aspects.cache.CacheKeyFactory;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.reflect.MethodSignature;

import java.lang.reflect.Method;

/**
 * Created by rcs on 28.08.16.
 *
 */
public class CacheKeyWithIdFactory implements CacheKeyFactory {
    @Override
    public String getKey(ProceedingJoinPoint jp, Object thisObj) {
        Object[] args = jp.getArgs();
        MethodSignature signature = (MethodSignature) jp.getSignature();
        Method method = signature.getMethod();
        Cache a = method.getAnnotation(Cache.class);

        return String.format("%d:%d:%s", thisObj.hashCode(), a.id(), args[0]);
    }
}
