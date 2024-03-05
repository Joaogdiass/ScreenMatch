package br.com.alura.ExerciciosAlura4;

public class Produto implements Vendavel {

	
	 private String nome;
	 private double precoUnitario;
	


	

	@Override
	public double calcularPrecoFinal(int quantidade) {
		
		return quantidade*precoUnitario;
	}

	@Override
	public void aplicarDesconto(double percentualDesconto) {
        precoUnitario -= precoUnitario * (percentualDesconto / 100.0);
        

		
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}

}
