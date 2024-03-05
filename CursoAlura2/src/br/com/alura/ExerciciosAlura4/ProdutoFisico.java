package br.com.alura.ExerciciosAlura4;

import br.com.alura.ExerciciosAula2.Produto;

public class ProdutoFisico extends Produto implements Calculavel {
    public ProdutoFisico(String nome, double preco) {
		super(nome, preco);
		// TODO Auto-generated constructor stub
	}

	public double calcularPrecoFinal() {
        double preco = 0;
		// Implementação com taxas adicionais para produtos físicos
        return preco * 1.05; 
    }

	@Override
	public double ProdutoFisico() {
		// TODO Auto-generated method stub
		return 0;
	}
}
