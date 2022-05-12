package org.generation.inyeccion.repo;

import org.generation.inyeccion.DemoDependenciasApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("Mongo")
public class ConexionMongo implements IPersonaRepo{
	
	private static Logger LOG = 
	LoggerFactory.getLogger(DemoDependenciasApplication.class);
	
	@Override
	public void registrar(String nombre) {
		//System.out.println("MongoDB registra "+nombre);
		LOG.info("MongoDB registra "+nombre);
	}
}
