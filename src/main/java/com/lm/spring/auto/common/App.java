package com.lm.spring.auto.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lm.spring.auto.services.ICustomerSV;

/** 
 * 项目名称：example
 * 文件名称：App.java 
 * @author LM
 * @date 2017年12月8日 上午10:22:16 
 * @version 1.0 
 * @since JDK 1.8.0_91
 */
public class App {
	private static ApplicationContext applicationContext;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		applicationContext = new ClassPathXmlApplicationContext("/auto/SpringAuto.xml");
		ICustomerSV icustomerSV = (ICustomerSV) applicationContext.getBean("customerSV");
		System.out.println(icustomerSV);
		System.out.println(icustomerSV.getCustomerDAO().printName());
	}

}
