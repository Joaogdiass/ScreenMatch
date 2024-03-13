package br.com.alura.ExerciciosAlura5PT3;

public class Quadrado implements Forma {

	double lado;
	
	@Override
	public double calcularArea() {
		return lado*lado;
	}

}
