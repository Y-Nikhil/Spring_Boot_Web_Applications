package com.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.ashokit.entity.Product;
import com.ashokit.repository.ProductRepository;

@Controller
public class ProductController {

	@Autowired
	private ProductRepository repo;
	
	@GetMapping("/")
	public String loadPage(Model model) {
		model.addAttribute("p", new Product());
		return "index";
	}
	
	@PostMapping("save")
	public String saverecords(@ModelAttribute("p") Product p, Model model) {
		p=repo.save(p);
		if (p.getId() != null) {
			model.addAttribute("msg", "Data Saved...");
			model.addAttribute("p", new Product());		}
		return "index";
	}
	
	@GetMapping("products")
	public String loadRecords(Model model) {
		model.addAttribute("products", repo.findAll());
		return "data";
	}
}