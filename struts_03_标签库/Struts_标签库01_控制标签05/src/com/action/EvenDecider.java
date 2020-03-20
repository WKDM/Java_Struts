package com.action;

import org.apache.struts2.util.SubsetIteratorFilter.Decider;

public class EvenDecider implements Decider {

	@Override
	public boolean decide(Object arg0) throws Exception {
		int i = ((Integer)arg0).intValue();
		return (((i%2)==0)?true:false);
	}

}
