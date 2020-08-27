package com.app.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.app.Structure.localStructure;


@Component
public interface localstructureRepository extends CrudRepository<localStructure, Long> {
}
