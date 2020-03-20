package com.action;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import com.opensymphony.xwork2.ActionSupport;
/**
 * 步骤：
 * 1.写个Action
 * 2.在Action写一个输入流属性，提供个体方法
 * 3.在Action中写一个download方法，给inputStream赋值
 * 4.写struts的配置文件，添加action
 * 5.result中type=stream以流的形式把数据返回给客户端
 * 6.在result中添加3个参数
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
		
		//1.文件路径
		String path="E:/Lianxi/"+filename;
		//如果是中文名
		filename = "颤三.jpg";
		filename = URLEncoder.encode(filename,"UTF-8");
		
		
		//2.给输入流赋值
		inputStream = new FileInputStream(path);
		//3.通过outputStream返回数据给客户端
		return "success";
		
	}
	
}
