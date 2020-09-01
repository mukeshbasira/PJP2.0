package com.app.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.Structure.localStructure;
import com.app.repositories.localstructureRepository;


@Service
public class LocalstructureServiceImpl implements LocalstructureService {


	private localstructureRepository localstructurerepository;

	@Autowired
	public LocalstructureServiceImpl(localstructureRepository localstructurerepositorysitory) {
		this.localstructurerepository = localstructurerepositorysitory;
	}


	@Override
	public ArrayList<localStructure> listAll() {
		ArrayList<localStructure> localStructures = new ArrayList<>();
		localstructurerepository.findAll().forEach(localStructures::add);
		return localStructures;
	}



	@Override
	public void save(localStructure localstructure) {
		localstructurerepository.save(localstructure);
	}


}
