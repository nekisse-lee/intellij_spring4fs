package aspect;

import org.aspectj.lang.ProceedingJoinPoint;

import java.util.HashMap;
import java.util.Map;

public class CacheAspect {


    private Map<Long, Object> cache = new HashMap<>();

    public Object execute(ProceedingJoinPoint joinPoint) throws Throwable {
        Long num = (Long) joinPoint.getArgs()[0];

        if (cache.containsKey(num)) {
            System.out.printf("CacheAspect: Cache 에서 구함 [%d]\n", num);
            return cache.get(num);
        }

        Object result = joinPoint.proceed();
        cache.put(num, result);
        System.out.printf("CacheAspect: Cache 에 추가[%d]\n", num);
        return result;
    }



}
