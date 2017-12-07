package com.lm.demo.spring2.innerBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/** 
 * Spring Inner Bean - 内部嵌套的 Bean
 * 项目名称：example
 * 文件名称：App.java 
 * @author LM
 * @date 2017年12月5日 下午3:45:37 
 * @version 1.0 
 * @since JDK 1.8.0_91
 */
public class App {
	private static ApplicationContext applicationContext;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		applicationContext = new ClassPathXmlApplicationContext("SpringBeans2.xml");
		Customer obj = (Customer) applicationContext.getBean("customerBean");
		System.out.println(obj.toString());
		System.out.println("4");
	}

}
