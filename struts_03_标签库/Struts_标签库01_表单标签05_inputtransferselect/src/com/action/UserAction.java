package com.action;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private String[] fruits;
	
	public String[] getFruits() {
		return fruits;
	}

	public void setFruits(String[] fruits) {
		this.fruits = fruits;
	}

	public String execute() throws Exception{
		return "success";
	}
}
