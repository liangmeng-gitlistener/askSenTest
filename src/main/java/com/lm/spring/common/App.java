package com.lm.spring.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lm.spring.services.CustomerSV;

/** 
 * 项目名称：example
 * 文件名称：App.java 
 * @author LM
 * @date 2017年12月6日 下午2:31:20 
 * @version 1.0 
 * @since JDK 1.8.0_91
 */
public class App {
	private static ApplicationContext applicationContext;
	public static void main(String[] args) {
		applicationContext = new ClassPathXmlApplicationContext("/auto/SpringCustomer.xml");
		CustomerSV customerSV = (CustomerSV) applicationContext.getBean("test");
		System.out.println(customerSV.toString());
	}

}
