package oahu.aspects.cache;

import java.util.UUID;

/**
 * Created by rcs on 27.08.16.
 *
 */
public interface Cacheable {
    UUID getUUID();
}


/*
    public String getKey(ProceedingJoinPoint jp, Object thisObj) {
        Object[] args = jp.getArgs();
        MethodSignature signature = (MethodSignature) jp.getSignature();
        Method method = signature.getMethod();
        Cache a = method.getAnnotation(Cache.class);
        */
