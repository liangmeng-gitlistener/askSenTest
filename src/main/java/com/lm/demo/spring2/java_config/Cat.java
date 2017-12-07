package com.lm.demo.spring2.java_config;

import org.springframework.stereotype.Service;

/** 
 * 项目名称：example
 * 文件名称：Dog.java 
 * @author LM
 * @date 2017年12月6日 上午10:53:51 
 * @version 1.0 
 * @since JDK 1.8.0_91
 */
@Service
public class Cat implements IAnimal {

	@Override
	public String retName() {
		String name = "Cat";
		return "my name is : " + name;
	}

}
