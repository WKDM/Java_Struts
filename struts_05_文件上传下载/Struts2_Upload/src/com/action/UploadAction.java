package com.action;

import java.io.File;

import com.opensymphony.xwork2.ActionSupport;

public class UploadAction extends ActionSupport{
	//获取参数
	private String username;
	private String password;
	private File photo;//struts会自动将数据转成文件对象
	private String photoContentType;
	private String photoFileName;
	public String getPhotoContentType() {
		return photoContentType;
	}

	public void setPhotoContentType(String photoContentType) {
		this.photoContentType = photoContentType;
	}

	public String getPhotoFileName() {
		return photoFileName;
	}

	public void setPhotoFileName(String photoFileName) {
		this.photoFileName = photoFileName;
	}

	public File getPhoto() {
		return photo;
	}

	public void setPhoto(File photo) {
		this.photo = photo;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	public String upload(){
		System.out.println(username);
		System.out.println(password);
		System.out.println(photo);
		System.out.println(photoContentType);
		System.out.println(photoFileName);
		return NONE;
	}
}
