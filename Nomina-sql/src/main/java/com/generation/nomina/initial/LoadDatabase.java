package com.generation.nomina.initial;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.generation.nomina.dao.EmpleadoRepository;
import com.generation.nomina.entity.Empleado;

//@Configuration
public class LoadDatabase {
	
	private static final Logger log =
			LoggerFactory.getLogger(LoadDatabase.class);
	
	@Bean
	CommandLineRunner initDatabase(EmpleadoRepository repository) {
		return args->{
			log.info("Precargando "+ repository.save(new Empleado("Jose Marcos ", "Sr Java")));
			log.info("Precargando "+ repository.save(new Empleado("Gabriela Diaz ", "Scrum Master")));
		};
	}
	
	
}
