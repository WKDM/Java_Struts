package com.action;

import com.opensymphony.xwork2.ActionSupport;

public class FirstAction extends ActionSupport{
	private static final long serialVersion=1L;
	public String execute() throws Exception{
		System.out.println("First Action");
		return "success";
	}
}
