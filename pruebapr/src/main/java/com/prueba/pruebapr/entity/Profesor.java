package com.prueba.pruebapr.entity;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(collection="Profesor")
@Data
public class Profesor {
	@Id
	private Long Prof_id ; 
	private String nombre;
	private String direccion;
	private String telefono;
	
	
	
	public long getProf_id() {
		return Prof_id;
	}
	public void setProf_id(long prof_id) {
		Prof_id = prof_id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
	
}
