package com.generation.nomina.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.generation.nomina.dao.EmpleadoRepository;
import com.generation.nomina.entity.Empleado;
import com.generation.nomina.exceptions.EmpleadoNotFoundException;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmpleadoController {

	private final EmpleadoRepository repository;
	
	public EmpleadoController (EmpleadoRepository repository) {
		this.repository=repository;
	}
	
	@GetMapping("/empleados")
	public List<Empleado> all(){
		return repository.findAll();
	}
	
	@PostMapping("/empleados")
	Empleado nuevoRegistro(@RequestBody Empleado newEmpleado) {
		
		return repository.save(newEmpleado);
	}
	
	@GetMapping("/empleados/{id}")
	Empleado unicoEmpleado(@PathVariable Long id) {
		return repository.findById(id)
				.orElseThrow(() -> new EmpleadoNotFoundException(id));
	}
	
	@PutMapping("/empleados/{id}")
	Empleado replaceEmpleado( 
			 @RequestBody Empleado newEmpleado, 
			 @PathVariable Long id) {
		
		return repository.findById(id)
				.map(empleado ->{
					empleado.setName(newEmpleado.getName());
					empleado.setRole(newEmpleado.getRole());
					empleado.setDireccion(newEmpleado.getDireccion());
					return repository.save(empleado);
				})
				.orElseGet(()->{
					newEmpleado.setId(id);
					return repository.save(newEmpleado);
				});
	}
	
	@DeleteMapping("/empleados/{id}")
	void deleteEmpleado(@PathVariable Long id) {
		repository.deleteById(id);
	}

}
