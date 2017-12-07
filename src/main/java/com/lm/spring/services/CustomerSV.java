package com.lm.spring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lm.spring.dao.CustomerDAO;
import com.lm.spring.dao.CustomerDAO2;

/** 
 * 项目名称：example
 * 文件名称：CustomerSV.java 
 * @author LM
 * @date 2017年12月6日 下午2:13:44 
 * @version 1.0 
 * @since JDK 1.8.0_91
 */
@Service("test")
public class CustomerSV {
	@Autowired
	private CustomerDAO customerDAO1;
	@Autowired
	private CustomerDAO2 customerDAO2;

	public CustomerDAO getCustomerDAO() {
		return customerDAO1;
	}

	public void setCustomerDAO(CustomerDAO customerDAO1) {
		this.customerDAO1 = customerDAO1;
	}
	
	public CustomerDAO2 getCustomerDAO2() {
		return customerDAO2;
	}

	public void setCustomerDAO2(CustomerDAO2 customerDAO2) {
		this.customerDAO2 = customerDAO2;
	}

	@Override
	public String toString() {
		return "CustomerSV [customerDAO=" + customerDAO1 + ", customerDAO2=" + customerDAO2 + "]";
	}
}