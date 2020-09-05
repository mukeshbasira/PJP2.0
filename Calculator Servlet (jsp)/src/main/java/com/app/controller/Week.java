package com.app.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Optional;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.Structure.localStructure;
import com.app.inputOutput.InputHandler;

@WebServlet(urlPatterns = "/Week")
public class Week extends HttpServlet {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	InputHandler inputHandler = new InputHandler();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		ArrayList<Optional<String>> stringsList = new ArrayList<Optional<String>>();
		System.out.println(req.getParameter("date1"));
		stringsList.add(Optional.of(req.getParameter("date1")));

		System.out.println(stringsList);
		inputHandler.setuserTwoDateInput(stringsList);

		try {

			localStructure parserAPI = inputHandler.parserAPI(InputHandler.optionIntegerFIVE);
			req.setAttribute("result", parserAPI.getResult());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		RequestDispatcher view = req.getRequestDispatcher("/WEB-INF/views/result.jsp");

		view.forward(req, resp);

	}

}
