package com.nttdata.bootcamp.gateway.filters;

import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

import lombok.extern.log4j.Log4j2;
import reactor.core.publisher.Mono;

@Configuration
@Log4j2
public class FilterOne {

	   @Bean    @Order(-1)
	    public GlobalFilter a() {
	        return (exchange, chain) -> {
	            log.info("first pre filter");
	            return chain.filter(exchange).then(Mono.fromRunnable(() -> {
	                log.info("third post filter");
	            }));
	        };
	    }
	    @Bean    @Order(0)
	    public GlobalFilter b() {
	        return (exchange, chain) -> {
	            log.info("second pre filter");
	            return chain.filter(exchange).then(Mono.fromRunnable(() -> {
	                log.info("second post filter");
	            }));
	        };
	    }
	    @Bean    @Order(1)
	    public GlobalFilter c() {
	        return (exchange, chain) -> {
	            log.info("third pre filter");
	            return chain.filter(exchange).then(Mono.fromRunnable(() -> {
	                log.info("first post filter");
	            }));
	        };
	    }
	}