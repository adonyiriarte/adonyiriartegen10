package com.generation.nomina;

public class EmpleadoNotFoundException  extends RuntimeException{

	EmpleadoNotFoundException(Long id){
		super("No se encontrĂ³ al empleado "+id);
	}
}
