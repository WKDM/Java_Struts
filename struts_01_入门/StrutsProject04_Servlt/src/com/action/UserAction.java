package com.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport{
	private static final long serialversionUID = 1L;
	public String execute() throws Exception{
		ActionContext context = ActionContext.getContext();//�õ�ActionContextʵ����
		//��(name:"request:tom")��Actiontext��
		context.put("name", "request:tom");
		//�õ�Application����(name,"application:tom")����
		context.getApplication().put("name", "application:tom");
		//�õ�session����(name,"session:tom")����
		context.getSession().put("name", "sesson:tom");
		return "hello";
	}
}
