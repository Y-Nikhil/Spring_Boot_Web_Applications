package com.ashokit.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WebController {

	@GetMapping("/welcome")
	public ModelAndView welcome() {
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("msg", "Welcome to fucking world...");
		mav.setViewName("welcome");
		
		return mav;
		
	}
}
