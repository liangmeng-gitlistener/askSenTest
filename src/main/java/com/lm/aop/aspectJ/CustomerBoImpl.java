package com.lm.aop.aspectJ;
/** 
 * 项目名称：askSenTest
 * 文件名称：CustomerBoImpl.java 
 * @author LM
 * @date 2017年12月14日 下午5:15:10 
 * @version 1.0 
 * @since JDK 1.8.0_91
 */
public class CustomerBoImpl implements ICustomerBo{

	@Override
	public void addCustomer() {
		System.out.println("addCustomer() is running ...");
	}

	@Override
	public void deleteCustomer() {
		System.out.println("deleteCustomer() is running ...");
	}

	@Override
	public String AddCustomerReturnValue() {
		System.out.println("AddCustomerReturnValue() is running ...");
		return "abc";
	}

	@Override
	public void addCustomerThrowException() throws Exception {
		System.out.println("addCustomerThrowException() is running ...");
		throw new Exception("Generic Error");
	}

	@Override
	public void addCustomerAround(String name) {
		System.out.println("addCustomerAround() is running,args:" + name);
	}

}
