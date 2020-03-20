package com.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class ThirdInterceptor extends AbstractInterceptor {
	private static final long serialVersionUID=1L;
	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		System.out.println("第三个拦截器，在调用下一个拦截器或Action前");
		String result = invocation.invoke();
		System.out.println("第三个拦截器，在调用下一个拦截器或Action前");
		return result;
	}

}
