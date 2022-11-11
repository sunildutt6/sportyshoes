package com.ecommerce.ss.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.ss.entities.Products;

@Repository
public interface ProductRepository extends JpaRepository<Products, Integer> {

}
