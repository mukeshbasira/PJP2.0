package com.app.dao;

import java.util.List;

import com.app.Structure.localStructure;


public interface LocalstructureDao {

	List<localStructure> listAll();

	List<localStructure> optionCondition(int option);



	void insert(localStructure localStructure);

	List<localStructure> selectedString(String selected);

}
