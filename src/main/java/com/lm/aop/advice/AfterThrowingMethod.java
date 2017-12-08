package com.lm.aop.advice;

import org.springframework.aop.ThrowsAdvice;

/** 
 * 项目名称：example
 * 文件名称：HelloBeforeMethod.java 
 * @author LM
 * @date 2017年12月8日 下午2:35:10 
 * @version 1.0 
 * @since JDK 1.8.0_91
 */
public class AfterThrowingMethod implements ThrowsAdvice{
	public void afterThrowing(IllegalArgumentException e) throws Throwable{
		System.out.println("warning!Exception!");
	}
}
