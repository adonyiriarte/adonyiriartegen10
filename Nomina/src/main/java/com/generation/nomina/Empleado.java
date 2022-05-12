package com.generation.nomina;

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
	
	public Empleado() {}
	
	public Empleado(String name, String role) {
		this.name = name;
		this.role = role;
	}
	
	

}
