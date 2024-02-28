package br.com.alura.ExerciciosAlura3;

public class ContaCorrente extends ContaBancaria {

	private double tarifaMensal = 50;
	
	
	public void cobrarTarifaMensal() {
		saldo -= tarifaMensal;
	}
	
}
