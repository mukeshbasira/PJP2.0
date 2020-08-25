package Converter;



import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.joestelmach.natty.DateGroup;
import com.joestelmach.natty.Parser;

public class StringtoDateParser implements StringParser {
	static Parser parser = new Parser();

	@Override
	public Optional<Date> parser(String input) {

		List<DateGroup> parse = parser.parse(input);

		if (parse.isEmpty()) {
			return Optional.empty();
		}
		Optional<Date> date = Optional.of(parse.get(0).getDates().get(0));
		return date;

	}



}
