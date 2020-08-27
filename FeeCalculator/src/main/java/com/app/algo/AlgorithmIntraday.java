package com.app.algo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import com.app.CostConstants;
import com.app.attribute.Attribute;
import com.app.attribute.AttributeWriting;

public class AlgorithmIntraday implements algorithms {


	Set<AttributeWriting> transArrayList = new HashSet<AttributeWriting>();
	Set<Attribute> attributeList = new HashSet<Attribute>();

	public void cost(ArrayList<Attribute> transactionsArrayList) {
		// Integer costInteger = 0;
		Collections.sort(transactionsArrayList, new AlgoComparator());
		for (int i = 1; i < transactionsArrayList.size(); i++) {
			//			for (int j = i + 1; j < transactionsArrayList.size(); j++) {
			//				// compare list.get(i) and list.get(j)
			//			}
			Attribute attribute1 = transactionsArrayList.get(i - 1);
			Attribute attribute2 = transactionsArrayList.get(i);
			System.out.println(i);
			if (attribute1.equals(attribute2) && attribute1.getTransaction_Type() != attribute2.getTransaction_Type())

			{
				System.out.println(i);
				attributeList.add(attribute1);
				attributeList.add(attribute2);


				//				transArrayList.add(new AttributeWriting(attribute1.getClient_Id(),attribute1.getTransaction_Type(),
				//						attribute1.getTransaction_Date(), attribute1.getPriority_Flag(),
				//						amount(attribute1.getTransaction_Type())));
				//				transArrayList.add(new AttributeWriting(attribute2.getClient_Id(), attribute2.getTransaction_Type(),
				//						attribute2.getTransaction_Date(), attribute2.getPriority_Flag(),
				//						amount(attribute2.getTransaction_Type())));



			}
		}
		for (Attribute attribute1 : attributeList) {

			transArrayList.add(new AttributeWriting(attribute1.getClient_Id(), attribute1.getTransaction_Type(),
					attribute1.getTransaction_Date(), attribute1.getPriority_Flag(),
					amount(attribute1.getTransaction_Type())));

		}

		// costInteger = (costInteger + 1) * CostConstants.INTRA_INTEGER_BUY;



	}

	public ArrayList<AttributeWriting> getTransArrayList() {
		ArrayList<AttributeWriting> listFromSet = new ArrayList<AttributeWriting>(transArrayList);

		return listFromSet;
	}

	private Integer amount(String s) {
		if (s.equals("BUY")) {
			return CostConstants.INTRA_INTEGER_BUY;
		} else if (s.equals("SELL")) {
			return CostConstants.INTRA_INTEGER_SELL;
		}
		return 0;

	}




}
