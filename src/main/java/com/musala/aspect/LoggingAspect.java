package com.musala.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {

    @Before("allCircleMethods()")
    public void loggingAdvice() {
        System.out.println("Advice run. Get method called.");
    }

    @Pointcut("execution(* *(..))")
    public void allGetters(){
    }
    @Pointcut("within(com.musala..*)")
    public void allCircleMethods() {}

}
