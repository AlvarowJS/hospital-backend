package com.mitocode.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name="Examen")
public class Examen {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idExamen;
	
	@Size(min = 3, message = "Ingresar minimo 3")
	@Column(name = "nombre", nullable = false, length = 30 )
	private String nombre;
	
	@Size(min=10, max=50, message = "Ingresar minimo 10")
	@Column(name = "descripcion", nullable = false, length = 50)
	private String descripcion;
	 
	public Integer getIdExamen() {
		return idExamen;
	}
	public void setIdExamen(Integer idExamen) {
		this.idExamen = idExamen;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}
