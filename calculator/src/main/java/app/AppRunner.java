package app;

import History.History;
import History.ToSerialize;
import inputOutput.InputHandler;
import inputOutput.Output;



public class AppRunner {

	static Output standardOut;

	public static void main(String[] args) throws Exception {
		History history = new ToSerialize();


		standardOut = new Output();
		standardOut.mainOutput();
		InputHandler inputHandler = new InputHandler();
		inputHandler.setSession(history);
		inputHandler.takeUserIntegerInput();
		history.save("save.ser");
		// history.show("save.ser");


	}

}
