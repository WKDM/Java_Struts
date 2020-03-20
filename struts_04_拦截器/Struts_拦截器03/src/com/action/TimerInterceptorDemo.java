package com.action;

import com.opensymphony.xwork2.ActionSupport;

public class TimerInterceptorDemo extends ActionSupport {
	private static final long serialVersionUID=1L;
	public String execute() throws Exception{
		Thread.sleep(100);
		return "success";
	}
	
}
