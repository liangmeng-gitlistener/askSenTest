package com.lm.demo.spring2.java_config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller("myTest")
public class OutputAnimal {
	@Autowired
	IAnimal iAnimal;

	public String generateOutput() {
		return this.iAnimal.retName();
	}

	public void setiOutputGenerator(IAnimal iAnimal) {
		this.iAnimal = iAnimal;
	}
}
