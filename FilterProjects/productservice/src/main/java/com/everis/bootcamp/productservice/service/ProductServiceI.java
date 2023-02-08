package com.everis.bootcamp.productservice.service;

import com.everis.bootcamp.productservice.dto.Product;

public interface ProductServiceI {

	public Product get(String id);

	public Product post(String id);

}
