package com.generation.nomina.exceptions;

public class EmpleadoNotFoundException  extends RuntimeException{

	public EmpleadoNotFoundException(Long id){
		super("No se encontrĂ³ al empleado "+id);
	}
}
