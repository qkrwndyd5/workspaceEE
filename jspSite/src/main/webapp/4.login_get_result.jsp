<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	
	response.setContentType("UTF-8");
	/*
	 * 1.파라메타바끼
	  	아이디:<input type="text" name="id">
		패에쓰:<input type="password" name="pass">
	 */
	 String id = request.getParameter("id");
	 String pass = request.getParameter("pass");
	
	/*
	 * 2.업무실행(DB)
	 *  id |pass
	 *  ---------
	 *  xxx|1111
	 *  yyy|2222
	 */
	if(!((id.equals("xxxx")&& pass.equals("1111")) || (id.equals("yyyy")&& pass.equals("2222")))) {
		out.println("<h3>"+id+" 님 로그인실패</h3>");
		out.println("<a href='4.login_get_form.jsp'>다시로그인</a>");
		return;
	}
	
	/*
	 * 3.클라이언트로 결과전송
	 */
	 out.println("<h3>"+id+" 님 로그인성공</h3>");
	 out.println("<a href='index.jsp'>메인</a>");
	
%>    
