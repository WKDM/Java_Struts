package com.action;

public class TestAction {
	//Action����
	private String helo;
	//getter����
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
