package com.group6.healthcare.Spray.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.group6.healthcare.Spray.model.SprayInfo;
import com.group6.healthcare.Spray.repository.SprayRepository;

@Service
public class SprayService {
	
	@Autowired
	private SprayRepository sprayrepository;
	
	

	public SprayInfo addProduct(SprayInfo sprays) {
		
		return sprayrepository.save(sprays);
	}
	

	public List<SprayInfo> getAllProduct() 
	{
	   
		List<SprayInfo> sprays = new ArrayList<>();
		sprayrepository.findAll().forEach(sprays::add);
		
		return sprays;
	}
	
	
	 public Optional<SprayInfo> find(String id) 
	 {
	        return sprayrepository.findById(id);
     }
	 
	 public void delete(String id)
	 {
		 sprayrepository.deleteById(id);
	 }
	 
	 public SprayInfo update(String id)
	 {
		return null;
		 
	 }


}
