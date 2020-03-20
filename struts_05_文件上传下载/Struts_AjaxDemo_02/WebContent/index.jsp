<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
    <%@ taglib prefix="sx" uri="/struts-dojo-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<sx:head/>
	<script type="text/javascript">
		var XHR=false;
		function CreateXHR(){
			try{
				XHR = new ActiveXObject("msxml2.XMLHTTP");
			}catch(e1){
				try{
					XHR = new ActiveObject("microsoft.XMLHTTP");
				}catch(e2){
					try{
						XHR = new XMLHttpRequest();
					}catch(e3){
						XHR =false;
					}
				}
			}
		}
		
		function sendRequest(){
			CreateXHR();//创建XMLHttpRequest对象
			if(XHR){
				var name = document.getElementById("name").value;
				var password = document.getElementById("password").value;
				//要访问的url
				var uri ="http://localhost:8080/Struts_AjaxDemo_02/login.action?name=" + name + "&password=" + password;
				XHR.open("GET",uri,true);//访问open
				XHR.onreadystatechange = resultHander;//设置事件触发器
				XHR.send(null);//发送请求
			}
		}
		function resultHander(){
			//检查状态
			if(XHR.readyState == 4 && XHR.status == 200){
				//显示框架提示框
				alert(XHR.responseText);//显示提示框
			}
		}
	</script>
</head>
<body>	
	<center>
		Name:<input type="text" id="name" /><br />
		Password:<input type="password" id="password" /><br />
		<input type="button" value="ok" onclick="sendRequest()" />
	</center>
</body>
</html>