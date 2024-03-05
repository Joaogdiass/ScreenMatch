package br.com.alura.ExerciciosAlura4;

import br.com.alura.ExerciciosAula2.Produto;

public class Livro extends Produto implements Calculavel {
    public Livro(String nome, double preco) {
		super(nome, preco);
		// TODO Auto-generated constructor stub
	}

	private String autor;

    public double calcularPrecoFinal() {
        double preco = 0;
		return preco * 0.9; 
    }

	@Override
	public double ProdutoFisico() {
		// TODO Auto-generated method stub
		return 0;
	}
}
