package com.everis.bootcamp.productservice.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

import com.everis.bootcamp.productservice.dto.Product;

@Service
@ConditionalOnProperty(name = "bootcamp.service.price-service.type", havingValue = "in-memory")
public class ProductService implements ProductServiceI {
	
	@Value("${server.port}")
	private String serverPort;


	public Product get(String id) {
		Product product = new Product();
		product.setProductId(id);
		product.setChannel("GET");
		
		// Reto 1 - 
		product.setServerPort(serverPort);
		return product;
	}

	public Product post(String id) {
		Product product = new Product();
		product.setProductId(id);
		product.setChannel("POST");
		// Reto 1 - 
		product.setServerPort(serverPort);
		return product;
	}

}
