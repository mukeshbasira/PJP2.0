package com.app.services;

import java.util.ArrayList;

import com.app.Structure.localStructure;

/**
 * Created by jt on 1/10/17.
 */
public interface LocalstructureService {

	ArrayList<localStructure> listAll();


	void save(localStructure product);



}
