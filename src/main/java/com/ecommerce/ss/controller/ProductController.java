package com.ecommerce.ss.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ecommerce.ss.entities.Products;
import com.ecommerce.ss.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	ProductService ps;

	@RequestMapping("/createProduct")
	public String showCreate() {
		return "createProduct";
	}

	@RequestMapping("/saveProduct")
	public String saveProducts(@ModelAttribute("products") Products products, ModelMap m) {

		Products saveProducts = ps.saveProduct(products);
		String message = "Products saved with Id: " + saveProducts.getId();
		m.addAttribute("message", message);
		return "createProduct";
	}

	@RequestMapping("/displayProducts")
	public String displayUsers(ModelMap m) {
		List<Products> allProducts = ps.getAllProducts();
		m.addAttribute("allProducts", allProducts);
		return "displayProducts";
	}
}
