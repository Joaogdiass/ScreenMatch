package br.com.alura.ExerciciosAlura5PT3;

public class Circulo implements Forma {

	
	double raio;

	@Override
	public double calcularArea() {
		return  Math.PI * raio *raio;
	}
	
	
	
	
}
