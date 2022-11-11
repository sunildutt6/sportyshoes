package com.ecommerce.ss.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.ss.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	User getUserByFirstname(String firstname);
}
