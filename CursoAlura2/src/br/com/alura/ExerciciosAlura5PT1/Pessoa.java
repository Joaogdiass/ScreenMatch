package br.com.alura.ExerciciosAlura5PT1;

public class Pessoa {

	private String nome;
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	private int idade;
	
	@Override
	public String toString() {
		return "Nome: " + this.getNome() + " Idade: " + this.getIdade();
	}
}
