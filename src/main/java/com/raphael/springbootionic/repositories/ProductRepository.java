package com.raphael.springbootionic.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.raphael.springbootionic.domain.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{

}
