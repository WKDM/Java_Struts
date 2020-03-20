package com.action;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private String myselection;
	
	public String getMyselection() {
		return myselection;
	}

	public void setMyselection(String myselection) {
		this.myselection = myselection;
	}

	public String execute() throws Exception{
		return "success";
	}
}
