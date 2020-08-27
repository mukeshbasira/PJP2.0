package com.app.attribute;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Attribute {

	String external_Transaction_Id;
	String client_Id;
	String security_Id;
	String transaction_Type;
	Date transaction_Date;
	String market_Value;
	char priority_Flag;

	public Attribute() {
	}

	public Attribute(String external_Transaction_Id, String client_Id, String security_Id, String transaction_Type,
			Date transaction_Date, String market_Value, char priority_Flag) {
		super();
		this.external_Transaction_Id = external_Transaction_Id;
		this.client_Id = client_Id;
		this.security_Id = security_Id;
		this.transaction_Type = transaction_Type;
		this.transaction_Date = transaction_Date;
		this.market_Value = market_Value;
		this.priority_Flag = priority_Flag;
	}


	public String getExternal_Transaction_Id() {
		return external_Transaction_Id;
	}

	public void setExternal_Transaction_Id(String external_Transaction_Id) {
		this.external_Transaction_Id = external_Transaction_Id;
	}

	public String getClient_Id() {
		return client_Id;
	}

	public void setClient_Id(String client_Id) {
		this.client_Id = client_Id;
	}

	public String getSecurity_Id() {
		return security_Id;
	}

	public void setSecurity_Id(String security_Id) {
		this.security_Id = security_Id;
	}

	public String getTransaction_Type() {
		return transaction_Type;
	}

	public void setTransaction_Type(String transaction_Type) {
		this.transaction_Type = transaction_Type;
	}

	public Date getTransaction_Date() {
		return transaction_Date;
	}

	public void setTransaction_Date(Date transaction_Date) {
		this.transaction_Date = transaction_Date;
	}

	public String getMarket_Value() {
		return market_Value;
	}

	public void setMarket_Value(String market_Value) {
		this.market_Value = market_Value;
	}

	public char getPriority_Flag() {
		return priority_Flag;
	}

	public void setPriority_Flag(char priority_Flag) {
		this.priority_Flag = priority_Flag;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "external_Transaction_Id  " + external_Transaction_Id +  "\n" +
		"client_Id  " + client_Id +  "\n" +
		"security_Id  " + security_Id + "\n" + "transaction_Type  " + transaction_Type + "\n"
		+ "transaction_Date  " + transaction_Date + "\n" + "market_Value  " + market_Value + "\n"
		+ "priority_Flag  " + priority_Flag + "\n";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (this == obj) {
			return true; // Reference equality.
		}
		if (this.getClass() != obj.getClass()) {
			return false;
		}


		Attribute other = (Attribute) obj;
		String date1 = new SimpleDateFormat("MM/dd/yyyy").format(getTransaction_Date()).toString();
		String date2 = new SimpleDateFormat("MM/dd/yyyy").format(other.getTransaction_Date()).toString();

		if (client_Id.equals(other.getClient_Id())
				&& security_Id.equals(other.getSecurity_Id())
				&& date1.equals(date2))
		{
			return true;


		}else {
			return false;
		}


	}

	@Override
	public int hashCode() {
		return external_Transaction_Id.hashCode();
	}



}
