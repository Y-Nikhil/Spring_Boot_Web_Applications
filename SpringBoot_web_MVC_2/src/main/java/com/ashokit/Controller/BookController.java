package com.ashokit.Controller;

 
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ashokit.entity.Books;
import com.ashokit.repository.BookRepository;

@Controller
public class BookController {

	@Autowired
	public BookRepository repo;
	/*
	@GetMapping("/book")
	public ModelAndView getBookById(@RequestParam("id") Integer id) {
		
		ModelAndView mav = new ModelAndView();
		System.out.println(id);
		Optional<Books> book = repo.findById(id);
		
		if (book.isPresent()) {
			Books bookObj = book.get();
			mav.addObject("book", bookObj);
		}
		mav.setViewName("index");
		return mav; */
	
	@GetMapping("/book")
	public String getBookById (@RequestParam("id") Integer id, Model model) {
		
		Optional<Books> book = repo.findById(id);
		if (book.isPresent()) {
			Books bookObj = book.get();
			model.addAttribute("book", bookObj);
		}
		
		return "index";
		
	}
}
