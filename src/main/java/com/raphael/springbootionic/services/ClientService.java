package com.raphael.springbootionic.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raphael.springbootionic.domain.Client;
import com.raphael.springbootionic.exceptions.ObjectNotFoundException;
import com.raphael.springbootionic.repositories.ClientRepository;

@Service
public class ClientService {
	
	@Autowired
	private ClientRepository repo;	
	
	public Client getClient(Integer id) {
		Optional<Client> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
		"Object not found! Id: " + id + ", Type: " + Client.class.getName()));
		}

}
