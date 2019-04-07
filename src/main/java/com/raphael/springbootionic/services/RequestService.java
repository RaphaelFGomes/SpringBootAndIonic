package com.raphael.springbootionic.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raphael.springbootionic.domain.Request;
import com.raphael.springbootionic.exceptions.ObjectNotFoundException;
import com.raphael.springbootionic.repositories.RequestRepository;

@Service
public class RequestService {
	
	@Autowired
	private RequestRepository repo;	
	
	public Request getRequest(Integer id) {
		Optional<Request> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
		"Object not found! Id: " + id + ", Type: " + Request.class.getName()));
		}

}
