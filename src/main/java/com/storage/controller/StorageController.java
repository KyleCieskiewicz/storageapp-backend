package com.storage.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.storage.model.StorageUnit;
import com.storage.service.StorageService;


@CrossOrigin
@RestController
@RequestMapping("/api/unit")
public class StorageController {
	
	@Autowired
	private StorageService storageService;
	
	@GetMapping("/all")
	public @ResponseBody List<StorageUnit> fetchAll(HttpServletRequest request){
		return storageService.fetchAllStorageUnits();
	}
	
	@PostMapping
	public ResponseEntity<StorageUnit> addStorageUnit(HttpServletRequest request, @RequestBody StorageUnit storageUnit){
		System.out.println(storageUnit);
		StorageUnit addedUnit = storageService.addStorageUnit(storageUnit);
		System.out.println("Added unit: " + addedUnit);
		return new ResponseEntity<StorageUnit>(addedUnit, HttpStatus.OK);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<StorageUnit> updateStorageUnit(HttpServletRequest request, @RequestBody StorageUnit storageUnit, @PathVariable Integer id){
		System.out.println(storageUnit + " : " + id);
		storageUnit.setId(id);
		StorageUnit updatedUnit = storageService.addStorageUnit(storageUnit);
		System.out.println("Updated unit: " + updatedUnit);
		return new ResponseEntity<StorageUnit>(updatedUnit, HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteStorageUnit(HttpServletRequest request, @PathVariable Integer id){
		System.out.println("Id to delete: " + id);
		storageService.deleteStorageUnit(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}



