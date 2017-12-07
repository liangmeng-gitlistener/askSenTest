package com.lm.demo.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lm.demo.example.helloworld.HelloWorld;

/**
 * Hello world!
 *
 */
public class HelloWorldApp 
{
	private static ApplicationContext aContext;
    public static void main( String[] args )
    {
    	aContext = new ClassPathXmlApplicationContext("SpringBeans.xml");
        HelloWorld obj = (HelloWorld) aContext.getBean("helloBean");
        obj.printHello();
    }
}
