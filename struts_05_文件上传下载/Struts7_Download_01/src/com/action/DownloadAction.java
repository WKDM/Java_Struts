package com.action;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import com.opensymphony.xwork2.ActionSupport;
/**
 * ���裺
 * 1.д��Action
 * 2.��Actionдһ�����������ԣ��ṩ���巽��
 * 3.��Action��дһ��download��������inputStream��ֵ
 * 4.дstruts�������ļ������action
 * 5.result��type=stream��������ʽ�����ݷ��ظ��ͻ���
 * 6.��result�����3������
 * 		<param name="inputName">inputStream</param>
		<param name="contentdisposition">attachment;filename=4.jsp</param>
		<param name="contentType">application/octet-stream</param>
	
 * */
public class DownloadAction extends ActionSupport {
	private InputStream inputStream;
	private String filename;
	
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
	public String download() throws FileNotFoundException, UnsupportedEncodingException{
		filename = "Demomeinv1.jpg";
		
		//1.�ļ�·��
		String path="E:/Lianxi/"+filename;
		//�����������
		filename = "����.jpg";
		filename = URLEncoder.encode(filename,"UTF-8");
		
		
		//2.����������ֵ
		inputStream = new FileInputStream(path);
		//3.ͨ��outputStream�������ݸ��ͻ���
		return "success";
		
	}
	
}
