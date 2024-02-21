package CursoAlura2;

import br.com.alura.ExerciciosAula2.ContaBancaria;

public class PrincipalContaBancaria {

	public static void main(String[] args) {
		
		ContaBancaria conta = new ContaBancaria();
		
		
		
		conta.setNumeroConta(123456789);
		conta.setSaldo(2500);
		conta.titular = "Gabriela";
		
		
		System.out.println("Titular: " + conta.titular);
		System.out.println("Numero da conta: " + conta.getNumeroConta());
		System.out.println("Saldo: " + conta.getSaldo());
		conta.setSaldo(1500);
	    System.out.println("Novo Saldo: " + conta.getSaldo());

	}

}
