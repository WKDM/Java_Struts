package com.action;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	public String execute() throws Exception{
		//���������Ϣ
		addActionError("The first error!");
		addActionError("The second error!");
		addActionError("The three error!");
		addActionError("The four error!");
		//������Ϣ
		addActionMessage("the first message");
		addActionMessage("the second message");
		addActionMessage("the three message");
		addFieldError("f1","the first field message");
		addFieldError("f1","the second field message");
		return "success";
	}
}
