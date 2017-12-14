package com.lm.aop.advice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/** 
 * 项目名称：example
 * 文件名称：App.java 
 * @author LM
 * @date 2017年12月8日 下午2:23:57 
 * @version 1.0 
 * @since JDK 1.8.0_91
 */
public class AutoProxyApp {
	private static ApplicationContext applicationContext;
	public static void main(String[] args) {
		applicationContext = new ClassPathXmlApplicationContext("/aop/AutoProxySpringAOPAdvice.xml");
		CustomerService customerService = (CustomerService) applicationContext.getBean("customerService");
		System.out.println("*************************");
        customerService.printOutName();
        System.out.println("*************************");
        customerService.printOutURL();
        System.out.println("*************************");
        try {
        	customerService.printThrowException();
        } catch (Exception e) {
        	System.err.println(e);
        }
	}
}
