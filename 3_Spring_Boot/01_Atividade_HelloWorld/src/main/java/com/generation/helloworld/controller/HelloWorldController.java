package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {
	
	@GetMapping
	public String helloworld() {
		return "Hello World!!!";
		
	}
	
	@GetMapping("/bsm") 
	public String bsm() {
		return "BSM’s Generation: "+ "\nIntrodução às Habilidades Comportamentais e Mentalidades"+
	"\nMentalidade de Crescimento"+"\nPersistência"+"\nResponsabilidade Pessoal"+"\nEntre outras";
	}
	
	@GetMapping("/lista")
	public String lista() {
		return "Dominar o Spring Boot";
	}
}
