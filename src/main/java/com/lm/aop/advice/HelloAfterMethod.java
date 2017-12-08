package com.lm.aop.advice;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

/** 
 * 项目名称：example
 * 文件名称：HelloBeforeMethod.java 
 * @author LM
 * @date 2017年12月8日 下午2:35:10 
 * @version 1.0 
 * @since JDK 1.8.0_91
 */
public class HelloAfterMethod implements AfterReturningAdvice{
	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		System.out.println("returnValue :　" + returnValue);		
	}
}
