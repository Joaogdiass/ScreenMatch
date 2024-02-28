package br.com.alura.ExerciciosAlura3;

public class NumerosPrimos {

	 public boolean verificarPrimalidade(int numero) {
	        if (numero <= 1) {
	            return false;
	        }
	        for (int i = 2; i * i <= numero; i++) {
	            if (numero % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }

	public void listarPrimos(int i) {
		// TODO Auto-generated method stub
		
	}
}
