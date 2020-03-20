package com.action;

import com.opensymphony.xwork2.ActionSupport;
import com.sun.javafx.application.PlatformImpl.FinishListener;

public class LoginAction extends ActionSupport {
	private static final long serialVersion =1L;
	private String name;
	private int age;
	private String tel;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String execute() throws Exception{
		return "hello";
	}
	//log方法，Action调用的method方法
	public String log() throws Exception{
		System.out.println("log");
		return "hello";
	}	
	
}
