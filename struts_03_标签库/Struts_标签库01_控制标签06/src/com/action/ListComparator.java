package com.action;

import java.util.Comparator;

public class ListComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		//�Ƚ��ַ������̣����o1��������1��o2�����򷵻�-1�����򷵻�0
		if(o1.length()>o2.length()){
			return 1;
		}else if(o1.length()<o2.length()){
			return -1;
		}else{
			return 0;
		}
		
	}

}
