package com.example.conexion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // This means that this class is a Controller
@RequestMapping(path="/store") // This means URL's start with /demo (after Application path)
public class MainController {

	/**
	 * se obtiene el beam userRepositoru que es 
	 * generado automáticamente
	 */
	@Autowired
	private UserRepository userRepository;

	/*localhost:8080/store/add*/
	@PostMapping(path="/add")
	/*RESPONSEBODY:esta salida va a ser la respuesta de mi solicitud POST*/
	public @ResponseBody String addNewUser(
			@RequestParam String name, 
			@RequestParam String email){
		User n = new User();
		n.setName(name);
		n.setEmail(email);
		userRepository.save(n);
		return "retorna un string";
	}
	
	@GetMapping(path="/allUsers")
	public @ResponseBody Iterable<User> getAllUser(){
		return userRepository.findAll();
	
	}
	

}
