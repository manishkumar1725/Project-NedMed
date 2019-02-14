package com.group6.healthcare.tablets.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.group6.healthcare.tablets.model.TabletsInfo;
import com.group6.healthcare.tablets.service.TabletsService;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;





@RestController
@RequestMapping("/healthcare")
//@Api(value = "HealthCare Product(Tablets)")
public class TabletController {
	
	
	  @Autowired
	  private TabletsService tabletsservice;

	  @ApiOperation(value = "Returns All Product in Tablets Category.")
	  @RequestMapping(value = "/tablets",method = RequestMethod.GET)
	  public List<TabletsInfo> getProducts() 
	  {
		 return tabletsservice.getAllProduct();
	  }
	  
	  @ApiOperation(value = "Add Tablets Product.")
	  @RequestMapping(value = "/tablets/add",method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
	  public void create(@RequestBody TabletsInfo tablets) 
	  {
	    	tabletsservice.addProduct(tablets);
	  }
	 /* 
	  @RequestMapping(value = "/products/{id}",method = RequestMethod.GET,consumes = MediaType.APPLICATION_JSON_VALUE)
	  public TabletsInfo getProductById(@PathVariable String id)
	  {
		  return tabletsservice.find(id);
	  }
	  */
	  
	  @ApiOperation(value = "Get Any Particular Tablets Product Using Product Id.")
	  @RequestMapping(value = "/tablets/{id}",method = RequestMethod.GET)
	  public Optional<TabletsInfo> getProductById(@PathVariable String id)
	  {
		  return tabletsservice.find(id);
	  }
	  
	  /*@RequestMapping(value = "/products/{productName}",method = RequestMethod.GET)
	  public List<TabletsInfo> getProductByName(@PathVariable String productName)
	  {
		  return tabletsservice.findName(productName);
	  }*/
	  
	  @ApiOperation(value = "Delete Any Particular Tablets Product Using Product Id.")
	  @RequestMapping(value = "/tablets/{id}", method = RequestMethod.DELETE) 
	  public void deleteById(@PathVariable String id) 
	  {
	       tabletsservice.delete(id); 
      } 
	  
	  
	/* @ApiOperation(value = "Update Any Particular Tablets Product Using Product Id.")
	  @RequestMapping(method = RequestMethod.PUT, value="/tablets/{id}")
	  public void updateTopic(@RequestBody TabletsInfo tabletsinfo,@PathVariable String id)
	  {
			if(tabletsinfo.getProductId().equals(id))
			{
				tabletsinfo.getProductCost()=
			}
	  }*/
	  
}
