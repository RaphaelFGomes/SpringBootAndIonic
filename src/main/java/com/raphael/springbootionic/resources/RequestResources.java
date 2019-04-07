package com.raphael.springbootionic.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.raphael.springbootionic.domain.Request;
import com.raphael.springbootionic.services.RequestService;

@RestController
@RequestMapping(value="/requests")
public class RequestResources {
	
	@Autowired
	private RequestService service;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		
		Request obj = service.getRequest(id);
		return ResponseEntity.ok().body(obj);		
	}

}
