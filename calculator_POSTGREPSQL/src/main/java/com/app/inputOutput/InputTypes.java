package com.app.inputOutput;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class InputTypes {





	private Optional<String> date1;

	private Optional<String> date2;
	private Scanner input;

	public List<Optional<String>> UserTwoDateInput(String message1, String message2) {
		System.out.println(message1);
		input = new Scanner(System.in);

		date1 = Optional.of(input.nextLine());


		System.out.println(message2);

		date2 = Optional.of(input.nextLine());



		return Arrays.asList(date1, date2);

	}




	public Optional<Integer> userIntegerInput() {
		input = new Scanner(System.in);

		Optional<Integer> optionInteger = null;
		try {
			optionInteger = Optional.of(input.nextInt());
		} catch (InputMismatchException e) {
			System.out.println("NOT VALID OPTION ERROR"); // TODO Auto-generated catch block
			e.printStackTrace();
		}
		return optionInteger;


	}


	public Optional<String> UserInputString(String message1) {
		System.out.println(message1);
		input = new Scanner(System.in);

		date1 = Optional.of(input.nextLine());


		return date1;

	}


}
