package com.lm.aop.advice;
/** 
 * 项目名称：example
 * 文件名称：CustomerService.java 
 * @author LM
 * @date 2017年12月8日 上午11:15:30 
 * @version 1.0 
 * @since JDK 1.8.0_91
 */
public class CustomerService {
	private String name;
	private String url;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public void printThrowException() {
		throw new IllegalArgumentException("This is a test exception.");
	}
	public void printOutName() {
		System.out.println("My name is : " + this.name);
	}
	public void printOutURL() {
		System.out.println("My url is : " + url);
	}
}
