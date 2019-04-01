package com.storage.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.storage.model.StorageUnit;


@Repository
public interface StorageUnitRepository extends CrudRepository<StorageUnit, Integer>{

}
