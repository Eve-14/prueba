package com.prueba.pruebapr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.pruebapr.entity.Curso;
import com.prueba.pruebapr.entity.Profesor;
import com.prueba.pruebapr.service.CursoService;
import com.prueba.pruebapr.service.ProfesorService;

@RestController
@RequestMapping("/api/curso")
public class CursoController {
	  @Autowired
	    CursoService cursoService;

	    @GetMapping("/listar")
	    public ResponseEntity<List<Curso>> listarc() {
	        return new ResponseEntity<>(cursoService.findByAll(),
	                HttpStatus.OK);
	    }
	    @PostMapping("/crear")
	    public ResponseEntity<Curso> crearc(
	            @RequestBody Curso p) {
	        return new ResponseEntity<>(cursoService.save(p),
	                HttpStatus.CREATED);
	    }

	    @PutMapping("/actualizar/{id}")
	    public ResponseEntity<Curso> actualizarc(@PathVariable Long id, @RequestBody Curso p) {
	        Curso cENcontrada = cursoService.findById(id);
	        if (cENcontrada == null) {
	            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	        } else {
	            try {
	            	cENcontrada.setNombre(p.getNombre());
	            	cENcontrada.setNivel(p.getNivel());
	            	cENcontrada.setDescripcion(p.getDescripcion());
	                return new ResponseEntity<>(cursoService.save(p), HttpStatus.OK);
	            } catch (DataAccessException e) {
	                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	            }
	        }
	    }

	    @DeleteMapping("/eliminar/{id}")
	    public ResponseEntity<Curso> eliminarc(@PathVariable Long id) {
	        cursoService.delete(id);
	        return new ResponseEntity<>(HttpStatus.OK);
	    }
}