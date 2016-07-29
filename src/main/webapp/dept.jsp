<%@page import="com.hybrid.domain.Dept"%>
<%@page import="java.util.List"%>
<%@page import="com.hybrid.mapper.DeptMapper"%>
<%@page import="org.springframework.web.context.support.WebApplicationContextUtils"%>
<%@page import="org.springframework.context.ApplicationContext"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>dept.jsp</title>
</head>
<body>
<h1>2nd Dept Test</h1>

<%
	ApplicationContext ctx = WebApplicationContextUtils.getRequiredWebApplicationContext(this.getServletContext());
	DeptMapper mapper = ctx.getBean(DeptMapper.class);
	mapper.delete(70);
	mapper.delete(75);
	
	mapper.insert(new Dept(70, "Admit", "Ilsan"));
	List<Dept> depts = mapper.selectAll();
	for (Dept dept : depts) {
		System.out.println(dept);
		out.println(dept + "<br>");
	}
	
	System.out.println("=========================");
	out.println("<hr>");
	mapper.update(new Dept(70,"Admit2", "Paju"));
	depts = mapper.selectAll();
	for (Dept dept : depts) {
		System.out.println(dept);
		out.println(dept + "<br>");
	}
	
	System.out.println("=========================");
	out.println("<hr>");
	mapper.delete(70);
	depts = mapper.selectAll();
	for (Dept dept : depts) {
		System.out.println(dept);
		out.println(dept + "<br>");
	}
%>
</body>
</html>