package com.app.dataReader;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import com.app.attribute.Attribute;

public interface Reader {

	ArrayList<Attribute> show(String string) throws FileNotFoundException, IOException, Exception;

}
