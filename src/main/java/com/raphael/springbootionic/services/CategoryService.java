package com.raphael.springbootionic.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.raphael.springbootionic.domain.Category;
import com.raphael.springbootionic.exceptions.DataIntegrityException;
import com.raphael.springbootionic.exceptions.ObjectNotFoundException;
import com.raphael.springbootionic.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository repo;	
	
	public Category find(Integer id) {
		Optional<Category> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
		"Object not found! Id: " + id + ", Type: " + Category.class.getName()));
		}
	
	public Category insert(Category obj) {
		obj.setId(null);
		return repo.save(obj);
		}
	
	public Category update(Category obj) {
		find(obj.getId());
		return repo.save(obj);
		}
	
	public void delete(Integer id) {
		find(id);
		try {
			repo.deleteById(id);
		} catch (DataIntegrityViolationException e) {
			throw new DataIntegrityException("Is not possible delete this category that contains products!");
		}
		
		}
	
	public List<Category> findAll() {		
		return repo.findAll();
		}

}
