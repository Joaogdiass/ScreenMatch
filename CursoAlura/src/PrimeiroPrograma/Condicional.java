package PrimeiroPrograma;

public class Condicional {
	public static void main(String[] args) {
		
		int anoDeLancamento = 1990;
		boolean incluidoNoPlano = false;
		double notaDeFilme = 8.1;
		String tipoPlano = "plus";
		
		if(anoDeLancamento >= 2022) {
			System.out.println("Lancamento que os clientes estao curtindo");
		}else {
			System.out.println("Filme retro que vale a pena assistir");
		}
		
		 if (incluidoNoPlano == true || tipoPlano.equals("plus")){
	            System.out.println("Filme liberado");
	        } else {
	            System.out.println("Deve pagar a locação");
	        }
	    
	}
}
