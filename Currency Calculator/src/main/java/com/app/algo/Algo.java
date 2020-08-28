package com.app.algo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.app.ConverterToDolllar;
import com.app.attribute.Attribute;
import com.app.attribute.AttributeWriting;

public class Algo {

	ArrayList<AttributeWriting> resultArrayList = new ArrayList<AttributeWriting>();
	ConverterToDolllar converterToDolllar = new ConverterToDolllar();

	public ArrayList<AttributeWriting> calculate(ArrayList<Attribute> show)

	{

		Map<String, HashMap<String, Float>> hm = new HashMap<String, HashMap<String, Float>>();

		for (Attribute attribute : show) {
			HashMap<String, Float> checkHashMap = new HashMap<String, Float>();

			if (!attribute.getCountry().isBlank()) {

				if (hm.containsKey(attribute.getCountry())) {

					if (hm.get(attribute.getCountry()).containsKey(attribute.getGender()))
					{
						Float currentsumFloat = hm.get(attribute.getCountry()).get(attribute.getGender());

						hm.get(attribute.getCountry()).put(attribute.getGender(),
								currentsumFloat + converterToDolllar(attribute.getCurrency(),
										attribute.getAvgIncomeInteger()));


					}else {


						hm.get(attribute.getCountry()).put(attribute.getGender(),
								converterToDolllar(attribute.getCurrency(), attribute.getAvgIncomeInteger()));
					}




				} else {

					checkHashMap.put(attribute.getGender(),
							converterToDolllar(attribute.getCurrency(), attribute.getAvgIncomeInteger()));
					hm.put(attribute.getCountry(), checkHashMap);

				}


			} else {

				if (hm.containsKey(attribute.getCity())) {
					if (hm.get(attribute.getCity()).containsKey(attribute.getGender())) {
						Float currentsumFloat = hm.get(attribute.getCity()).get(attribute.getGender());

						hm.get(attribute.getCity()).put(attribute
								.getGender(),
								converterToDolllar(attribute.getCurrency(),
										attribute.getAvgIncomeInteger()));

					} else {

						hm.get(attribute.getCity()).put(attribute.getGender(),
								converterToDolllar(attribute.getCurrency(), attribute.getAvgIncomeInteger()));
					}

				} else {
					checkHashMap.put(attribute.getGender(),
							converterToDolllar(attribute.getCurrency(), attribute.getAvgIncomeInteger()));
					hm.put(attribute.getCity(), checkHashMap);


				}





			}
		}
		// System.out.println(hm);

		for (Map.Entry<String, HashMap<String, Float>> me : hm.entrySet()) {



			HashMap<String, Float> value = me.getValue();
			int sumM= 0 ;
			int sumF = 0;
			for (Attribute attribute2 : show) {

				if ( me.getKey().equals(attribute2.getCountry()))
				{
					//					System.out.println(value.containsKey("M"));
					//					System.out.println(attribute2.getGender() == "M");
					if (value.containsKey("M") && attribute2.getGender().equals("M"))
					{

						sumM++;
						// System.out.println(sumM);


					} else if (value.containsKey("F") && attribute2.getGender().equals("F")) {
						sumF++;
					}





				} else if (me.getKey().equals(attribute2.getCity())) {

					if (value.containsKey("M") && attribute2.getGender().equals("M")) {

						sumM++;

					} else if (value.containsKey("F") && attribute2.getGender().equals("F")) {
						sumF++;
					}

				}

			}
			if(value.containsKey("M"))
			{

				resultArrayList.add(new AttributeWriting(me.getKey(),"M" , value.get("M") / sumM));

			}
			if(value.containsKey("F"))
			{

				resultArrayList.add(new AttributeWriting(me.getKey(), "F", value.get("F") / sumF));
			}











		}
		// System.out.println(resultArrayList);
		return resultArrayList;
	}



	private Float converterToDolllar(String currency, Float avgIncomeInteger) {
		return converterToDolllar.toDollar(currency, avgIncomeInteger);

	}


}
