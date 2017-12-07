package com.lm.demo.spring2.java_config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lm.spring.services.CustomerSV;

/** 
 * 项目名称：example
 * 文件名称：App.java 
 * @author LM
 * @date 2017年12月7日 上午9:53:17 
 * @version 1.0 
 * @since JDK 1.8.0_91
 */
public class App {
	private static ApplicationContext applicationContext;
	public static void main(String[] args) {		
		applicationContext = new ClassPathXmlApplicationContext("/javaConfig/SpringConfig.xml");
		CustomerSV customerSV = (CustomerSV) applicationContext.getBean("myTest");
		System.out.println(customerSV.toString());
	}
}
