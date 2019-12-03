package com.Excercise39Ajax.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalculateSalaryServlet
 */
@WebServlet("/CalculateSalaryServlet")
public class CalculateSalaryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		response.setContentType("text/html charset=utf'utf-8'");
		PrintWriter output=response.getWriter();
		
		output.append("estamos en el servlet");
		output.close();
	}

}
