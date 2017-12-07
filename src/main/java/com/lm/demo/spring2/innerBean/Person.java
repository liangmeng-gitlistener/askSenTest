package com.lm.demo.spring2.innerBean;
/** 
 * 项目名称：example
 * 文件名称：Person.java 
 * @author LM
 * @date 2017年12月5日 下午3:30:00 
 * @version 1.0 
 * @since JDK 1.8.0_91
 */
public class Person {
	private String name;
	private String address;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + ", age=" + age + "]";
	}
}
