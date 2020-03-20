package com.action;

import com.opensymphony.xwork2.ActionSupport;

public class TestAction extends ActionSupport {
	public String execute(){
		System.out.println("test1");
		return "success";
		
	}
}
