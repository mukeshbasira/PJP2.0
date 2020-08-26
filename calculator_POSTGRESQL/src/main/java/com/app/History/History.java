package com.app.History;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import com.app.Structure.localStructure;

public interface History {

	void addSession(ArrayList<localStructure> localStructure);

	void save(String fileLocationString) throws Exception;

	ArrayList<localStructure> show(String fileLocationString) throws FileNotFoundException, IOException, Exception;


}
