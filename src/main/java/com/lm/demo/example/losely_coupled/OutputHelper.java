package com.lm.demo.example.losely_coupled;

public class OutputHelper {
	IOutputGenerator iOutputGenerator;

	public void generateOutput() {
		this.iOutputGenerator.generateOutput();
	}

	public void setiOutputGenerator(IOutputGenerator iOutputGenerator) {
		this.iOutputGenerator = iOutputGenerator;
	}
}
