package br.com.alura.ScreenMatch.modelos;

import Calculos.CalculoDeClassificacao;

public class Episodio implements CalculoDeClassificacao {
	
	private int numero;
	private String nome;
	private Serie serie;
	private int totalDeVizualizacoes;
	
	
	public int getTotalDeVizualizacoes() {
		return totalDeVizualizacoes;
	}
	public void setTotalDeVizualizacoes(int totalDeVizualizacoes) {
		this.totalDeVizualizacoes = totalDeVizualizacoes;
	} 
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int episodio) {
		this.numero = episodio;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Serie getSerie() {
		return serie;
	}
	public void setSerie(Serie serie) {
		this.serie = serie;
	}
	@Override
	public int getClassificacao() {
		if (totalDeVizualizacoes > 100) {
			return 4;
			
		}else {
			return 2;
		}
		
	}
	public void totalDeVizualizacoes(int i) {
		// TODO Auto-generated method stub
		
	}
	
	
}
