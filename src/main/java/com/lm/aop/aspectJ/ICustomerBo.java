package com.lm.aop.aspectJ;
/** 
 * 项目名称：askSenTest
 * 文件名称：ICustomerBo.java 
 * @author LM
 * @date 2017年12月14日 下午5:12:38 
 * @version 1.0 
 * @since JDK 1.8.0_91
 */
public interface ICustomerBo {
	public void addCustomer();
	public void deleteCustomer();
	public String AddCustomerReturnValue();
	public void addCustomerThrowException() throws Exception;
	public void addCustomerAround(String name);
}
