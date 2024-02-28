package br.com.alura.ExerciciosAlura3;

public class TesteContaBancaria {

	public static void main(String[] args) {
		
		ContaBancaria conta = new ContaBancaria();
		
		conta.depositar(1000);
		conta.exibirSaldo();
		
		ContaCorrente contaCorrente = new ContaCorrente();
		
		contaCorrente.cobrarTarifaMensal();
		contaCorrente.depositar(200);
		contaCorrente.exibirSaldo();
		contaCorrente.cobrarTarifaMensal();
		contaCorrente.exibirSaldo();

	}

}
