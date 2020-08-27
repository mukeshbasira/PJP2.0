package com.app.dataReader;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import com.app.attribute.AttributeWriting;

public class CsvWriter {
	private static final String COMMA_DELIMITER = ",";
	private static final String NEW_LINE_SEPARATOR = "\n";
	private static final String FILE_HEADER = " Client Id,Transaction Date,Priority Flag,Transaction Type,FEE";

	// Map<String, String> FILE_HEADER = new HashMap<String, String>();


	public CsvWriter() {
		// FILE_HEADER.put("external_Transaction_Id", "External Transaction Id");
		//		FILE_HEADER.put("client_Id", "Client Id");
		//		FILE_HEADER.put("security_Id", "Security Id");
		//		FILE_HEADER.put("transaction_Date", "Transaction Date");
		//		FILE_HEADER.put("market_Value", "Market Value");
		//		FILE_HEADER.put("priority_Flag", "Priority Flag");
		//		FILE_HEADER.put("transaction_Type", "Transaction Type");
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

				fileWriter.append(attributeWriting.getClient_Id());

				fileWriter.append(COMMA_DELIMITER);
				fileWriter
				.append(new SimpleDateFormat("MM/dd/yyyy").format(attributeWriting.getTransaction_Date())
						.toString());

				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(attributeWriting.getPriority_Flag());
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(attributeWriting.getTransaction_Type());
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(attributeWriting.getProcessFEEInteger().toString());
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
