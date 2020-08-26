package com.app.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.Structure.localStructure;
import com.app.repositories.localstructureRepository;

/**
 * Created by jt on 1/10/17.
 */
@Service
public class LocalstructureServiceImpl implements LocalstructureService {


	private localstructureRepository productRepository;

	@Autowired
	public LocalstructureServiceImpl(localstructureRepository productRepository) {
		this.productRepository = productRepository;
	}


	@Override
	public ArrayList<localStructure> listAll() {
		ArrayList<localStructure> products = new ArrayList<>();
		productRepository.findAll().forEach(products::add); //fun with Java 8
		return products;
	}



	@Override
	public void save(localStructure product) {
		productRepository.save(product);
	}


}
