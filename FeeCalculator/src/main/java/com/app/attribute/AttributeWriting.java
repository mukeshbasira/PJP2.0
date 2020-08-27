package com.app.attribute;

import java.text.SimpleDateFormat;
import java.util.Date;

public class AttributeWriting {
	String client_Id;
	String transaction_Type;
	Date transaction_Date;
	char priority_Flag;
	Integer processFEEInteger;



	public AttributeWriting(String client_Id, String transaction_Type,
			Date transaction_Date,
			char priority_Flag,
			Integer processFEEInteger) {
		super();
		this.client_Id = client_Id;
		this.transaction_Type = transaction_Type;
		this.transaction_Date = transaction_Date;
		this.priority_Flag = priority_Flag;
		this.processFEEInteger = processFEEInteger;
	}

	public Integer getProcessFEEInteger() {
		return processFEEInteger;
	}

	public void setProcessFEEInteger(Integer processFEEInteger) {
		this.processFEEInteger = processFEEInteger;
	}

	public String getClient_Id() {
		return client_Id;
	}

	public void setClient_Id(String client_Id) {
		this.client_Id = client_Id;
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

	public char getPriority_Flag() {
		return priority_Flag;
	}

	public void setPriority_Flag(char priority_Flag) {
		this.priority_Flag = priority_Flag;
	}

	public AttributeWriting() {
	}



	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "client_Id  " + client_Id + "\n"
		+ "transaction_Type  " + transaction_Type
		+ "\n"
		+ "transaction_Date  " + transaction_Date + "\n"
		+ "priority_Flag  " + priority_Flag + "\n" + "processFEEInteger  " + processFEEInteger + "\n";
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

		AttributeWriting other = (AttributeWriting) obj;
		String date1 = new SimpleDateFormat("MM/dd/yyyy").format(getTransaction_Date()).toString();
		String date2 = new SimpleDateFormat("MM/dd/yyyy").format(other.getTransaction_Date()).toString();

		if (client_Id.equals(other.getClient_Id())
				&& transaction_Type.equals(other.getTransaction_Type())
				&& date1.equals(date2)) {
			return true;

		} else {
			return false;
		}


	}

	@Override
	public int hashCode() {
		return 31;
	}



}
