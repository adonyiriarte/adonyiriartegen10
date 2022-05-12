package org.generation.inyeccion.service;

import org.generation.inyeccion.repo.IPersonaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ServiceImpl implements IPersonaService{
	
	@Autowired
	@Qualifier("MySQL")
	
	private IPersonaRepo repository;
	
	@Override
	public void registrar(String nombre){
		repository.registrar(nombre);
	}
}
