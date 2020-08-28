package com.app;

public class ConverterToDolllar {
	public ConverterToDolllar() {
		// TODO Auto-generated constructor stub
	}

	public float toDollar(String currency, Float amount) {

		if(currency.contentEquals(CurrencyConstants.GBP))
		{
			return (float) (amount / 0.67);

		} else if (currency.contentEquals(CurrencyConstants.HKD)) {
			return (float) (amount / 8.0);

		}
		else if (currency.contentEquals(CurrencyConstants.INR)) {

			return (float) (amount / 66.0);
		}
		else if (currency.contentEquals(CurrencyConstants.SGP)) {

			return (float) (amount / 1.5);
		}else
		{

			return amount;
		}


	}



}
