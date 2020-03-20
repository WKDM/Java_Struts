package com.action;

import java.util.Comparator;

public class ListComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		//比较字符串长短，如果o1长，返回1；o2长，则返回-1；否则返回0
		if(o1.length()>o2.length()){
			return 1;
		}else if(o1.length()<o2.length()){
			return -1;
		}else{
			return 0;
		}
		
	}

}
