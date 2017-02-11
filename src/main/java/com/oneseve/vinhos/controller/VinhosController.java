package com.oneseve.vinhos.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.oneseve.vinhos.model.TipoVinho;
import com.oneseve.vinhos.model.Vinho;
import com.oneseve.vinhos.repository.Vinhos;

@Controller
public class VinhosController {

	@Autowired
	private Vinhos vinhos;

	@GetMapping("/vinhos/novo")
	public ModelAndView novo(Vinho vinho) {
		ModelAndView andView = new ModelAndView("vinho/cadastro-vinho");
		andView.addObject("tipos", TipoVinho.values());
		return andView;
	}

	@PostMapping("/vinhos/novo")
	public ModelAndView salvar(@Valid Vinho vinho, BindingResult result) {
		if (result.hasErrors()) {
			return novo(vinho);
		}
		vinhos.save(vinho);
		return new ModelAndView("redirect:/vinhos/novo");
	}
}
