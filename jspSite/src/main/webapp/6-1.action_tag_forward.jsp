<%@page import="com.itwill.student.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	System.out.println("6-1.action_forward.jsp");
	/*
	forwading
		- 6-1. action_tag_forwarded.jsp 로 HTTP요청을 
	*/
	request.setAttribute("id", "guard");
	request.setAttribute("name", "박주용");
	request.setAttribute("age", 28);
	request.setAttribute("student", new Student());
	
	RequestDispatcher rd = request.getRequestDispatcher("6-1.action_tag_forwarded.jsp");
	rd.forward(request, response);
%>
<%-- 
<jsp:forward page="6-1.action_tag_forwarded.jsp"/>
--%>