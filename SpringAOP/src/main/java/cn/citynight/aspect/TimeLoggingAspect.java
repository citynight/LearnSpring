package cn.citynight.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author logan
 * @date 2020/9/3 11:50 下午
 */
@Component
@Aspect
public class TimeLoggingAspect {
    @Around("execution(* cn.citynight.service.*.*(..))")
    public void userAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("@Around: Before calculation-" + new Date());
        joinPoint.proceed();
        System.out.println("@Around: After calculation-" + new Date());
    }
}
