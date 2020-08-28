package com.app.dataReader;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import com.app.attribute.AttributeWriting;

public class CsvWriter {
	private static final String COMMA_DELIMITER = ",";
	private static final String NEW_LINE_SEPARATOR = "\n";
	private static final String FILE_HEADER = "city/Country,gender,avgincome(USD)";



	public CsvWriter() {
	}



	public void save(String fileLocationString, ArrayList<AttributeWriting> session) throws Exception {

		FileWriter fileWriter = null;

		try {
			File file = new File(fileLocationString);
			Boolean boolean1 = file.exists();
			//			System.out.println(boolean1);
			//not append
			fileWriter = new FileWriter(fileLocationString);

			// Write the CSV file header
			// uncomment it if you are appending

			//			if (!boolean1) {

			fileWriter.append(FILE_HEADER.toString());
			fileWriter.append(NEW_LINE_SEPARATOR);
			//			}


			// Add a new line separator after the header

			for (AttributeWriting attributeWriting : session) {

				fileWriter.append(attributeWriting.getCityOrCountry());

				fileWriter.append(COMMA_DELIMITER);

				fileWriter.append(attributeWriting.getGender());

				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(attributeWriting.getAvgincome().toString());

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
}
