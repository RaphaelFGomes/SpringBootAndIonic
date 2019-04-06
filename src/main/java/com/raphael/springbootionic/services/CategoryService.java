package com.raphael.springbootionic.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raphael.springbootionic.domain.Category;
import com.raphael.springbootionic.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository repo;
	
	public Category getCategory(Integer id) {
		Optional<Category> obj = repo.findById(id);
		return obj.orElse(null);
	}

}
