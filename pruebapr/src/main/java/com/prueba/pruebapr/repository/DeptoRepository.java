package com.prueba.pruebapr.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.prueba.pruebapr.entity.Depto;



public interface DeptoRepository  extends MongoRepository<Depto,Long>{

}