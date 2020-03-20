package com.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport{
	private static final long serialversionUID = 1L;
	public String execute() throws Exception{
		ActionContext context = ActionContext.getContext();//得到ActionContext实例，
		//将(name:"request:tom")到Actiontext中
		context.put("name", "request:tom");
		//得到Application并将(name,"application:tom")放入
		context.getApplication().put("name", "application:tom");
		//得到session并将(name,"session:tom")放入
		context.getSession().put("name", "sesson:tom");
		return "hello";
	}
}
