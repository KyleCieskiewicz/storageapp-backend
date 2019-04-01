package com.storage.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.storage.model.StorageUnit;
import com.storage.repo.StorageUnitRepository;


@Service
public class StorageService {
	
	@Autowired
	private StorageUnitRepository storageRepo;
	
	public List<StorageUnit> fetchAllStorageUnits(){
		List<StorageUnit> storageUnitList = new ArrayList<>();
		storageRepo.findAll().forEach(unit -> storageUnitList.add(unit));
		return storageUnitList;
	}
	
	public StorageUnit addStorageUnit(StorageUnit storageUnit) {
		return storageRepo.save(storageUnit);
	}
	
	public void deleteStorageUnit(Integer id) {
		storageRepo.deleteById(id);
	}

}
