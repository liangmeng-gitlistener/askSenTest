package com.lm.aop.advice;

import java.util.Arrays;

//import org.springframework.cglib.proxy.MethodInterceptor;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/** 
 * 项目名称：example
 * 文件名称：HelloBeforeMethod.java 
 * @author LM
 * @date 2017年12月8日 下午2:35:10 
 * @version 1.0 
 * @since JDK 1.8.0_91
 */
public class AroundMethod implements MethodInterceptor{
//	@Override
//	public Object intercept(Object arg0, Method method, Object[] arg2, MethodProxy arg3) throws Throwable {
//		System.out.println("Method name : " + method.getName());
//		System.out.println("Method arguments : " + Arrays.toString(arg2));
//		System.out.println("Before method!");
//		Object result = arg3.invokeSuper(arg0, arg2);
//		System.out.println("After method!");
//		return result;
//	}

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("Method name : " + invocation.getMethod().getName());
		System.out.println("Method arguments : " + Arrays.toString(invocation.getArguments()));
		System.out.println("Before method!");
		try {
			Object result = invocation.proceed();
			System.out.println("After method!");
			return result;
		} catch (Exception e) {
			System.out.println("Throwing exception!");
			throw e;
		}
		
	}
}
