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
	//log������Action���õ�method����
	public String log() throws Exception{
		System.out.println("log");
		return "hello";
	}
	//log method��У�鷽��
		public void validateLog(){
			System.out.println("validatelog");
			if(age<10||age>30){
				addFieldError("age","age must be from 10 to 30!");
			}
		}
	//У�鷽��
	public void validate(){
		System.out.println("validate");
	}
	
}
