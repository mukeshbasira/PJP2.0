package com.app;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import com.app.algo.AlgorithmIntraday;
import com.app.algo.AlgorithmNormaltrade;
import com.app.algo.algorithms;
import com.app.attribute.Attribute;
import com.app.attribute.AttributeWriting;
import com.app.dataReader.CsvReader;
import com.app.dataReader.CsvWriter;
import com.app.dataReader.Reader;

public class AppRunner {

	public static void main(String[] args) throws FileNotFoundException, IOException, Exception {
		// TODO Auto-generated method stub
		Reader reader = new CsvReader();
		ArrayList<Attribute> shows = reader.show("Sample_Data_Fee_Calculator.csv");
		algorithms algorithms = new AlgorithmIntraday();
		System.out.println("------");



		algorithms.cost(shows);
		ArrayList<AttributeWriting> transArrayList1 = algorithms.getTransArrayList();

		System.out.println("------" + "Intraday" + "------");
		for (AttributeWriting attributeWriting : transArrayList1) {
			System.out.println(attributeWriting);

		}

		algorithms = new AlgorithmNormaltrade();
		algorithms.cost(shows);
		System.out.println("------" + "NORMAL TRADES" + "------");

		ArrayList<AttributeWriting> transArrayList2 = algorithms.getTransArrayList();
		for (AttributeWriting attributeWriting : transArrayList2) {
			System.out.println(attributeWriting);
		}
		transArrayList1.addAll(transArrayList2);

		CsvWriter csvWriter = new CsvWriter();
		csvWriter.save("FEE.csv", transArrayList1);


	}

}
