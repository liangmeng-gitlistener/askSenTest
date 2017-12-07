package com.lm.demo.spring2.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/** 
 * Spring 中给 Bean 属性注入 value
 * 项目名称：example
 * 文件名称：App.java 
 * @author LM
 * @date 2017年12月5日 下午3:07:49 
 * @version 1.0 
 * @since JDK 1.8.0_91
 */
public class App {
	private static ApplicationContext applicationContext;
	public static void main(String[] args) {
		
		applicationContext = new ClassPathXmlApplicationContext("SpringBeans2.xml");
		FileNameGenerator obj = (FileNameGenerator) applicationContext.getBean("fileNameGenerator");
		System.out.println(obj.returnFileName());
	}

}
