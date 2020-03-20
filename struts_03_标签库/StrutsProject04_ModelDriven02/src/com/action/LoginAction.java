package com.action;

import com.model.UserModel;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import javassist.SerialVersionUID;

public class LoginAction extends ActionSupport implements ModelDriven<UserModel> {
	private static final long serialVersionUID = 1L;
	private UserModel user = new UserModel();	//´´½¨UserModelÊµÀý
	@Override
	public UserModel getModel() {
		return user;
	}
	public String execute() throws Exception{
		ActionContext context = ActionContext.getContext();
		context.put("user", user);
		return "success";
		
	}

}
