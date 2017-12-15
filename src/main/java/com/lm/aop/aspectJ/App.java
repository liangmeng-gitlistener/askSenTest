package com.lm.aop.aspectJ;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/** 
 * 项目名称：askSenTest
 * 文件名称：App.java 
 * @author LM
 * @date 2017年12月15日 上午10:22:49 
 * @version 1.0 
 * @since JDK 1.8.0_91
 */
public class App {

	private static ApplicationContext appContext;

	public static void main(String[] args) {
		appContext = new ClassPathXmlApplicationContext(new String[] { "aspectJ/SpringAOPAspectJ.xml" });
        ICustomerBo customer=(ICustomerBo)appContext.getBean("customerBo");

        customer.addCustomer();

        System.out.println("-------------------------------------------");

        customer.deleteCustomer();
	}

}
