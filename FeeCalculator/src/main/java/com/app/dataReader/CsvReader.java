package com.app.dataReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.app.attribute.Attribute;

public class CsvReader implements Reader {
	private static final String COMMA_DELIMITER = ",";
	private static final String NEW_LINE_SEPARATOR = "\n";

	// CSV file header
	Map<String, String> FILE_HEADER = new HashMap<String, String>();


	public CsvReader() {
		//		FILE_HEADER.put("external_Transaction_Id", "External Transaction Id");
		//		FILE_HEADER.put("client_Id", "Client Id");
		//		FILE_HEADER.put("security_Id", "Security Id");
		//		FILE_HEADER.put("transaction_Date", "Transaction Date");
		//		FILE_HEADER.put("market_Value", "Market Value");
		//		FILE_HEADER.put("priority_Flag", "Priority Flag");
		//		FILE_HEADER.put("transaction_Type", "Transaction Type");
	}





	public ArrayList<Attribute> show(
			String fileLocationString)
					throws FileNotFoundException, IOException, Exception {
		BufferedReader fileReader = null;

		try {

			// Create a new list of student to be filled by CSV file data

			String line = "";
			ArrayList<Attribute> showresult = new ArrayList();

			// Create the file reader
			fileReader = new BufferedReader(new FileReader(fileLocationString));

			// Read the CSV file header to skip it
			fileReader.readLine();

			// Read the file line by line starting from the second line
			while ((line = fileReader.readLine()) != null) {
				// Get all tokens available in line

				SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");



				String[] tokens = line.split(COMMA_DELIMITER);
				if (tokens.length > 0) {
					// System.out.println(tokens);
					Attribute attribute = new Attribute(
							tokens[0], tokens[1], tokens[2], tokens[3], formatter.parse(tokens[4]), tokens[5],
							tokens[6].charAt(0));
					showresult.add(attribute);
				}


			}

			//			for (Attribute attribute : showresult) {
			//				System.out.println(attribute.toString());
			//			}
			return showresult;
		} catch (Exception e) {
			System.out.println("Error in CsvFileReader !!!");
			e.printStackTrace();
		} finally {
			try {
				fileReader.close();
			} catch (IOException e) {
				System.out.println("Error while closing fileReader !!!");
				e.printStackTrace();
			}
		}

		return null;
	}

	//	@Override
	//	public void addSession(ArrayList<localStructure> list) {
	//		this.sessionList = list;
	//
	//	}

}
