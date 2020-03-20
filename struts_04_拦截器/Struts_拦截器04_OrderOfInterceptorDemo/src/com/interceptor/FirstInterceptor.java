package com.interceptor;

import org.eclipse.jdt.internal.compiler.ast.Invocation;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class FirstInterceptor extends AbstractInterceptor{
	private static final long serialVersionUID=1L;
	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		System.out.println("第一个拦截器，在调用下一个拦截器或Action前");
		String result= invocation.invoke();//调用下一个拦截器
		System.out.println("第一个拦截器，在调用下一个拦截器或Action后");
		return result;
	}
	
}
