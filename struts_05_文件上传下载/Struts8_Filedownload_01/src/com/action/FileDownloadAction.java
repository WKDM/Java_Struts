package com.action;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class FileDownloadAction extends ActionSupport {
	private static final long serialVersionUID=1L;
	private String filename;
	private InputStream inputStream;
	
	
	public String getFilename() {
		return filename;
	}


	public void setFilename(String filename) {
		this.filename = filename;
	}


	public InputStream getInputStream() {
		return inputStream;
	}


	public void setInputStream(InputStream inputStream) {
		this.inputStream = inputStream;
	}


	public String download() throws FileNotFoundException{
		//1.�ļ���
		filename = "Demomeinv1.jpg";
		//2.�����ļ�·��
		String filepath="E:/Lianxi/"+filename;
		//3.����������ֵ
		inputStream = new FileInputStream(filepath);
		//4.ͨ��outputStream�������ݸ��ͻ���
		return "success";		
	}
}
