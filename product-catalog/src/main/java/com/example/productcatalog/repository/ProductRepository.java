package com.example.productcatalog.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.productcatalog.model.Product;

public interface ProductRepository extends CrudRepository<Product, Integer>{
	
	

}
