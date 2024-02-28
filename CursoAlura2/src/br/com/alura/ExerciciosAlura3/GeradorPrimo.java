package br.com.alura.ExerciciosAlura3;

public class GeradorPrimo {

	public int gerarProximoPrimo(int ultimoPrimoConhecido) {
        int proximoNumero = ultimoPrimoConhecido + 1;
        while (!verificarPrimalidade(proximoNumero)) {
            proximoNumero++;
        }
        return proximoNumero;
    }

	private boolean verificarPrimalidade(int proximoNumero) {
		// TODO Auto-generated method stub
		return false;
	}
}
