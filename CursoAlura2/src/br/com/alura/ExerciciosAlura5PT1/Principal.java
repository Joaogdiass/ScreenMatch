package br.com.alura.ExerciciosAlura5PT1;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		var pessoa1 = new Pessoa();
		pessoa1.setNome("Joao");
		pessoa1.setIdade(19);
		
		var pessoa2 = new Pessoa();
		pessoa2.setNome("Gabi");
		pessoa2.setIdade(18);
		
		var pessoa3 = new Pessoa();
		pessoa3.setNome("Henrique");
		pessoa3.setIdade(10);
		
		ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
		listaDePessoas.add(pessoa1);
		listaDePessoas.add(pessoa2);
		listaDePessoas.add(pessoa3);
		System.out.println("Tamanho da lista: " + listaDePessoas.size());
		System.out.println("Primeiro da lista: " + listaDePessoas.get(0));
		System.out.println(listaDePessoas);
		
		
	}

}
