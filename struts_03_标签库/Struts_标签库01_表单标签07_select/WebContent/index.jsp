<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
		<!-- 创建表单 -->
		<s:form action="action">
			<!-- 创建表单元素 -->
			<s:select label="年份" 
			name="months" 
			list="#{'01':'Jan','02':'Feb','03':'Meth' }"
			headerKey="-1" headerValue="选择月份"
			listKey="key" valueKey="value"/>
			<s:submit />
		</s:form>
	</center>
</body>
</html>