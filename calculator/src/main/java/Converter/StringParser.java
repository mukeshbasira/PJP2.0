package Converter;

import java.util.Date;
import java.util.Optional;

public interface StringParser {
	Optional<Date> parser(String input);

}
