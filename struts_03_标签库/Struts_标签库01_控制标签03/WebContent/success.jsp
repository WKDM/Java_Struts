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
		<table border="1px" cellpadding="0" cellspacing="0">
			<s:iterator var="name" value="{'HTML','Java','CSS','JavaScript'}" status="st"><!-- 遍历集合 -->
				<!-- 判断奇偶，假如是奇数 -->
				<s:if test="#st.odd">
					<tr style="background-color:red;">
						<td><s:property value="name"/></td>
					</tr>
				</s:if>
				<!-- 如果是偶数 -->
				<s:else>
					<tr style="background-color:blue">
						<td><s:property value="name" /></td>
					</tr>
				</s:else>
			</s:iterator>
		</table>
	</center>
</body>
</html>