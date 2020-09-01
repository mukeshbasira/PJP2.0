package com.app.controller;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.app.Structure.localStructure;
import com.app.inputOutput.InputHandler;

@Controller
@SessionAttributes("name")
public class TodoController {


	@Autowired
	InputHandler inputHandler;

	@RequestMapping(value = { "/", "/welcome" }, method = RequestMethod.GET)
	public String welcome() {
		return "welcome";
	}

	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public String main() {
		return "input";
	}

	@RequestMapping(value = "/Twodate", method = RequestMethod.POST)
	public String twodate(@RequestParam("date1") String date1, @RequestParam("date2") String date2,
			Model m)
					throws Exception {
		ArrayList<Optional<String>> stringsList = new ArrayList<Optional<String>>();
		stringsList.add(Optional.of(date1));
		stringsList.add(Optional.of(date2));


		inputHandler.setuserTwoDateInput(stringsList);
		localStructure parserAPI = inputHandler.parserAPI(InputHandler.optionIntegerONE);
		m.addAttribute("result", parserAPI.getResult());

		return "result";
	}

	@RequestMapping(value = "/singleDate", method = RequestMethod.POST)
	public String twodate(@RequestParam("date1") String date1, Model m)
			throws Exception {
		ArrayList<Optional<String>> stringsList = new ArrayList<Optional<String>>();
		stringsList.add(Optional.of(date1));

		inputHandler.setuserTwoDateInput(stringsList);
		localStructure parserAPI = inputHandler.parserAPI(InputHandler.optionIntegerTHREE);
		m.addAttribute("result", parserAPI.getResult());
		return "result";
	}

	@RequestMapping(value = "/addNdDays", method = RequestMethod.POST)
	public String addNdDays(@RequestParam("date1") String date1, @RequestParam("date2") String date2, Model m)
			throws Exception {
		ArrayList<Optional<String>> stringsList = new ArrayList<Optional<String>>();
		stringsList.add(Optional.of(date1));
		stringsList.add(Optional.of(date2));

		inputHandler.setuserTwoDateInput(stringsList);
		localStructure parserAPI = inputHandler.parserAPI(InputHandler.optionIntegerTWO);
		m.addAttribute("result", parserAPI.getResult());
		return "result";
	}

	@RequestMapping(value = "/subNdDays", method = RequestMethod.POST)
	public String subNdDays(@RequestParam("date1") String date1, @RequestParam("date2") String date2,
			Model m)
					throws Exception {
		ArrayList<Optional<String>> stringsList = new ArrayList<Optional<String>>();
		stringsList.add(Optional.of(date1));
		stringsList.add(Optional.of(date2));


		inputHandler.setuserTwoDateInput(stringsList);
		localStructure parserAPI = inputHandler.parserAPI(InputHandler.optionIntegerFOUR);
		m.addAttribute("result", parserAPI.getResult());
		return "result";
	}

	@RequestMapping(value = "/week", method = RequestMethod.POST)
	public String week(@RequestParam("date1") String date1, Model m) throws Exception {
		ArrayList<Optional<String>> stringsList = new ArrayList<Optional<String>>();
		stringsList.add(Optional.of(date1));

		inputHandler.setuserTwoDateInput(stringsList);
		localStructure parserAPI = inputHandler.parserAPI(InputHandler.optionIntegerFIVE);
		m.addAttribute("result", parserAPI.getResult());
		return "result";
	}




}