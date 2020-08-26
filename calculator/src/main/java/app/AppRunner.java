package app;



import inputOutput.InputHandler;
import inputOutput.Output;


public class AppRunner {

	static Output standardOut;
	private static InputHandler inputHandler = new InputHandler();

	public static void main(String[] args) throws Exception {
		//



		standardOut = new Output();
		while (true) {
			standardOut.mainOutput();
			Integer inputInteger = inputHandler.takeUserIntegerInput("Select option->");

			if (inputHandler.IntegerHandler(inputInteger) == "EXIT") {
				break;
			}
			Thread.sleep(1000);
		}

	}






	}



//Parser parser = new Parser();
//List<DateGroup> parse = parser.parse("9-Years-14-days");
//
//for(DateGroup group:parse) {
//	List dates = group.getDates();
//	System.out.println(dates);
//	int line = group.getLine();
//	int column = group.getPosition();
//	String matchingValue = group.getText();
//	System.out.println(matchingValue);
//	String syntaxTree = group.getSyntaxTree().toStringTree();
//	System.out.println(syntaxTree);
//
//	boolean isRecurreing = group.isRecurring();
//
//	Date recursUntil = group.getRecursUntil();
//}
