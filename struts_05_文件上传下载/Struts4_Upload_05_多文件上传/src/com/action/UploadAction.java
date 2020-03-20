package com.action;

import java.io.File;

import com.opensymphony.xwork2.ActionSupport;

public class UploadAction extends ActionSupport {
	private String username; 
	private String password;
	private File[] photo;
	private String[] photoContentType;
	private String[] photoFileName;
	
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

	public File[] getPhoto() {
		return photo;
	}

	public void setPhoto(File[] photo) {
		this.photo = photo;
	}

	public String[] getPhotoContentType() {
		return photoContentType;
	}

	public void setPhotoContentType(String[] photoContentType) {
		this.photoContentType = photoContentType;
	}

	public String[] getPhotoFileName() {
		return photoFileName;
	}

	public void setPhotoFileName(String[] photoFileName) {
		this.photoFileName = photoFileName;
	}

	public String uploading(){
		for(int i=0;i<photo.length;i++){
			System.out.println("文件临时路径："+photo[i]);
			System.out.println("文件类型："+photoContentType[i]);
			System.out.println("文件类型："+photoFileName[i]);
		}
		return NONE;
		
	}
}
