package PrimeiroPrograma;

import java.util.Scanner;

public class Desafio2 {

	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		/*double num;
		
		while(true) {
			System.out.println("Digite um numero: ");
			num = leitura.nextDouble();
			if(num > 0) {
				System.out.println("Numero positivo");
			
			}else if(num < 0) {
				System.out.println("Numero negativo");
			}else {
				System.out.println("Numero e neutro");
				break;
			}
		
		
	
	}*/
	
	
	
		/*double num1;
		double num2;
		
	
		System.out.println("Digite dois numeros");
		num1 = leitura.nextDouble();
		num2 = leitura.nextDouble();
		
		if(num1 == num2) {
			
			System.out.println("Numeros iguais");
		}else if(num1 > num2){
			System.out.println("Numeros diferentes e " + num1 +" e maior que " + num2);
		}else {
			System.out.println("Numeros diferentes e " + num2 +" e maior que " + num1);
		
		
	}*/
		/*int escolha;
		double ladoQuadrado;
		double pi = 3.14;
		double raio;
		
		
		String texto = """
				Escolha o que voce quer calcular
				Digite 1 para area de quadrado
				Digite 2 para area de circulo
				""";
		
		
		System.out.println(texto);
		
		escolha = leitura.nextInt();
		if (escolha == 1) {
			System.out.println("Digite quantos metros tem o lado do quadrado: ");
			ladoQuadrado = leitura.nextDouble();
			double areaQuadrado = ladoQuadrado * 2;
			System.out.println("A area do quadrado e " + areaQuadrado+" metros");
			
		}else if(escolha == 2){
			System.out.println("Digite quantos metros tem o raio do circulo: ");
			raio = leitura.nextDouble();
			double areaCirculo = pi*(raio*2);
			System.out.println("A area do circulo e: " + areaCirculo +" metros");
		}*/
		
		 /*System.out.print("Digite um número: ");
	        int numero = leitura.nextInt();

	        System.out.println("Tabuada do " + numero + ":");
	        for (int i = 1; i <= 10; i++) {
	            System.out.println(numero + " x " + i + " = " + (numero * i));
	        }*/
		
		
		
		
		 while (true) {
	            System.out.println("Digite um número para saber se ele é par ou ímpar, ou digite 0 para encerrar o programa: ");
	            int num = leitura.nextInt();
	            
	            if (num == 0) {
	                System.out.println("Programa encerrado.");
	                break; 
	            } else if (num % 2 == 0) {
	                System.out.println("É par.");
	            } else {
	                System.out.println("É ímpar.");
	            }
	        }
		
		 
		 System.out.print("Digite um número: ");
	        int numero = leitura.nextInt();

	        int fatorial = 1;

	        for (int i = 1; i <= numero; i++) {
	            fatorial *= i;
	        }

	        System.out.println("O fatorial de " + numero + " é: " + fatorial);
	        
	    
		
		
	
	
	}
}
