package com.lm.spring.auto.services;

import com.lm.spring.auto.dao.ICustomerDAO;

/** 
 * 项目名称：example
 * 文件名称：ICustomerSV.java 
 * @author LM
 * @date 2017年12月8日 上午10:34:14 
 * @version 1.0 
 * @since JDK 1.8.0_91
 */
public interface ICustomerSV {
	public ICustomerDAO getCustomerDAO();
	public void setCustomerDAO(ICustomerDAO iCustomerDAO);
}
