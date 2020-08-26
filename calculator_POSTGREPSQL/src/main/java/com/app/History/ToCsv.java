package com.app.History;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import com.app.Structure.localStructure;

public class ToCsv implements History {
	private static final String COMMA_DELIMITER = ",";
	private static final String NEW_LINE_SEPARATOR = "\n";
	ArrayList<localStructure> sessionList = new ArrayList<localStructure>();

	// CSV file header
	private static final String FILE_HEADER = "option,optionSelectedString,selectedString , userFirstDateString,"
			+ " userSecondDateString, result";

	private static final int OPTION = 1;
	private static final int OPTION_SELECTED_STRING = 2;
	private static final int SELECTED_STRING = 3;
	private static final int USER_FIRST_STRING = 4;
	private static final int USER_SECOND_STRING = 5;

	private static final int RESULT = 6;


	@Override
	public void save(String fileLocationString) throws Exception {

		FileWriter fileWriter = null;

		try {
			File file = new File(fileLocationString);
			Boolean boolean1 = file.exists();

			fileWriter = new FileWriter(fileLocationString, true);

			// Write the CSV file header

			if (!boolean1) {

				fileWriter.append(FILE_HEADER.toString());
				fileWriter.append(NEW_LINE_SEPARATOR);
			}

			// Add a new line separator after the header


			for (localStructure localStructure : sessionList) {
				fileWriter.append(localStructure.getOption().toString());
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(localStructure.getOptionSelectedString());
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(localStructure.getSelectedString());
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(localStructure.getUserFirstDateString());
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(localStructure.getUserSecondDateString());
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(localStructure.getResult());
				fileWriter.append(NEW_LINE_SEPARATOR);
			}

			System.out.println("CSV file was created successfully !!!");

		} catch (Exception e) {
			System.out.println("Error in CsvFileWriter !!!");
			e.printStackTrace();
		} finally {

			try {
				fileWriter.flush();
				fileWriter.close();
			} catch (IOException e) {
				System.out.println("Error while flushing/closing fileWriter !!!");
				e.printStackTrace();
			}

		}


	}

	@Override
	public ArrayList<localStructure> show(String fileLocationString)
			throws FileNotFoundException, IOException, Exception {
		BufferedReader fileReader = null;

		try {

			// Create a new list of student to be filled by CSV file data
			ArrayList<localStructure> showresult = new ArrayList<localStructure>();

			String line = "";

			// Create the file reader
			fileReader = new BufferedReader(new FileReader(fileLocationString));

			// Read the CSV file header to skip it
			fileReader.readLine();

			// Read the file line by line starting from the second line
			while ((line = fileReader.readLine()) != null) {
				// Get all tokens available in line
				String[] tokens = line.split(COMMA_DELIMITER);
				if (tokens.length > 0) {
					localStructure localStructure = new localStructure(Integer.parseInt(tokens[OPTION]),
							tokens[OPTION_SELECTED_STRING],
							tokens[SELECTED_STRING],
							tokens[USER_FIRST_STRING], tokens[USER_SECOND_STRING], tokens[RESULT]);
					showresult.add(localStructure);
				}
			}


			for (localStructure localStructure : showresult) {
				System.out.println(localStructure.toString());
			}
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

	@Override
	public void addSession(ArrayList<localStructure> list) {
		this.sessionList = list;

	}

}
