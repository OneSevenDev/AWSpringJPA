package com.oneseve.vinhos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class VinhosController {

	@GetMapping("/vinhos/novo")
	public String novo(){
		return "vinho/cadastro-vinho";
	}
	
	@PostMapping
	public String salvar() {
		
	}
}
