package com.ecommerce.ss.service;

import java.util.List;

import com.ecommerce.ss.entities.Admin;

public interface AdminService {

	Admin saveAdmin(Admin admin);

	Admin updateAdmin(Admin admin);

	void deleteAdmin(Admin admin);

	Admin getAdminById(int id);

	List<Admin> getAllAdmin();

}
