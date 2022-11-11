package com.ecommerce.ss.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.ss.config.ErrorConfig;
import com.ecommerce.ss.entities.User;
import com.ecommerce.ss.repository.UserRepository;
import com.ecommerce.ss.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository ur;

	@Override
	public User saveUser(User user) {
		return ur.save(user);
	}

	@Override
	public User updateUser(User user) {
		return ur.save(user);
	}

	@Override
	public void deleteUser(User user) {
		ur.delete(user);
	}

	@Override
	public User getUserById(int id) {
		return ur.findById(id).get();
	}

	@Override
	public List<User> getAllUsers() {
		return ur.findAll();
	}

	@Override
	public User getUserByFirstname(String firstname) {
		User user = ur.getUserByFirstname(firstname);
		if (user.getFirstname().isEmpty())
			throw new ErrorConfig();
		return user;
	}

}
