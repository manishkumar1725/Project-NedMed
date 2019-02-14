package com.group6.healthcare.Spray.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.group6.healthcare.Spray.model.SprayInfo;
import com.group6.healthcare.Spray.service.SprayService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;



@RestController
@RequestMapping("/healthcare")
@Api(value = "HealthCare Product(Spray)")
public class SprayController {
	
	  @Autowired
	  private SprayService sprayservice;

	  @ApiOperation(value = "Returns All Product in Spray Category.")
	  @RequestMapping(value = "/sprays",method = RequestMethod.GET)
	  public List<SprayInfo> getProducts() 
	  {
		 return sprayservice.getAllProduct();
	  }
	  
	  
	  @ApiOperation(value = "Add Spray Product.")
	  @RequestMapping(value = "/sprays/add",method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
	  public void create(@RequestBody SprayInfo sprays) 
	  {
	    	sprayservice.addProduct(sprays);
	  }
	  
	  
	  @ApiOperation(value = "Get Any Particular Spray Product Using Product Id.")
	  @RequestMapping(value = "/sprays/{id}",method = RequestMethod.GET)
	  public Optional<SprayInfo> getProductById(@PathVariable String id)
	  {
		  return sprayservice.find(id);
	  }
	  
	  @ApiOperation(value = " Any Particular Spray Product Using Product Id.")
	  @RequestMapping(value = "/sprays/{id}", method = RequestMethod.DELETE) 
	  public void deleteById(@PathVariable String id) 
	  {
	       sprayservice.delete(id); 
     }
	  
	 /* @RequestMapping(value = "/{id}",method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	  public void update(@RequestBody SprayInfo sprays) 
	  {
	        sprayservice.
	  }*/

}
