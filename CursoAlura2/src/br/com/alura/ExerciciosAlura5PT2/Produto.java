package br.com.alura.ExerciciosAlura5PT2;

import java.util.ArrayList;

public class Produto {
	
	private String nome;
	private double preco;
	private int quantidade;
	
	
	

	public Produto(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}




	public String getNome() {
		return nome;
	}




	public void setNome(String nome) {
		this.nome = nome;
	}




	public double getPreco() {
		return preco;
	}




	public void setPreco(double preco) {
		this.preco = preco;
	}




	public int getQuantidade() {
		return quantidade;
	}




	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}



	@Override
	public String toString() {
		return "Produto: " + getNome()
				+ "\nPreco: " + getPreco()
				+ "\nQuantidade: " + getQuantidade();
	}
	

	public static void main(String[] args) {
		
		
		
	
		
		ArrayList<Produto> listaDeProdutos = new ArrayList<>();
		
		var xbox = new Produto("Xbox",2012,20);
		var ps4 = new Produto("PS4",2024,50);
		
		listaDeProdutos.add(ps4);
		listaDeProdutos.add(xbox);
		
		System.out.println("Tamanho da lista: " + listaDeProdutos.size());
		System.out.println(listaDeProdutos.get(1));
		System.out.println(listaDeProdutos.get(0));
		
	}
	
	
}
