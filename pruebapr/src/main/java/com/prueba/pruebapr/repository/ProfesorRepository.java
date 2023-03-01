package com.prueba.pruebapr.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.prueba.pruebapr.entity.Profesor;



public interface ProfesorRepository extends MongoRepository<Profesor,Long> {

}
