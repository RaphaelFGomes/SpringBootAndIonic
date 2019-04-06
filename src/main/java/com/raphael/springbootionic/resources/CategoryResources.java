package com.raphael.springbootionic.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.raphael.springbootionic.domain.Category;
import com.raphael.springbootionic.services.CategoryService;

@RestController
@RequestMapping(value="/categories")
public class CategoryResources {
	
	@Autowired
	private CategoryService service;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		
		Category obj = service.getCategory(id);
		return ResponseEntity.ok().body(obj);
		
	}

}
