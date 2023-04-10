package com.study;

import java.io.*;
import java.util.*;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;

@WebServlet("/list")
public class ListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ListServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1. request.param
		
		//2.busineess logic
		HttpSession session = request.getSession();
    	Object o = session.getAttribute("db");
    	
		if (o == null) {
			o = new ArrayList<String>();
			session.setAttribute("db", o);
		}
		
		//3.add attribute
    	//request.setAttribute("list", o);
		request.setAttribute("list", List.of("서태웅", "강백호", "채치수"));
		//4.fowrad/ redircet
    	
    	//add attribute
    
    	//forward / redirect
    	String view = "/WEB-INF/view/list.jsp";
    	request.getRequestDispatcher(view).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
