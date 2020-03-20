package com.action;

import com.opensymphony.xwork2.ActionSupport;

import javassist.SerialVersionUID;

public class LoginAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	public String execute() throws Exception{
		return "success";		
	}
	//redirect(),·µ»Øerror
	public String redirect() throws Exception{
		return "error";		
	}
}
