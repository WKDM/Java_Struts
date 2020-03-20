package com.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

public class prepareAction extends ActionSupport implements Preparable{
	private static final long serialVersionUID = 1L;
	private String msg;
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public void prepare() throws Exception{
		System.out.println("when prepare() invoked,the msg is"+msg);
	}
	public String execute() throws Exception{
		System.out.println("when execute() invoked,the msg is"+msg);
		return "success";
	}
}
