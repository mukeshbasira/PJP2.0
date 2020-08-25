package app;

import inputOutput.InputHandler;
import inputOutput.Output;



public class AppRunner {

	static Output standardOut;

	public static void main(String[] args) throws Exception {



		standardOut = new Output();
		standardOut.mainOutput();
		InputHandler inputHandler = new InputHandler();

		inputHandler.takeUserIntegerInput();




	}

}
