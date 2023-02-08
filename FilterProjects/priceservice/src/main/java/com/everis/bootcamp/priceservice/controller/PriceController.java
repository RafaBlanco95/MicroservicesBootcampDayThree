package com.everis.bootcamp.priceservice.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everis.bootcamp.priceservice.model.Prices;
import com.everis.bootcamp.priceservice.service.PriceService;

@RestController("api")
public class PriceController {

	private PriceService priceService;

	public PriceController(PriceService priceService) {
		this.priceService = priceService;
	}

	@GetMapping(value= "/price/get-price/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Prices getProduct(@PathVariable Integer id) {
		return priceService.get(id);
	}

	@PostMapping(value="/price/get-all-prices", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Prices> postProduct() {
		return priceService.getAllPrices();
	}

}
