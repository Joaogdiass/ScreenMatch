package br.com.alura.ExerciciosAlura4;

public class Servico implements Vendavel{

	
	 private String descricao;
	 private double precoHora;
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPrecoHora() {
		return precoHora;
	}

	public void setPrecoHora(double precoHora) {
		this.precoHora = precoHora;
	}

	@Override
	public double calcularPrecoFinal(int quantidade) {
		// TODO Auto-generated method stub
		return precoHora * quantidade;

	}

	@Override
	public void aplicarDesconto(double percentualDesconto) {
		precoHora -= precoHora * (percentualDesconto / 100.0);
		
	}

}
