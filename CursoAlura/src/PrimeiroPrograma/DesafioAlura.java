package PrimeiroPrograma;

import java.util.Scanner;

public class DesafioAlura {
	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		double saldo = 2500;
		String nome = "Gabriel Derviche";
		String tipoDeConta = "Corrente";
		int opcao = 0;
		
				
				
		System.out.println("*******************");
		System.out.println("\nDados iniciais do cliente: ");
		System.out.println("Nome do cliente:      " + nome);
		System.out.println("Tipo de conta:        " + tipoDeConta);
		System.out.println("Saldo atual        " + saldo);
		
		String menu = """
				\n*****************
				Digite a opcao que deseja
				
				1. Consultar saldo
				2. Receber valor
				3. Transferir valor
				4. Sair
				""";
		
		
		while (opcao != 4) {
		    System.out.println(menu);
		    opcao = leitura.nextInt(); 
		    if (opcao == 1) {
		        System.out.println("O saldo atual é: " + saldo);
		    } else if (opcao == 2) {
		        System.out.println("Quanto deseja receber?");
		        double receba = leitura.nextDouble();
		        saldo += receba;
		        System.out.println("\nSaldo atualizado: " + saldo);
		        
		    } else if(opcao ==3) {
		        System.out.println("Qual valor deseja transerir?");
		        double saque = leitura.nextDouble();
		        if (saque <= saldo) {
		        	saldo -= saque;
		        	System.out.println("\nSaldo atualizado: " + saldo);
		        	
		        }else {
		        	System.out.println("Voce ta pobreta, digite um saldo valido para sua conta!");
		        	;
		        }
		        
		        
		    }else if(opcao != 4) {
		    	System.out.println("Digite um numero valido!");
		    }
		}
			
			
		
		
		
		
		
		
	}
}
