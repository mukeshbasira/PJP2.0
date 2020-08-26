package com.app.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.app.Structure.localStructure;


/**
 * Created by jt on 1/10/17.
 */
@Component
public interface localstructureRepository extends CrudRepository<localStructure, Long> {
}
