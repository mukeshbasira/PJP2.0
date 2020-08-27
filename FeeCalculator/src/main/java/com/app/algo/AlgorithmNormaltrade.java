package com.app.algo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import com.app.CostConstants;
import com.app.attribute.Attribute;
import com.app.attribute.AttributeWriting;

public class AlgorithmNormaltrade implements algorithms {
	Set<AttributeWriting> transArrayList = new HashSet<AttributeWriting>();

	public void cost(ArrayList<Attribute> transactionsArrayList) {
		Collections.sort(transactionsArrayList, new AlgoComparator());
		int i = 0;
		Attribute attribute1 ;
		Attribute attribute2 ;
		Boolean lastBoolean = false;
		if (transactionsArrayList.size() == 1) {
			attribute1 = transactionsArrayList.get(i - 1);
			transArrayList.add(new AttributeWriting(attribute1.getClient_Id(), attribute1.getTransaction_Type(),
					attribute1.getTransaction_Date(), attribute1.getPriority_Flag(),
					amount(attribute1.getPriority_Flag(), attribute1.getTransaction_Type())));

		}
		for (i = 1; i < transactionsArrayList.size();) {

			attribute1 = transactionsArrayList.get(i - 1);
			attribute2 = transactionsArrayList.get(i);
			if (attribute1.equals(attribute2) && attribute1.getTransaction_Type() != attribute2.getTransaction_Type())

			{

				i += 2;


			} else {
				// System.out.println(i - 1);

				transArrayList.add(new AttributeWriting(attribute1.getClient_Id(), attribute1.getTransaction_Type(),
						attribute1.getTransaction_Date(), attribute1.getPriority_Flag(),
						amount(attribute1.getPriority_Flag(), attribute1.getTransaction_Type())));
				//				if (i == transactionsArrayList.size() - 1) {
				//					lastBoolean = true;
				//				}
				i += 1;


			}
		}
		if (i == transactionsArrayList.size())
		{
			//			System.out.println(i - 1);
			attribute1 = transactionsArrayList.get(i - 1);
			transArrayList.add(new AttributeWriting(attribute1.getClient_Id(), attribute1.getTransaction_Type(),
					attribute1.getTransaction_Date(), attribute1.getPriority_Flag(),
					amount(attribute1.getPriority_Flag(), attribute1.getTransaction_Type())));
		}




	}

	public ArrayList<AttributeWriting> getTransArrayList() {
		ArrayList<AttributeWriting> listFromSet = new ArrayList<AttributeWriting>(transArrayList);

		return listFromSet;
	}

	public Integer amount(char prior, String type) {
		if (prior == 'Y')
		{
			return CostConstants.NORMAL_INTEGER_HIGH_P;
		} else if (type.equals("SELL") || type.equals("WITHDRAW")) {
			return CostConstants.NORMAL_INTEGER_NORMAL_P_SEEL_AND_WITHDRAW;

		} else if (type.equals("BUY") || type.equals("DEPOSIT")) {
			return CostConstants.INTRA_INTEGER_NORMAL_BUY_AND_DEPOSIT;

		}

		return 0;

	}


}
