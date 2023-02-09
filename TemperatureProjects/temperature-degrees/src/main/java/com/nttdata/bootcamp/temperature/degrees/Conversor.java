package com.nttdata.bootcamp.temperature.degrees;

public class Conversor {

	private String degrees;
	
	public Conversor(String degrees) {
		this.degrees=degrees;
	}
	
	public double degreeConversor(double num) {
		double res;
		
		switch(degrees) {
		case "Celsius":
			res=(num*9/5)+32;
			break;
		case "Farenheit":
			res=(num-32)*5/9;
			break;
		default:
			res=num;
		}
		
		return res;
		
	}
}
