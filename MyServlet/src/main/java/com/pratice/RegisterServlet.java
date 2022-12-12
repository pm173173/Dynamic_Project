package com.pratice;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		String name = req.getParameter("user_name");
		String password = req.getParameter("user_password");
		String email = req.getParameter("user_email");
		String gender = req.getParameter("user_gender");
		String course = req.getParameter("user_course");

		String cond = req.getParameter("condition");
		if (cond != null) {
			if (cond.equals("checked")) {
				out.println("<h2>name : " + name + "</h2>");
				out.println("<h2>password : " + password + "</h2>");
				out.println("<h2>email : " + email + "</h2>");
				out.println("<h2>gender : " + gender + "</h2>");
				out.println("<h2>course : " + course + "</h2>");
			}
		} else
			out.println("<h2>You not check the terms and condition</h2>");
	}

}
