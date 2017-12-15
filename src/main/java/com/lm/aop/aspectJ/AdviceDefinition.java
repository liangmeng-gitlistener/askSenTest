package com.lm.aop.aspectJ;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/** 
 * 项目名称：askSenTest
 * 文件名称：LoggingAspect.java 
 * @author LM
 * @date 2017年12月14日 下午5:30:23 
 * @version 1.0 
 * @since JDK 1.8.0_91
 */
@Aspect
public class AdviceDefinition {
	@Before("com.lm.aop.aspectJ.PointcutsDefinition.customerLog()")
    public void logBefore(JoinPoint joinPoint){
        System.out.println("AdviceDefinition logBefore() is running ...");
        System.out.println("method name:"+joinPoint.getSignature().getName());
        System.out.println("**********");
    }
    @After("com.lm.aop.aspectJ.PointcutsDefinition.customerLog()")
    public void logAfter(JoinPoint joinPoint){
        System.out.println("AdviceDefinition logAfter() is running ...");
        System.out.println("method name:"+joinPoint.getSignature().getName());
        System.out.println("**********");
    }
}
