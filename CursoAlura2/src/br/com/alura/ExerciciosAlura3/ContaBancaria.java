package br.com.alura.ExerciciosAlura3;

public class ContaBancaria {

	protected double saldo;
	
	public void depositar(double valor) {
		saldo += valor;
		System.out.println("Deposito d: " + valor + ". Seu novo saldo: "+ saldo);
	}
	
	public void sacar(double valor) {
		if(valor <= saldo) {
			saldo -= valor;
			System.out.println("Seu saque de " + valor + "foi completado. Agora seu saldo e de " + saldo);
		}else{
			System.out.println("Saldo insuficiente");
		}
	}
	
	public void exibirSaldo() {
		System.out.println("Seu saldo e: " + saldo);
	}
	
	
	
}
