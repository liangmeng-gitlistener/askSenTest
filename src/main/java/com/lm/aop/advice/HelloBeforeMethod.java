package com.lm.aop.advice;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

/** 
 * 项目名称：example
 * 文件名称：HelloBeforeMethod.java 
 * @author LM
 * @date 2017年12月8日 下午2:35:10 
 * @version 1.0 
 * @since JDK 1.8.0_91
 */
public class HelloBeforeMethod implements MethodBeforeAdvice{

	@Override
	public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Method   arg0: " + arg0.getParameterTypes());
		System.out.println("Object[] arg1: " + arg1.toString());
		System.out.println("Object   arg2: " + arg2.toString());
	}

}
