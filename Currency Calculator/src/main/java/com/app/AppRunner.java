package com.app;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import com.app.algo.Algo;
import com.app.attribute.Attribute;
import com.app.attribute.AttributeWriting;
import com.app.dataReader.CsvReader;
import com.app.dataReader.CsvWriter;
import com.app.dataReader.Reader;

public class AppRunner {

	public static void main(String[] args) throws FileNotFoundException, IOException, Exception {
		// TODO Auto-generated method stub
		Reader reader = new CsvReader();
		ArrayList<Attribute> show = reader.show("Sample input file Assignment 3.csv");
		//		for (Attribute attribute : show) {
		//			System.out.println(attribute);
		//		}
		Algo algo  = new Algo();
		ArrayList<AttributeWriting> calculate = algo.calculate(show);

		//		ArrayList<AttributeWriting> calculate

		CsvWriter csvWriterr = new CsvWriter();
		csvWriterr.save("out.csv", calculate);


	}

}
