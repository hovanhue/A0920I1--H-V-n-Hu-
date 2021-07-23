package com.example.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

import java.util.Arrays;

@Aspect
public class Log {

    // ghi log customer
    @AfterThrowing(pointcut = "execution(public * com.example.service.impl.SanPhamServiceImpl.*(..))", throwing = "e")
    public void logCustomer(JoinPoint joinPoint, Exception e) {
        String className = joinPoint.getTarget().getClass().getSimpleName();
        String methodName = joinPoint.getSignature().getName();
        String argsName = Arrays.toString(joinPoint.getArgs());
        System.err.printf("An error has occurred at: %s.%s.%s : %s", className, methodName, argsName, e.getMessage());
    }

    @After(("execution(public * com.example.service.impl.SanPhamServiceImpl.*(..))"))
    public void logCustomerSuccess(JoinPoint joinPoint) {
        String className = joinPoint.getTarget().getClass().getSimpleName();
        String methodName = joinPoint.getSignature().getName();
        System.err.printf("Method executed successfully at: %s.%s \n", className, methodName);
    }
}
