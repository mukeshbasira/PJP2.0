package com.app;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.app.Structure.localStructure;
import com.app.services.LocalstructureServiceImpl;


@SpringBootApplication

public class AppRunner implements CommandLineRunner {
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	LocalstructureServiceImpl repository;
	public static void main(String[] args) {
		SpringApplication.run(AppRunner.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		/////////////////////////////////////////////////
		////// FOR TESTING POSTGREPSQL NOT A FULLY SPRING BOOT APP///////////////
		/////////////////////////////////////////////////////////

		// repository.saveOrUpdate(new localStructure(0, null, null, null, null, null));
		ArrayList<localStructure> allArrayList = com.app.dataGenerator.fakeApi.run(30);

		System.out.println("****************" + "FOR TESTING POSTGREPSQL" + "**************");
		for (localStructure localStructure : allArrayList) {

			repository.save(localStructure);

		}
		ArrayList<localStructure> listAll = repository.listAll();
		for (localStructure localStructure : listAll) {
			System.out.println(localStructure.toString());

		}

	}
}
