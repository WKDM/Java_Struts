package com.action;

import com.opensymphony.xwork2.ActionSupport;
public class UserAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private User user = new User();
	
	//更新名字为USER	
	@JSON(name="USER");
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String execute() throws Exception{
		user.setName("tom");
		user.setAge(20);
		return "success";		
	}
}
