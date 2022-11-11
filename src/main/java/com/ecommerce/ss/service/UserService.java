package com.ecommerce.ss.service;

import java.util.List;

import com.ecommerce.ss.entities.User;

public interface UserService {

	User saveUser(User user);

	User updateUser(User user);

	void deleteUser(User user);

	User getUserById(int id);

	List<User> getAllUsers();

	User getUserByFirstname(String firstname);

}
