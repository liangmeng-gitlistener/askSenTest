package com.lm.aop.aspectJ;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/** 
 * 项目名称：askSenTest
 * 文件名称：PointcutsDefinition.java 
 * @author LM
 * @date 2017年12月15日 上午10:41:43 
 * @version 1.0 
 * @since JDK 1.8.0_91
 */
@Aspect
public class PointcutsDefinition {
	@Pointcut("execution(* com.lm.aop.aspectJ.CustomerBoImpl.*(..))")
	public void customerLog() {
	}
}
