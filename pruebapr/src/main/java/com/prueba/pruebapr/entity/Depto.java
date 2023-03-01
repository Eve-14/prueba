package com.prueba.pruebapr.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(collection="Depto")
@Data
public class Depto {
    
	private String Depto_id;
	private String nombre;
	private String director;
	private String descripcion;
	public String getDepto_id() {
		return Depto_id;
	}
	public void setDepto_id(String depto_id) {
		Depto_id = depto_id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
}
