package com.lm.demo.spring2.customer.services;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/** 
 * 项目名称：example
 * 文件名称：App.java 
 * @author LM
 * @date 2017年12月5日 下午4:29:19 
 * @version 1.0 
 * @since JDK 1.8.0_91
 */
public class App {
	private static ApplicationContext applicationContext;
	public static void main(String[] args) {
		applicationContext = new ClassPathXmlApplicationContext("SpringBeans2.xml");
		
		CustomerServices csa1 = (CustomerServices) applicationContext.getBean("CustomerServiceSig");
		csa1.setMessage("Message by csa1");
		System.out.println("Message :　" + csa1.getMessage());
		CustomerServices csb1 = (CustomerServices) applicationContext.getBean("CustomerServiceSig");
		System.out.println("Message :　" + csb1.getMessage());
		
		CustomerServices csa2 = (CustomerServices) applicationContext.getBean("CustomerServicePro");
		csa2.setMessage("Message by csa2");
		System.out.println("Message :　" + csa2.getMessage());
		CustomerServices csb2 = (CustomerServices) applicationContext.getBean("CustomerServicePro");
		System.out.println("Message :　" + csb2.getMessage());
	}
}
