package com.action;

import java.io.File;

import com.opensymphony.xwork2.ActionSupport;

public class FileUploadAction extends ActionSupport {
	private static final long serialVersionUID=1L;
	private File filephoto;//�ļ�����
	private String filephotoContentType;//�ļ�����
	private String filephotoFileName;//�ļ���
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
			String uploadfile = "E:/Lianxi/javaweb/0000";//�ϴ����ļ������·��
			File saveFile = new File(uploadfile,filephotoFileName);//�ϴ��ļ��ڷ������ľ���λ��
			//���ϴ��ļ�����ʱ�ļ����Ƶ�ָ���ļ�
			filephoto.renameTo(saveFile);
		}else{
			return "input";
		}
		return "success";		
	}
}
