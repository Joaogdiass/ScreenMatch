package br.com.alura.ExerciciosAlura3;

public class Principal {

	public static void main(String[] args) {
		
		
		Carro carro = new Carro();
		
			carro.setModelo("Urus");
			carro.DefinirPrecos(90000,30000,700000);
			carro.exibirInfo();

	}

}
