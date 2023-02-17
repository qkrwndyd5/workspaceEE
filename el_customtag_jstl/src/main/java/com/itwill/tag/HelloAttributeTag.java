package com.itwill.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

public class HelloAttributeTag extends TagSupport{
	private String irum;
	public HelloAttributeTag() {
		System.out.println("1.HelloAttributeTag기본생성자");
	}
	
	
	public void setIrum(String irum) {
		System.out.println("2.setIrum("+irum+")");
		this.irum = irum;
	}


	@Override
	public int doStartTag() throws JspException {
		
		return super.doStartTag();
	}
	@Override
	public int doEndTag() throws JspException {
		
		return super.doEndTag();
	}
}
