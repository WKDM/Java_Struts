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
		<s:form action="list">
			<table>
				<tr>
					<td></td>
					<td>第一列：</td>
					<td>第二列：</td>
				</tr>				
				<tr>
					<td>Name:</td>
					<!-- 提交map中的元素对，users[first]为名为first的元素，设置name属性 -->
					<td><s:textfield name="usrs[first].name" theme="simple"></s:textfield></td>
					<!-- 提交map中的元素对，users[second]为名为second的元素，设置name属性 -->
					<td><s:textfield name="usrs[second].name" theme="simple"></s:textfield></td>
				</tr>
				<tr>
					<td>Age:</td>
					<!-- 提交map中的元素对，users[first]为名为first的元素，设置age属性 -->
					<td><s:textfield name="usrs[first].age" theme="simple"></s:textfield></td>
					<!-- 提交map中的元素对，users[second]为名为second的元素，设置age属性 -->
					<td><s:textfield name="usrs[second].age" theme="simple"></s:textfield></td>					
				</tr>
				<tr>
					<td>Tel:</td>
					<!-- 提交map中的元素对，users[first]为名为first的元素，设置tel属性 -->
					<td><s:textfield name="usrs[first].tel" theme="simple"></s:textfield></td>
					<!-- 提交map中的元素对，users[second]为名为second的元素，设置tel属性 -->
					<td><s:textfield name="usrs[second].tel" theme="simple"></s:textfield></td>
				</tr>
				<tr>
					<td colspan="3"><s:submit value="提交"></s:submit></td>
				</tr>
			</table>
		</s:form>
	</center>
</body>
</html>