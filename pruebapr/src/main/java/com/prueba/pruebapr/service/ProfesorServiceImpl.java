package com.prueba.pruebapr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.prueba.pruebapr.entity.Profesor;
import com.prueba.pruebapr.repository.ProfesorRepository;


@Service
public class ProfesorServiceImpl extends GenericServiceImpl<Profesor, Long> implements ProfesorService{
    @Autowired
    ProfesorRepository profesorRepository;
    @Override
    public CrudRepository<Profesor, Long> getDao() {
        return profesorRepository;
    }
}
