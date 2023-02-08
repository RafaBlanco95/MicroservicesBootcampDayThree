package com.everis.bootcamp.priceservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.everis.bootcamp.priceservice.model.Prices;

public interface PriceRepository extends JpaRepository<Prices, Integer> {
}