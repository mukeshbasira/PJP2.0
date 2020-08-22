package InputOutputConstants;

import java.util.List;
import java.util.Optional;

public interface StandardIn {


	Optional<Integer> userIntegerInput();

	Optional<String> UserInputString(String message1);

	List<Optional<String>> UserTwoDateInput(String message1, String message2);




}
