package com.lm.spring.auto.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/** 
 * 项目名称：example
 * 文件名称：CustomerDao.java 
 * @author LM
 * @date 2017年12月6日 下午2:11:39 
 * @version 1.0 
 * @since JDK 1.8.0_91
 */
@Repository("testDAO")
public class CustomerDAO implements ICustomerDAO{
	@Autowired
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Hello this is a CustomerDAO";// [name=" + name1 + "]";
	}

	@Override
	public String printName() {
		// TODO Auto-generated method stub
		return name;
	}
}
