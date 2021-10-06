package com.mitocode.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name="Especialidad")
public class Especialidad {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idEspecialidad;
	
	@Size(min = 3, message = "Nombres debe tener minimo 3 caracteres")
	@Column(name ="nombre", nullable =false, length = 50)
	private String nombre;
	
	public Integer getIdEspecialidad() {
		return idEspecialidad;
	}
	public void setIdEspecialidad(Integer idEspecialidad) {
		this.idEspecialidad = idEspecialidad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
