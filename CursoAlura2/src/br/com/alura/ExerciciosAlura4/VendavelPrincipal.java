package br.com.alura.ExerciciosAlura4;

public class VendavelPrincipal {

	public static void main(String[] args) {
		Servico servico = new Servico();
		Produto produto = new Produto();
		
		
		produto.setNome("Nescau");
		produto.setPrecoUnitario(50);
		produto.aplicarDesconto(50);
		System.out.println("O preco do " + produto.getNome() + " e: " + produto.calcularPrecoFinal(5));
		
		
		servico.setDescricao("O preco do produto Gilette e: ");
		servico.setPrecoHora(50);
		servico.aplicarDesconto(10);
		
		System.out.println(servico.getDescricao() + servico.calcularPrecoFinal(2));
		
		
	}

}
