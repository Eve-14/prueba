package com.prueba.pruebapr.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(collection="Curso")
@Data
public class Curso {
	private String curso_id;
	private String nombre;
	private String nivel;
	private String descripcion;
	
	
	public String getCurso_id() {
		return curso_id;
	}
	public void setCurso_id(String curso_id) {
		this.curso_id = curso_id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNivel() {
		return nivel;
	}
	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
