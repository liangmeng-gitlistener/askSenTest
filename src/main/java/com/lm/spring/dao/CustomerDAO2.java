package com.lm.spring.dao;

import org.springframework.stereotype.Component;

/** 
 * 项目名称：example
 * 文件名称：CustomerDao.java 
 * @author LM
 * @date 2017年12月6日 下午2:11:39 
 * @version 1.0 
 * @since JDK 1.8.0_91
 */
@Component
public class CustomerDAO2 {
//	@Autowired
//	private String name2 = "lz";	
//	public String getName() {
//		return name2;
//	}
//	public void setName(String name2) {
//		this.name2 = name2;
//	}
	@Override
	public String toString() {
		return "Hello this is the second CustomerDAO ";//[name=" + name2 + "]";
	}
}
