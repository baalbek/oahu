package oahu.aspects.cache;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

import java.util.HashMap;
import java.util.Map;

@Aspect
public class CacheAspect {

    private Map<Integer, Map<String, Object>> objectCache = new HashMap<>();

    private CacheKeyFactory keyFactory;
    //private Map<String, Object> methodCache = new HashMap<>();


    @Pointcut("execution(@oahu.annotations.Cache * *(..))")
    public void cachePointcut() {
    }

    @Around("cachePointcut() && this(thisObj)")
    public Object cachePointcutMethod(ProceedingJoinPoint jp, Object thisObj) throws Throwable {
        Map<String, Object> methodCache = null;
        int hc = thisObj.hashCode();
        if (objectCache.containsKey(hc)) {
            methodCache = objectCache.get(hc);
        }
        else {
            methodCache = new HashMap<>();
            objectCache.put(hc, methodCache);
        }
        String key = keyFactory.getKey(jp, thisObj);
        if (methodCache.containsKey(key)){
            System.out.printf("Returning results from cache, key: %s\n", key);
            return methodCache.get(key);
        }
        else {
            Object result = jp.proceed();
            methodCache.put(key,result);
            System.out.printf("Putting in cache for key: %s\n", key);
            return result;
        }
    }

    /*
    public void invalidate(int hashCode, int methodId, Object arg) {
        String key = String.format("%d:%d:%s", hashCode, methodId, arg);
        if (methodCache.containsKey(key)) {
            System.out.println("Invalidating key: " + key);
            methodCache.remove(key);
        }
        else {
            System.out.println("Did not find key: " + key);
        }
    }
    //*/

    public void invalidate(Object thisObj) {
        int hc = thisObj.hashCode();
        System.out.println("Removing object with hashcode: " + hc);
        objectCache.remove(hc);
    }

    public void setKeyFactory(CacheKeyFactory keyFactory) {
        this.keyFactory = keyFactory;
    }
}
