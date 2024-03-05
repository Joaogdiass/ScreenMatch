package br.com.alura.ExerciciosAlura4;

public class CalculoGeometrico implements CalculadoraSalaRetangular {

	
	double base;
	double altura;
	@Override
	public void calcularArea(double valorDaArea) {
		valorDaArea = base*altura;
		System.out.println("A area e: " + valorDaArea);
	}

	@Override
	public void calcularPerimetro(double valorDoPerimetro) {
		valorDoPerimetro = base+altura;
		System.out.println("O perimetro e: " + valorDoPerimetro);
	}


	

}
