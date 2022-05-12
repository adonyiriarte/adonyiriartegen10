package com.generation.nomina.entity;

import java.util.Date;
import javax.persistence.*;
import lombok.Data;

@Entity
@Data
public class Proyecto {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String proyecto;
	private Date inicio;
	private Date fin;

}
