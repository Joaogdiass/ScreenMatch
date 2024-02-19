package PrimeiroPrograma;

import java.util.Scanner;
import java.util.Random;


public class DesafioJogoAdvinhacao {
	
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		
		int tentativas = 0;
		int num = new Random().nextInt(100);
		
		while(tentativas <5) {
			System.out.println("Digite um numero de 1 a 100: ");
			int chute = leitura.nextInt();
			tentativas++;
			
			if (chute == num) {
				System.out.println("Parabens,voce acertou!!");
				break;
			}else if(chute < num){
				System.out.println("O numero e maior");
			}else {
				System.out.println("O numero e menor");
			}
			
			if(tentativas == 5) {
				System.out.println("Voce perdeu, o numero correto era: " + num);
				
			}
			
		}
			
		}
			
		

}
