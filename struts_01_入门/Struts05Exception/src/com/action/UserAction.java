package com.action;

import org.apache.catalina.valves.rewrite.RewriteRule;
import org.eclipse.jdt.internal.compiler.ast.ThrowStatement;

public class UserAction extends Exception{
	private static final long serialVersionUID = 1L;
	private String name;
	private String age;
	private String tel;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge(){
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String execute() throws Exception{
		//��������ֵ���м���Ƿ����Ҫ��
		if(!getName().equals("����")){
			System.out.println("�Ҵ���");
			throw new SecurityException("wrong name!!!!!!!!!");
		}else if(!getAge().equals("25")){
			throw new SecurityException("wrong age!!!!!!!!!");
		}else if(!getTel().equals("18295358968")){
			throw new java.sql.SQLException(); 
		}else{
			return "success";
		}
	}
}
