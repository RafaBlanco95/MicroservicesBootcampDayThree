package com.nttdata.bootcamp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.bootcamp.saludoidioma.domain.Saludo;

@RestController
public class PruebaController {

	@Autowired
	private Saludo saludo;

	@GetMapping(path = "/prueba")
	public String pruebaSaludo() {
		return saludo.mensajeSaludo();
	}

	@GetMapping(path = "/helloWorld")
	public String helloWorld() {
		//counter.increment();
		return "hello World";
	}

}
