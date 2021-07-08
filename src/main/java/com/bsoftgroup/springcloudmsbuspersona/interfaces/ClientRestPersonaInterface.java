package com.bsoftgroup.springcloudmsbuspersona.interfaces;

import java.util.List;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.bsoftgroup.springcloudmsbuspersona.objetos.Persona;


@FeignClient(name = "internal-apigateway")
@RibbonClient(name = "ms-persona")
public interface ClientRestPersonaInterface {
	
	    @GetMapping(path="/ms-persona/mspersona/personas")
		public List<Persona> getPersonas();

}
