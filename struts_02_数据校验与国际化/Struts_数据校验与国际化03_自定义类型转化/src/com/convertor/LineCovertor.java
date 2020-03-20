package com.convertor;

import java.util.Map;
import org.apache.struts2.util.StrutsTypeConverter;

import freemarker.cache.StatefulTemplateLoader;

public class LineCovertor extends StrutsTypeConverter {

	@Override
	public Object convertFromString(Map context, String[] values, Class totype) {
		String[] params =(String[])values;
		String param=params[0];
		Line line=new Line();
		StringBuilder temp = new StringBuilder();
		char ch;
		int j=0;
		
		for(int index=0;index<param.length();index++){
			ch=param.charAt(index);
			if(ch!=','&&ch!='('&&ch!=')'){
				temp.append(ch);
			}else if(ch==','||ch==')'){
				switch(j){
					case 0:
					{
						line.setX1(Integer.parseInt(temp.toString()));
						temp.delete(0,temp.length());
						break;
					}
					case 1:
					{
						line.setY1(Integer.parseInt(temp.toString()));
						temp.delete(0,temp.length());
						break;
					}
					case 2:
					{
						line.setX2(Integer.parseInt(temp.toString()));
						temp.delete(0,temp.length());
						break;
					}
					case 3:
					{
						line.setY2(Integer.parseInt(temp.toString()));
						temp.delete(0,temp.length());
						break;
					}
					default:
						break;
				}
				j++;
			}
		}
		return (Object)line;
	}

	@Override
	public String convertToString(Map context, Object o) {
		Line line = (Line)o;
		return "("+line.getX1()+","+line.getY1()+","+line.getX2()+","+line.getY2()+")";
	}

}
