package com.interceptor;

import org.eclipse.jdt.internal.compiler.ast.Invocation;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class FirstInterceptor extends AbstractInterceptor{
	private static final long serialVersionUID=1L;
	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		System.out.println("��һ�����������ڵ�����һ����������Actionǰ");
		String result= invocation.invoke();//������һ��������
		System.out.println("��һ�����������ڵ�����һ����������Action��");
		return result;
	}
	
}
