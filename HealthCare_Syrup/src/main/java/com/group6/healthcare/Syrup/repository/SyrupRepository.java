package com.group6.healthcare.Syrup.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.group6.healthcare.Syrup.model.SyrupInfo;;

public interface SyrupRepository extends MongoRepository<SyrupInfo, String> {

}
