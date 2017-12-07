package com.lm.demo.spring2.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

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
	private List<Object> lists ;//这里的lists要和Bean中property标签的name一样。
	private Set<Object> sets ;
	private Map<Object, Object> maps ;
	private Properties pros;
	public Customer() {	
	}
	public Customer(Person person) {
		this.person = person;
	}
	
	public List<Object> getLists() {
		return lists;
	}
	public void setLists(List<Object> lists) {
		this.lists = lists;
	}
	public Set<Object> getSets() {
		return sets;
	}
	public void setSets(Set<Object> sets) {
		this.sets = sets;
	}
	public Map<Object, Object> getMaps() {
		return maps;
	}
	public void setMaps(Map<Object, Object> maps) {
		this.maps = maps;
	}
	public Properties getPros() {
		return pros;
	}
	public void setPros(Properties pros) {
		this.pros = pros;
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
