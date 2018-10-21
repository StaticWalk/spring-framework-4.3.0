package com.xxy.demo.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by xiongxiaoyu
 * Data:2018/10/21
 * Time:16:38
 */
@Component("exception")
@Aspect
public class ExceptionAspect {

    @Pointcut("execution(* com.xxy.demo.serviceimpl.PersonServiceImpl.*(..))")
    public void error() {
    }

   @AfterThrowing(pointcut = "error()",throwing = "ex")
    public void throwingException(JoinPoint joinPoint, Throwable ex)
   {
        System.out.print(ex.getMessage());
       System.err.println("sabasidbasidbiaus");
    }
}
