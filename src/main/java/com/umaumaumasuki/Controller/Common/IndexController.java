package com.umaumaumasuki.Controller.Common;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



public class IndexController {
	// display the index page
	@GetMapping("/")
	public String index(Model model) {
		return "index";
	}
}
