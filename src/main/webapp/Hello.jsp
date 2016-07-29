<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello.jsp</title>
</head>
<body>
<% for (int i=1; i<=7; i++) { %>
	<h1>Web2 Hello.jsp 실행 확인됨 # <%= i %></h1>
<% } %>
</body>
</html>