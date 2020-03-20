package com.action;

import com.opensymphony.xwork2.ActionSupport;

public class SecondAction extends ActionSupport {
	private static final  long serialVersion=1L;
	public String execute() throws Exception{
		System.out.println("secondAction");
		return "success";
	}
}
