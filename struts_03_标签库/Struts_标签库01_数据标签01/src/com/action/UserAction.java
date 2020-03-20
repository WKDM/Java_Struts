package com.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport{
	private static final long serialVersionUID = 1L;
	public String execute() throws Exception{
		ActionContext.getContext().put("hello","hello world");//context中放入hello对象
		return "success";		
	}
}
