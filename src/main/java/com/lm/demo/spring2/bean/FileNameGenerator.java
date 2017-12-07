package com.lm.demo.spring2.bean;
/** 
 * 项目名称：example
 * 文件名称：FileNameGenerator.java 
 * @author LM
 * @date 2017年12月5日 下午2:19:34 
 * @version 1.0 
 * @since JDK 1.8.0_91
 */
public class FileNameGenerator {
	private String name;
	private String type;
	public String returnFileName() {
		return "FileNameGenerator [FileName =" + name + ", FileType=" + type + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
