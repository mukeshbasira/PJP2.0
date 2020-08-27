package com.app.algo;

import java.util.Comparator;

import com.app.attribute.Attribute;

public class AlgoComparator implements Comparator<Attribute> {



	// TODO Auto-generated method stub
	public int compare(Attribute o1, Attribute o2) {

		return o1.equals(o2) && !((o1.getTransaction_Type()).equals(o2.getTransaction_Type())) == true ? 1 : 0;
	}

}
