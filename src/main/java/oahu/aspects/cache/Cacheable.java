package oahu.aspects.cache;


/**
 * Created by rcs on 27.08.16.
 *
 */
public interface Cacheable {
    //UUID getUUID();
    void invalidate(Object thisObj);
}


/*
    public String getKey(ProceedingJoinPoint jp, Object thisObj) {
        Object[] args = jp.getArgs();
        MethodSignature signature = (MethodSignature) jp.getSignature();
        Method method = signature.getMethod();
        Cache a = method.getAnnotation(Cache.class);
        */
