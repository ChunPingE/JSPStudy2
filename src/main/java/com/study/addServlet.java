package com.study;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.util.*;

@WebServlet("/add")
public class addServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String view = "/WEB-INF/view/add1.jsp";
		request.getRequestDispatcher(view).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 1. request.param
		String name = request.getParameter("name");

		// 2.busineess logic
		HttpSession session = request.getSession();
		Object o = session.getAttribute("db");

		if (o == null) {
			o = new ArrayList<String>();
			session.setAttribute("db", o);
		}
		List<String> list = (List<String>) o;
		list.add(name);
		// 3.add attribute

		// 4.fowrad/ redircet
		request.getRequestDispatcher("/list").forward(request, response);
	}
}
