<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="userInfo" class="com.byzx.model.UserInfo"></jsp:useBean>
<jsp:setProperty property="userId" name="userInfo" param="userId"/>
<jsp:setProperty property="userName" name="userInfo" param="userName"/>
<jsp:setProperty property="password" name="userInfo" param="password"/>

	<h1>用户编号：<jsp:getProperty property="userId" name="userInfo"/></h1>
	<h1>用户姓名：<jsp:getProperty property="userName" name="userInfo"/></h1>
	<h1>用户密码：<jsp:getProperty property="password" name="userInfo"/></h1>
</body>
</html>