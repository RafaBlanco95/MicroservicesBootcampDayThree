package com.nttdata.bootcamp.autoconfigure.saludo;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Getter;
import lombok.Setter;

@ConfigurationProperties("saludo.mensaje")
@Getter
@Setter
public class SaludoProperties {
	
	private String idioma = "Castellano";

}
