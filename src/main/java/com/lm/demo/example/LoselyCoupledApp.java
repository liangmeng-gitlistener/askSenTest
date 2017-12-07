package com.lm.demo.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lm.demo.example.losely_coupled.OutputHelper;
/**
 * @ClassName: LoselyCoupledApp 
 * @Description: spring松耦合测试
 * @author lm407
 * @date 2017年12月5日 上午10:00:12 
 */
public class LoselyCoupledApp 
{
	private static ApplicationContext aContext;
    public static void main( String[] args )
    {
    	aContext = new ClassPathXmlApplicationContext("Spring-Output.xml");
    	OutputHelper output = (OutputHelper) aContext.getBean("outputHelper");
    	output.generateOutput();
    }
}
