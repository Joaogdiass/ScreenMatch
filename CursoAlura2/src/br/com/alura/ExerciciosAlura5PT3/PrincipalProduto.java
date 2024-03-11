package br.com.alura.ExerciciosAlura5PT3;

import java.util.ArrayList;

class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}

public class PrincipalProduto {
    public static void main(String[] args) {
   
    	Produto produto1 = new Produto("PS VITA", 1050);
    	Produto produto2 = new Produto("Xbox", 3050);
    	Produto produto3 = new Produto("PS5", 4300);
    	
    	ArrayList<Produto> listaDeProdutos = new ArrayList<Produto>();
    	listaDeProdutos.add(produto1);
    	listaDeProdutos.add(produto2);
    	listaDeProdutos.add(produto3);
    	
    	
    	
    	double somaPrecos = 0;
    	
    	 for( Produto produto : listaDeProdutos) {
    		 somaPrecos += produto.getPreco();
    	 }
    	 
    	 double mediaPreco = somaPrecos / listaDeProdutos.size();
    	 
    	 System.out.println(mediaPreco);
    	 
    	 
    	
    	
    }
}

