package com.group6.healthcare.tablets.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.group6.healthcare.tablets.model.TabletsInfo;


public interface TabletRepository extends MongoRepository<TabletsInfo, String> 
{

}
