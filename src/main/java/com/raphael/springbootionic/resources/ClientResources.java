package com.raphael.springbootionic.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.raphael.springbootionic.domain.Client;
import com.raphael.springbootionic.services.ClientService;

@RestController
@RequestMapping(value="/clients")
public class ClientResources {
	
	@Autowired
	private ClientService service;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<Client> find(@PathVariable Integer id) {
		
		Client obj = service.getClient(id);
		return ResponseEntity.ok().body(obj);		
	}

}
