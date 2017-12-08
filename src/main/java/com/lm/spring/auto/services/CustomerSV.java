package com.lm.spring.auto.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lm.spring.auto.dao.ICustomerDAO;

/** 
 * 项目名称：example
 * 文件名称：CustomerSV.java 
 * @author LM
 * @date 2017年12月6日 下午2:13:44 
 * @version 1.0 
 * @since JDK 1.8.0_91
 */
@Service("test")
public class CustomerSV implements ICustomerSV{
	@Autowired
	private ICustomerDAO iCustomerDAO;
	@Override
	public ICustomerDAO getCustomerDAO() {
		return iCustomerDAO;
	}
	@Override
	public void setCustomerDAO(ICustomerDAO iCustomerDAO) {
		this.iCustomerDAO = iCustomerDAO;
	}

	@Override
	public String toString() {
		return "CustomerSV [iCustomerDAO=" + iCustomerDAO + "]";
	}

}