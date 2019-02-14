package com.group6.healthcare.Spray.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.group6.healthcare.Spray.model.SprayInfo;

public interface SprayRepository extends MongoRepository<SprayInfo, String> {

}
