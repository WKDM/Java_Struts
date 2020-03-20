package com.action;

import java.io.File;

import com.opensymphony.xwork2.ActionSupport;

public class FileUploadAction extends ActionSupport {
	private static final long serialVersionUID=1L;
	private File filephoto;//文件名称
	private String filephotoContentType;//文件类型
	private String filephotoFileName;//文件名
	public File getFilephoto() {
		return filephoto;
	}
	public void setFilephoto(File filephoto) {
		this.filephoto = filephoto;
	}
	public String getFilephotoContentType() {
		return filephotoContentType;
	}
	public void setFilephotoContentType(String filephotoContentType) {
		this.filephotoContentType = filephotoContentType;
	}
	public String getFilephotoFileName() {
		return filephotoFileName;
	}
	public void setFilephotoFileName(String filephotoFileName) {
		this.filephotoFileName = filephotoFileName;
	}
	public String upload(){
		if(filephoto!=null){
			String uploadfile = "E:/Lianxi/javaweb/0000";//上传的文件保存的路径
			File saveFile = new File(uploadfile,filephotoFileName);//上传文件在服务器的具体位置
			//将上传文件从临时文件复制到指定文件
			filephoto.renameTo(saveFile);
		}else{
			return "input";
		}
		return "success";		
	}
}
