package com.action;

import javax.servlet.ServletException;

import com.sun.corba.se.impl.protocol.giopmsgheaders.Message;

public class SecurityException extends Exception {
	private static final long serialVersionUID = 1L;
	public SecurityException(){
		super();
	}
	private String message;
	public SecurityException(String message){
		System.out.println("�Ҵ���2");
		this.message = message;
	}
	public String getMessage(String message){
		System.out.println("�Ҵ���3");
		return message;		
	}
}
