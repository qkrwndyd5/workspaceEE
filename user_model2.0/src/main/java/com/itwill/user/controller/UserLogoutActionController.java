package com.itwill.user.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itwill.summer.mvc.Controller;
import com.itwill.user.User;
import com.itwill.user.UserServiceImpl;

public class UserLogoutActionController implements Controller{
	
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		String forwardPath="";
		/****************login_check*******************/
		
		/*********************************************/
		request.getSession().invalidate();
		forwardPath="redirect:user_main.do";
		return forwardPath;
	}

}
