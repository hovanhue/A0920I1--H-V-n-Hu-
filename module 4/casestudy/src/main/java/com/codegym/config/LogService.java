package com.codegym.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

import java.util.Arrays;

@Aspect
public class LogService {

    // ghi log customer
    @AfterThrowing(pointcut = "execution(public * com.codegym.service.impl.CustomerServiceImpl.*(..))", throwing = "e")
    public void logCustomer(JoinPoint joinPoint, Exception e) {
        String className = joinPoint.getTarget().getClass().getSimpleName();
        String methodName = joinPoint.getSignature().getName();
        String argsName = Arrays.toString(joinPoint.getArgs());
        System.err.printf("An error has occurred at: %s.%s.%s : %s", className, methodName, argsName, e.getMessage());
    }

    @After(("execution(public * com.codegym.service.impl.CustomerServiceImpl.*(..))"))
    public void logCustomerSuccess(JoinPoint joinPoint) {
        String className = joinPoint.getTarget().getClass().getSimpleName();
        String methodName = joinPoint.getSignature().getName();
        System.err.printf("Method executed successfully at: %s.%s \n", className, methodName);
    }

    // ghi log service
    @AfterThrowing(pointcut = "execution(public * com.codegym.service.impl.ServiceImpl.*(..))", throwing = "e")
    public void logService(JoinPoint joinPoint, Exception e) {
        String className = joinPoint.getTarget().getClass().getSimpleName();
        String methodName = joinPoint.getSignature().getName();
        String argsName = Arrays.toString(joinPoint.getArgs());
        System.err.printf("An error has occurred at: %s.%s.%s : %s", className, methodName, argsName, e.getMessage());
    }

    @After(("execution(public * com.codegym.service.impl.ServiceImpl.*(..))"))
    public void logServiceSuccess(JoinPoint joinPoint) {
        String className = joinPoint.getTarget().getClass().getSimpleName();
        String methodName = joinPoint.getSignature().getName();
        System.err.printf("Method executed successfully at: %s.%s \n", className, methodName);
    }

    // ghi log employee
    @AfterThrowing(pointcut = "execution(public * com.codegym.service.impl.EmployeeServiceImpl.*(..))", throwing = "e")
    public void logEmployee(JoinPoint joinPoint, Exception e) {
        String className = joinPoint.getTarget().getClass().getSimpleName();
        String methodName = joinPoint.getSignature().getName();
        String argsName = Arrays.toString(joinPoint.getArgs());
        System.err.printf("An error has occurred at: %s.%s.%s : %s", className, methodName, argsName, e.getMessage());
    }

    @After(("execution(public * com.codegym.service.impl.EmployeeServiceImpl.*(..))"))
    public void logEmployeeSuccess(JoinPoint joinPoint) {
        String className = joinPoint.getTarget().getClass().getSimpleName();
        String methodName = joinPoint.getSignature().getName();
        System.err.printf("Method executed successfully at: %s.%s \n", className, methodName);
    }

    // ghi log contract
    @AfterThrowing(pointcut = "execution(public * com.codegym.service.impl.ContractServiceImpl.*(..))", throwing = "e")
    public void logContract(JoinPoint joinPoint, Exception e) {
        String className = joinPoint.getTarget().getClass().getSimpleName();
        String methodName = joinPoint.getSignature().getName();
        String argsName = Arrays.toString(joinPoint.getArgs());
        System.err.printf("An error has occurred at: %s.%s.%s : %s", className, methodName, argsName, e.getMessage());
    }

    @After(("execution(public * com.codegym.service.impl.ContractServiceImpl.*(..))"))
    public void logContractSuccess(JoinPoint joinPoint) {
        String className = joinPoint.getTarget().getClass().getSimpleName();
        String methodName = joinPoint.getSignature().getName();
        System.err.printf("Method executed successfully at: %s.%s \n", className, methodName);
    }
}
