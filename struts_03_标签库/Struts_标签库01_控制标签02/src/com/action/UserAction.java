package com.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {
	private static final long serialVersionUID=1L;
	//3¸ölistÊôĞÔ
	private List mylist1;
	private List mylist2;
	private List mylist3;
	public List getMylist1() {
		return mylist1;
	}
	public void setMylist1(List mylist1) {
		this.mylist1 = mylist1;
	}
	public List getMylist2() {
		return mylist2;
	}
	public void setMylist2(List mylist2) {
		this.mylist2 = mylist2;
	}
	public List getMylist3() {
		return mylist3;
	}
	public void setMylist3(List mylist3) {
		this.mylist3 = mylist3;
	}
	public String execute() throws Exception{
		mylist1 = new ArrayList();
		mylist1.add("1");
		mylist1.add("2");
		mylist1.add("3");
		mylist2 = new ArrayList();
		mylist2.add("a");
		mylist2.add("b");
		mylist2.add("c");
		mylist3 =new ArrayList();
		mylist3.add("A");
		mylist3.add("B");
		mylist3.add("C");
		return "success";
		
	}
}
