package com.app.resource;


import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.Structure.localStructure;
import com.app.inputOutput.InputHandler;
import com.fasterxml.jackson.databind.JsonNode;

@RestController
public class StructResource {

	@Autowired
	private InputHandler inputHandler;

	@PostMapping("/date/twodate")
	public localStructure twodate(@RequestBody JsonNode payload) throws Exception {

		if (payload.has("date1") && payload.has("date2")) {
			ArrayList<Optional<String>> stringsList = new ArrayList<Optional<String>>();
			stringsList.add(Optional.of(payload.get("date1").toString()));
			stringsList.add(Optional.of(payload.get("date2").toString()));

			inputHandler.setuserTwoDateInput(stringsList);
			localStructure parserAPI = inputHandler.parserAPI(InputHandler.optionIntegerONE);
			return parserAPI;
		}
		return new localStructure(0, "NO date", "JSON format error", "Error parsing", "Error parsing", "NO DATE");

	}

	@PostMapping("/date/AddNdays")
	public localStructure AddNdays(@RequestBody JsonNode payload) throws Exception {


		if (payload.has("date1") && payload.has("NdateString")) {
			ArrayList<Optional<String>> stringsList = new ArrayList<Optional<String>>();
			stringsList.add(Optional.of(payload.get("date1").toString()));
			stringsList.add(Optional.of(payload.get("NdateString").toString()));

			inputHandler.setuserTwoDateInput(stringsList);
			localStructure parserAPI = inputHandler.parserAPI(InputHandler.optionIntegerTWO);
			return parserAPI;
		}
		return new localStructure(0, "NO date", "JSON format error", "Error parsing", "Error parsing", "NO DATE");

	}

	@PostMapping("/date/SubNdays")
	public localStructure SubNdays(@RequestBody JsonNode payload) throws Exception {

		if (payload.has("date1") && payload.has("NdateString")) {
			ArrayList<Optional<String>> stringsList = new ArrayList<Optional<String>>();
			stringsList.add(Optional.of(payload.get("date1").toString()));
			stringsList.add(Optional.of(payload.get("NdateString").toString()));

			inputHandler.setuserTwoDateInput(stringsList);
			localStructure parserAPI = inputHandler.parserAPI(InputHandler.optionIntegerFOUR);
			return parserAPI;
		}
		return new localStructure(0, "NO date", "JSON format error", "Error parsing", "Error parsing", "NO DATE");

	}

	@PostMapping("/date/weeknumber")
	public localStructure weeknumber(@RequestBody JsonNode payload) throws Exception {

		if (payload.has("date1")) {
			ArrayList<Optional<String>> stringsList = new ArrayList<Optional<String>>();
			stringsList.add(Optional.of(payload.get("date1").toString()));


			inputHandler.setuserTwoDateInput(stringsList);
			localStructure parserAPI = inputHandler.parserAPI(InputHandler.optionIntegerFIVE);
			return parserAPI;
		}
		return new localStructure(0, "NO date", "JSON format error", "Error parsing", "Error parsing", "NO DATE");

	}

	@PostMapping("/date/phrase")
	public localStructure phrase(@RequestBody JsonNode payload) throws Exception {

		if (payload.has("date1")) {
			ArrayList<Optional<String>> stringsList = new ArrayList<Optional<String>>();
			stringsList.add(Optional.of(payload.get("date1").toString()));

			inputHandler.setuserTwoDateInput(stringsList);
			localStructure parserAPI = inputHandler.parserAPI(InputHandler.optionIntegerTHREE);
			return parserAPI;
		}
		return new localStructure(0, "NO date", "JSON format error", "Error parsing", "Error parsing", "NO DATE");

	}



}
