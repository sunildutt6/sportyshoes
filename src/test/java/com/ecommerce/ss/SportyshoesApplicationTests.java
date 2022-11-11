package com.ecommerce.ss;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ecommerce.ss.entities.Admin;
import com.ecommerce.ss.service.AdminService;

@SpringBootTest
class SportyshoesApplicationTests {

	@Autowired
	AdminService service;

	@Test
	void testCreate() {
		Admin admin = new Admin();
		admin.setUsername("s@y.com");
		admin.setPassword("sunil");
		service.saveAdmin(admin);
	}

	
}
