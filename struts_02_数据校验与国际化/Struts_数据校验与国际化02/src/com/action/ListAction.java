package com.action;

import com.model.User;
import com.opensymphony.xwork2.ActionSupport;
import com.sun.javafx.collections.MappingChange.Map;

public class ListAction extends ActionSupport {
	private static final long srialVersionUID = 1L;
	private Map<String, User> users;
	public Map<String, User> getUsers() {
		return users;
	}
	public void setUsers(Map<String, User> users) {
		this.users = users;
	}
	public String execute() throws Exception{
		return "success";		
	}
}
