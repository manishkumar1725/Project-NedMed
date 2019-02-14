package com.group6.healthcare.Syrup.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.group6.healthcare.Syrup.model.SyrupInfo;
import com.group6.healthcare.Syrup.service.SyrupService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;



@RestController
@RequestMapping("/healthcare")
@Api(value = "HealthCare Product(Syrups)")
public class SyrupController {

	

	  @Autowired
	  private SyrupService syrupservice;

	  @ApiOperation(value = "Returns All Product in Syrups Category.")
	  @RequestMapping(value = "/syrups",method = RequestMethod.GET)
	  public List<SyrupInfo> getProducts() 
	  {
		 return syrupservice.getAllProduct();
	  }
	  
	  @ApiOperation(value = "Add Syrups Product.")
	  @RequestMapping(value = "/syrups/add",method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
	  public void create(@RequestBody SyrupInfo syrups) 
	  {
	    	syrupservice.addProduct(syrups);
	  }
	  
	  @ApiOperation(value = "Get Any Particular Syrups Product Using Product Id.")
	  @RequestMapping(value = "/syrups/{id}",method = RequestMethod.GET)
	  public Optional<SyrupInfo> getProductById(@PathVariable String id)
	  {
		  return syrupservice.find(id);
	  }
	  
	  @ApiOperation(value = "Delete Any Particular Syrups Product Using Product Id.")
	  @RequestMapping(value = "/syrups/{id}", method = RequestMethod.DELETE) 
	  public void deleteById(@PathVariable String id) 
	  {
	       syrupservice.delete(id); 
      }
}