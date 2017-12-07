package com.lm.demo.spring2.innerBean;
/** 
 * 项目名称：example
 * 文件名称：Customer.java 
 * @author LM
 * @date 2017年12月5日 下午3:34:06 
 * @version 1.0 
 * @since JDK 1.8.0_91
 */
public class Customer {
	private Person person;
	public Customer() {	
	}
	public Customer(Person person) {
		this.person = person;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	@Override
	public String toString() {
		return "Customer [person=" + person + "]";
	}
}
