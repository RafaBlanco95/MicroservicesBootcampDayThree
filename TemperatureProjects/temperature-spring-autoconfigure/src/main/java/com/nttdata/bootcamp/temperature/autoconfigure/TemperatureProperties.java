package com.nttdata.bootcamp.temperature.autoconfigure;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Getter;
import lombok.Setter;

@ConfigurationProperties("temperature.type")
@Getter
@Setter
public class TemperatureProperties {

	private String degrees="Celsius";
}
