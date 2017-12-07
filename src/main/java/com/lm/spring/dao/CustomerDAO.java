package com.lm.spring.dao;

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
public class CustomerDAO {
//	@Autowired
//	private String name1;
//	public String getName() {
//		return name1;
//	}
//	public void setName(String name1) {
//		this.name1 = name1;
//	}
	@Override
	public String toString() {
		return "Hello this is the first CustomerDAO";// [name=" + name1 + "]";
	}
}
