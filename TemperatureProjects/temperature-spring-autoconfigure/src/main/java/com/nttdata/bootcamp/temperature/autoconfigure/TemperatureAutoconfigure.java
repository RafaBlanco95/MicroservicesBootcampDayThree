package com.nttdata.bootcamp.temperature.autoconfigure;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.nttdata.bootcamp.temperature.degrees.Conversor;



@Configuration
@ConditionalOnClass(Conversor.class)
@EnableConfigurationProperties(TemperatureProperties.class)
public class TemperatureAutoconfigure {

	private final TemperatureProperties properties;
	
	public TemperatureAutoconfigure(TemperatureProperties properties) {
		this.properties=properties;
	}
	
	@Bean
	public Conversor conversor() {
		return new Conversor(properties.getDegrees());
	}
	
}
