package br.com.alura.ExerciciosAlura4;

public class ConversorTemperaturaPadrao implements ConversorTemperatura {

	@Override
	public void celsiusParaFahrenheit(double celsius, double fahrenheit) {
		double finalFihrenheit = (celsius *1.8)+32;
		System.out.println("A temperatura em Fahrenheit e: " + finalFihrenheit);
				}

	@Override
	public void fahrenheitParaCelsius(double celsius, double fahrenheit) {
		double finalCelsius = (fahrenheit-30)/2;
		System.out.println("A temperatura em celsius e: " + finalCelsius);
		
	}

	
}
