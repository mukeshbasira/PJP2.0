package com.app;


import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.app.Structure.localStructure;
import com.app.dao.LocalstructureDaoImpl;
import com.app.inputOutput.InputHandler;
import com.app.inputOutput.Output;


@SpringBootApplication

public class AppRunner implements CommandLineRunner {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	static Output standardOut;
	private static InputHandler inputHandler = new InputHandler();

	@Autowired
	LocalstructureDaoImpl repository;
	public static void main(String[] args) {
		SpringApplication.run(AppRunner.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		/////////////////////////////////////////////////
		////// FOR TESTING POSTGREPSQL NOT A FULLY SPRING BOOT APP///////////////
		/////////////////////////////////////////////////////////

		standardOut = new Output();
		while (true) {
			standardOut.mainOutput();
			System.out.println("/////////////////////////////////////////////////// "
					+ "\n////// FOR TESTING POSTGREPSQL select exit and postgressql dialog will run///////////////"
					+ "\n/////////////////////////////////////////////////////////");
			Integer inputInteger = inputHandler.takeUserIntegerInput("Select option->");

			if (inputHandler.IntegerHandler(inputInteger) == "EXIT") {
				break;
			}
			Thread.sleep(1000);
		}

		System.out.println("/////////////////////////////////////////////////// "
				+ "\n////// FOR TESTING POSTGREPSQL NOT A FULLY SPRING BOOT APP///////////////"
				+ "\n/////////////////////////////////////////////////////////");

		Integer inputInteger = inputHandler.takeUserIntegerInput(
				"Type the number of queries you want to automate and all will be saved to DB for stats ->");

		ArrayList<localStructure> allArrayList = com.app.dataGenerator.fakeApi.run(inputInteger);

		System.out.println("****************" + "FOR TESTING POSTGREPSQL" + "**************");
		for (localStructure localStructure : allArrayList) {

			repository.insert(localStructure);

		}
		System.out.println("****************" + "INSERTED ALL TO POSTGREPSQL" + "**************");

		//		List<localStructure> listAll = repository.listAll();
		//		for (localStructure localStructure : listAll) {
		//			System.out.println(localStructure.toString());
		//
		//		}

		System.out.println("/////////////////////////////////////////////////// "
				+ "\n////// STATS (will get previous postgres test session data also(not local history which is saved to csv in other file ) ///////////////"
				+
				"\n/////////////////////////////////////////////////////////");

		List<localStructure> listAll = repository.optionCondition(1);
		System.out.println("Number of times option 1 was seleted ->" + listAll.size());
		listAll = repository.optionCondition(2);
		System.out.println("Number of times option 2 was seleted ->" + listAll.size());

		listAll = repository.optionCondition(3);
		System.out.println("Number of times option 3 was seleted ->" + listAll.size());
		listAll = repository.optionCondition(4);
		System.out.println("Number of times option 4 was seleted ->" + listAll.size());
		listAll = repository.optionCondition(5);
		System.out.println("Number of times option 5 was seleted ->" + listAll.size());
		listAll = repository.selectedString("Addition");
		System.out.println("Number of times Additon query For n days was seleted ->" + listAll.size());
		listAll = repository.selectedString("Subtraction");
		System.out.println("Number of times Subtraction query For dates or n days was seleted ->" + listAll.size());
		listAll = repository.selectedString("NONE");
		System.out.println("Number of times simple query For dates or phrase was seleted ->" + listAll.size());



	}
}

