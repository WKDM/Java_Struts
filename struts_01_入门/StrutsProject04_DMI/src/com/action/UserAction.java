package com.action;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {
	private static final long serialVersionUID=1L;
	private String info;
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public String execute() throws Exception{
		info = "hello world";
		return "hello";
	}
	public String update() throws Exception{
		info = "ok£¬update";
		return "update";
		
	}
}
