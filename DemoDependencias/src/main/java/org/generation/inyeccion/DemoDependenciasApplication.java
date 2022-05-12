package org.generation.inyeccion;

import org.generation.inyeccion.service.IPersonaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoDependenciasApplication implements CommandLineRunner{

	private static Logger LOG = 
	LoggerFactory.getLogger(DemoDependenciasApplication.class);
	
	@Autowired
	private IPersonaService service;
	
	public static void main(String[] args) {
		SpringApplication.run(DemoDependenciasApplication.class, args);
	}
	
	@Override
	public void run	(String... args ) throws Exception{
		LOG.info("Comienza codigo personalizado");
		LOG.warn("Mensaje de advertencia");
		LOG.error("Mensaje de error");
		service.registrar("Marco Botello");
	}

}
