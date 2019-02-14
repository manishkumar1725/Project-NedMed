package com.group6.healthcare.tablets.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.group6.healthcare.tablets.model.TabletsInfo;
import com.group6.healthcare.tablets.repository.TabletRepository;




@Service
public class TabletsService  {
	
	
	@Autowired
	private TabletRepository tabletrepository;
	
	

	public TabletsInfo addProduct(TabletsInfo tablets) {
		
		return tabletrepository.save(tablets);
	}
	

	public List<TabletsInfo> getAllProduct() 
	{
	   
		List<TabletsInfo> tablets = new ArrayList<>();
		tabletrepository.findAll().forEach(tablets::add);
		
		return tablets;
	}
	
	
	 public Optional<TabletsInfo> find(String id) {
	        
		 return tabletrepository.findById(id);
		 
	    }
	/* 
	 public List<TabletsInfo> findName(String productName)
	 {
		 return tabletrepository.f(productName);
	 }*/
	 
	 public void delete(String id)
	 {
		 tabletrepository.deleteById(id);
	 }


	/*public void updateTabletsInfo(TabletsInfo tabletsinfo, String id) 
	{
	    
	}*/
			
		
		
	
}
