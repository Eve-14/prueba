package com.prueba.pruebapr.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.prueba.pruebapr.entity.Curso;



public interface CursoRepository  extends MongoRepository<Curso,Long>{

}
