package com.ecommerce.ss.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.ss.entities.Products;
import com.ecommerce.ss.repository.ProductRepository;
import com.ecommerce.ss.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository pr;

	@Override
	public Products saveProduct(Products products) {
		return pr.save(products);
	}

	@Override
	public Products updateProduct(Products products) {
		return pr.save(products);
	}

	@Override
	public void deleteProduct(Products products) {
		pr.delete(products);
	}

	@Override
	public Products getProductById(int id) {
		return pr.findById(id).get();
	}

	@Override
	public List<Products> getAllProducts() {
		return pr.findAll();
	}

}
