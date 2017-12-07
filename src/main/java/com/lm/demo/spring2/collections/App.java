package com.lm.demo.spring2.collections;

import java.util.Map;
import java.util.Properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/** 
 * 项目名称：example
 * 文件名称：App.java 
 * @author LM
 * @date 2017年12月6日 上午10:18:10 
 * @version 1.0 
 * @since JDK 1.8.0_91
 */
public class App {
	private static ApplicationContext applicationContext;
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		applicationContext = new ClassPathXmlApplicationContext("SpringCollections.xml");
		Customer obj = (Customer) applicationContext.getBean("customerBean");
		
		System.out.println("List 第1种情况:");
        System.out.println(obj.getLists());

        System.out.println("Set 第2种情况:");
        System.out.println(obj.getSets().toString());

        Map tempMap = obj.getMaps();
        System.out.println("Map 第3种情况:");
        System.out.println(tempMap);
        System.out.println(tempMap.get("Key 1"));

        Properties tempPro = obj.getPros();
        System.out.println("第4种情况:");
        System.out.println(tempPro.toString());
        System.out.println(tempPro.getProperty("admin"));
	}
}
