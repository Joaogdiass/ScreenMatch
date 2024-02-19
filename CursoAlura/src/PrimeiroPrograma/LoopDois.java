package PrimeiroPrograma;

import java.util.Scanner;

public class LoopDois {
	
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		double media = 0;
		double nota = 0;
		int totalNotas = 0;
		
		
		while (nota != -1) {
			System.out.println("Avaliacao do filme ou -1 para encerrar ");
			nota = leitura.nextDouble();
			
			if(nota != -1) {
			media += nota;
			totalNotas++;
		}
		
}
		
		System.out.println("A media e: "+ media/totalNotas);
 
	}
}
