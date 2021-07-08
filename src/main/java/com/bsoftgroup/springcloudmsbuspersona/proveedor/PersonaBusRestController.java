package com.bsoftgroup.springcloudmsbuspersona.proveedor;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bsoftgroup.springcloudmsbuspersona.interfaces.ClientRestPersonaInterface;
import com.bsoftgroup.springcloudmsbuspersona.objetos.Persona;


@RestController
public class PersonaBusRestController {
	
	@Autowired
	private ClientRestPersonaInterface service;
	
	@GetMapping(path="/personas")
	public List<Persona> getPersonas(){
		//List<Persona> personas = service.getPersonas();
		List<Persona> personas = new ArrayList<>();
		Persona p1 = new Persona(1, "PERU");
		personas.add(p1);
		return personas;
		
	}
	
	

}
