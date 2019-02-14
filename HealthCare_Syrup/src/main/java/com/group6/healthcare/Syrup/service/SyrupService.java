package com.group6.healthcare.Syrup.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.group6.healthcare.Syrup.model.SyrupInfo;
import com.group6.healthcare.Syrup.repository.SyrupRepository;;


@Service
public class SyrupService {
	
	@Autowired
	private SyrupRepository syruprepository;
	
	

	public SyrupInfo addProduct(SyrupInfo tablets) {
		
		return syruprepository.save(tablets);
	}
	

	public List<SyrupInfo> getAllProduct() 
	{
	   
		List<SyrupInfo> syrups = new ArrayList<>();
		syruprepository.findAll().forEach(syrups::add);
		
		return syrups;
	}
	
	
	 public Optional<SyrupInfo> find(String id) 
	 {
	        return syruprepository.findById(id);
     }
	 
	 public void delete(String id)
	 {
		 syruprepository.deleteById(id);
	 }

}
