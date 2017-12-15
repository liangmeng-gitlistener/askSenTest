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
public class LoggingAspect {
	/*此处是Aspect的切入点表达式，其中，*代表返回类型，后边的就要定义要拦截的方法名，这里表示拦截CustomerBo中的addCustomer方法，
	(..)代表参数匹配，此处表示匹配任意数量的参数，可以是 0 个也可以是多个，如果你确定这个方法不需要使用参数可以直接用 ()，
	还可以使用 (*) 来匹配一个任意类型的参数，还可以使用 (* , String ) ，
	这样代表匹配两个参数，第二个参数必须是 String 类型的参数*/
	@Before("execution(public * com.lm.aop.aspectJ.CustomerBoImpl.addCustomer(..))")
    public void logBefore(JoinPoint joinPoint){
        System.out.println("logBefore() is running ...");
        System.out.println("method name:"+joinPoint.getSignature().getName());
        System.out.println("**********");
    }
	//Pointcut
    @After("execution(public * com.lm.aop.aspectJ.CustomerBoImpl.deleteCustomer(..))")
	//Advice
    public void logAfter(JoinPoint joinPoint){
        System.out.println("logAfter() is running ...");
        System.out.println("method name:"+joinPoint.getSignature().getName());
        System.out.println("**********");
    }
}
