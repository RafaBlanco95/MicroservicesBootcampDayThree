package com.nttdata.bootcamp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.bootcamp.temperature.degrees.Conversor;



@RestController
@RequestMapping("/")
public class PruebaController {

	@Autowired
	private Conversor conversor;

	@GetMapping(path = "/prueba/{num}")
	public double pruebaConversor(final @PathVariable double num) {
		return conversor.degreeConversor(num);
	}
}
