package com.nttdata.bootcamp.saludoidioma.domain;

public class Saludo {
	private String idioma;
	
	public Saludo(String idioma) {
		this.idioma = idioma;
	}
	
	public String mensajeSaludo() {
		String mensaje = "";
		switch(idioma) {
		case "Castellano":
			mensaje = "Bienvenido";
			break;
		case "Inglés":
			mensaje = "Welcome";
			break;
		case "Italiano":
			mensaje = "Benvenuto";
			break;
		default:
			mensaje = "Bienvenido";
			break;
		}
		return mensaje;
	}
		
}
