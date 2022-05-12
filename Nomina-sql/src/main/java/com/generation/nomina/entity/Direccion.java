package com.generation.nomina.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Direccion {
	
	@Id
	@GeneratedValue
	private long id;
	@Column(length = 100)
	private String ciudad;
	@Column(length = 100)
	private String calle;

}

