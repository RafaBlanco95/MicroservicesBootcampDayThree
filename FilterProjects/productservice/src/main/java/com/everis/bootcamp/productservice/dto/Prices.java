package com.everis.bootcamp.productservice.dto;

import java.math.BigDecimal;

public class Prices {

	private Integer id;

	private String code_product;

	private String description;

	private BigDecimal price;

	public Prices() {
		super();
		this.id = -1;
		this.code_product = "NONE";
		this.description = "NONE";
		this.price = new BigDecimal(0.0);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCode_product() {
		return code_product;
	}

	public void setCode_product(String code_product) {
		this.code_product = code_product;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

}