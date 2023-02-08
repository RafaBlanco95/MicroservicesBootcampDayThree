package com.everis.bootcamp.productservice.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.everis.bootcamp.productservice.dto.Prices;
import com.everis.bootcamp.productservice.dto.Product;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;

@Service
@ConditionalOnProperty(name = "bootcamp.service.price-service.type", havingValue = "remote")
public class ProductServiceRemote implements ProductServiceI {

	@Value("${bootcamp.service.price-service.endpoint}")
	private String endpoint;

	private final RestTemplate restTemplate = new RestTemplate();

	@Override
	//@Retry(name = "prices-service", fallbackMethod = "fallBack")
	@CircuitBreaker(name = "prices-service", fallbackMethod = "fallBack")
	public Product get(String id) {
		if (id != null) {
			Product product = new Product();
			final Prices response = this.restTemplate.postForObject(this.endpoint, null, Prices.class, id);
			product.setProductId(response.getCode_product());
			product.setChannel(response.getDescription());
			product.setServerPort(response.getPrice().toString());
			product.setServerPort("None");
			return product;
		} else {
			return null;
		}
	}

	@Override
	//@Retry(name = "prices-service", fallbackMethod = "fallBack")
	@CircuitBreaker(name = "prices-service", fallbackMethod = "fallBack")
	public Product post(String id) {
		if (id != null) {
			Product product = new Product();
			final Prices response = this.restTemplate.postForObject(this.endpoint, null, Prices.class, id);
			product.setProductId(response.getCode_product());
			product.setChannel(response.getDescription());
			product.setServerPort("None");
			return product;
		} else {
			return null;
		}
	}

	public Product fallBack(String id, Throwable a) {
		Product product = new Product();
		product.setProductId("None");
		product.setChannel("None");
		product.setServerPort("None");
		return product;
	}
}
