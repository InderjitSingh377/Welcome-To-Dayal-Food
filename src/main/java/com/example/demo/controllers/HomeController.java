package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.entities.Product;
import com.example.demo.loginCredentials.AdminLogin;
import com.example.demo.services.ProductServices;

@Controller
public class HomeController {
	@Autowired
	private ProductServices productServices;

	@GetMapping(value = { "/home", "/" })
	public String home() {
		return "Home";
	}

	@GetMapping("/products")
	public String products(Model model) {
		List<Product> allProducts = this.productServices.getAllProducts();
		model.addAttribute("products", allProducts);
		return "Products";
	}

	@GetMapping("/location")
	public String location() {
		return "Locate_us";
	}

	@GetMapping("/about")
	public String about() {
		return "About";
	}

	@GetMapping("/add_admin")
	public String add_admin() {
		return "Add_Admin";
	}

	@GetMapping("/add_userr")
	public String add_userr() {
		return "Add_User";
	}

	@GetMapping("/login")
	public String login(Model model) {
		model.addAttribute("adminLogin", new AdminLogin());
		return "Login";
	}
}