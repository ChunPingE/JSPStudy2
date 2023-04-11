package com.study;

import java.io.*;
import java.util.*;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;

@WebServlet("/update")
public class updateServelt extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//parametr
		int index = Integer.parseInt(request.getParameter("index"));
		String name = request.getParameter("name");
		
		//bussiness logic
		HttpSession session = request.getSession();
		List<String> list = (List<String>) session.getAttribute("db");
		list.set(index, name);

		//foward
		request.getRequestDispatcher("/list").forward(request, response);
	}
}
