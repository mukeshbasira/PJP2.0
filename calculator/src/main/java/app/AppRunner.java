package app;

import inputOutput.InputHandler;
import inputOutput.Output;



public class AppRunner {

	static Output standardOut;

	public static void main(String[] args) throws Exception {


		InputHandler inputHandler = new InputHandler();

		standardOut = new Output();
		while(true) {
			standardOut.mainOutput();

			if(inputHandler.takeUserIntegerInput()=="EXIT")
			{
				break;
			}
			Thread.sleep(1000);
		}

	}






}
