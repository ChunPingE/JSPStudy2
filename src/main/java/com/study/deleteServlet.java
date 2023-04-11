package com.study;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.util.*;

@WebServlet("/delete")
public class deleteServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int index = Integer.parseInt(request.getParameter("index"));
		HttpSession session = request.getSession();
		List<String> list = (List<String>) session.getAttribute("db");
		list.remove(index);
    	
    	request.getRequestDispatcher("/list").forward(request, response);
	}
}
