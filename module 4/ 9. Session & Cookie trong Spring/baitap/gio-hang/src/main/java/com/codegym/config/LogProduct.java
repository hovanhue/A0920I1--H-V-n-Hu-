package com.codegym.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

import java.util.Arrays;

@Aspect
public class LogProduct {
    @AfterThrowing(pointcut = "execution(public * com.codegym.service.ProductService.*(..))", throwing = "e")
    public void logBook(JoinPoint joinPoint, Exception e){
        String className = joinPoint.getTarget().getClass().getSimpleName();
        String methodName = joinPoint.getSignature().getName();
        String argsName = Arrays.toString(joinPoint.getArgs());
        System.out.printf("An error has occurred at: %s.%s.%s : %s", className, methodName, argsName, e.getMessage());
    }

    @After(("execution(public * com.codegym.service.ProductService.*(..))"))
    public void logSuccess(JoinPoint joinPoint){
        String className = joinPoint.getTarget().getClass().getSimpleName();
        String methodName = joinPoint.getSignature().getName();
        System.out.printf("Method executed successfully at: %s.%s \n", className, methodName);
    }
}
