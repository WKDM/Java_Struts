package com.action;

public class TestAction {
	//Action Ù–‘
	private String helo;
	//getter∑Ω∑®
	public String getHelo() {
		return helo;
	}

	public void setHelo(String helo) {
		this.helo = helo;
	}
	public String execute(){
		helo ="hello world";
		return "success";
	}
	
}
