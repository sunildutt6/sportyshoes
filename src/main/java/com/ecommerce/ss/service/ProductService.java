package com.ecommerce.ss.service;

import java.util.List;

import com.ecommerce.ss.entities.Products;

public interface ProductService {

	Products saveProduct(Products products);

	Products updateProduct(Products products);
	
	void deleteProduct(Products products);
	
	Products getProductById(int id);
	
	List<Products> getAllProducts();

}
