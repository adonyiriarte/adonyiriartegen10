package com.generation.nomina.entity;

import java.util.List;

import javax.persistence.*;

import lombok.Data;

//para que sea una tabla de base de datos
@Entity
//para que lombok le genere sus setters y getters
@Data
public class Empleado {
	
	//automáticamente los id incrementales
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String role;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Direccion direccion;

	@OneToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
	private List<Proyecto> proyectos;

	
	public Empleado() {}
	
	public Empleado(String name, String role) {
		this.name = name;
		this.role = role;
	}
	
	

}
