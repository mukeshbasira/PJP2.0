package com.app.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.inputOutput.InputHandler;

@WebServlet(urlPatterns = "/main")
public class main extends HttpServlet {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	InputHandler inputHandler;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");

		RequestDispatcher view = req.getRequestDispatcher("/WEB-INF/views/input.jsp");

		view.forward(req, resp);

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		doGet(req, resp);

	}
}