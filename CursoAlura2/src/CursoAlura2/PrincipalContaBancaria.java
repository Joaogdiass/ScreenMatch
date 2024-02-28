package CursoAlura2;

import br.com.alura.ExerciciosAula2.ContaBancaria2;

public class PrincipalContaBancaria {

	public static void main(String[] args) {
		
		ContaBancaria2 conta = new ContaBancaria2();
		
		
		
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
