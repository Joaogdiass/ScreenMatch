package br.com.alura.ExerciciosAlura5PT2;

public class ProdutoPerecivel extends Produto {

	
	private String dataValidade;
	
	public ProdutoPerecivel(String nome, double preco, int quantidade, String dataValidade) {
		super(nome, preco, quantidade);
		this.dataValidade = dataValidade;
		
	}

	public static void main(String[] args) {
		
		ProdutoPerecivel produto = new ProdutoPerecivel("Chocolate", 2, 300, "Amanha");
		System.out.println(produto);
		
	}
	
	
}
