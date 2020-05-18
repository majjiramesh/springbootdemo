package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rmajji")
public class OperationController {

	
	
	
	@GetMapping("/helloworld")
	public  String findAll() {
		return	"This is Hello world API";
		
	}

	
}
