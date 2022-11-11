package com.ecommerce.ss.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.ss.entities.Admin;
import com.ecommerce.ss.repository.AdminRepository;
import com.ecommerce.ss.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService {
	@Autowired
	AdminRepository ar;

	@Override
	public Admin saveAdmin(Admin admin) {
		return ar.save(admin);
	}

	@Override
	public Admin updateAdmin(Admin admin) {
		return ar.save(admin);
	}

	@Override
	public void deleteAdmin(Admin admin) {
		ar.delete(admin);
	}

	@Override
	public Admin getAdminById(int id) {
		return ar.findById(id).get();
	}

	@Override
	public List<Admin> getAllAdmin() {
		return ar.findAll();
	}

}
