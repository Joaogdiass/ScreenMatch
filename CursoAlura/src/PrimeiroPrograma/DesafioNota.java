package PrimeiroPrograma;

public class DesafioNota {
	
	public static void main(String[] args) {
		
		double nota1 = 4.2;
		int nota2 = 9;
		
		int media = (int) (nota1+nota2)/2;
		System.out.println("A media e:" + media);
		
		System.out.println();
		
		double precoProduto = 44.2;
		int quantidade = 1253;
		
		double precoEstoque = precoProduto*quantidade;
		System.out.println("O preco do estoque e:" + precoEstoque);
		
		System.out.println();
		
		
		double valorEmDolares = 1399.99;
		double dolar = 4.94;
		
		double conversao = valorEmDolares*dolar;
		System.out.println("O produto custa:" + conversao);
		
		System.out.println();
		
		
		 char letra = 'A';
	        String palavra = "MARELO";

	        String mensagem = "A letra é " + letra + " e a palavra é " + palavra;

	        System.out.println(mensagem);
	        
	        
	     System.out.println();
	     
	 	double precoOriginal = 59.99;
		double percentualDesconto = 10.0;
		double valorDeDesconto = (percentualDesconto/100.0)*precoOriginal;
        double novoPreco = precoOriginal - valorDeDesconto;
        System.out.println("Preço original: R$" + precoOriginal);
        System.out.println("Desconto: R$" + valorDeDesconto);
        System.out.println("Novo preço com desconto: R$" + novoPreco);

		
	
		
		
		
	}
	
	
	
}
