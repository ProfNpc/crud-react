package com.belval.crudreact.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class ClientForwardController {
	
	@GetMapping(value = "/**{path:[^\\.]*}")
	public String forward() {
		return "forward:/";
	}

}
