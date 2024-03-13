package br.com.alura.ScreenMatch.principal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

import br.com.alura.ScreenMatch.modelos.Filme;
import br.com.alura.ScreenMatch.modelos.Serie;
import br.com.alura.ScreenMatch.modelos.Titulo;

public class PrincipalComListas {
	
	public static void main(String[] args) {
		
		Filme meuFilme = new Filme("O poderoso Chefao",1970);
		meuFilme.avalia(8);
		var filmeDoPaulo = new Filme("Dogville",2003);
		filmeDoPaulo.avalia(5);
		Serie serie = new Serie("lost",2000);
		serie.avalia(2);
		
		ArrayList<Titulo> lista = new ArrayList<>();
		lista.add(filmeDoPaulo);
		lista.add(meuFilme);
		lista.add(serie);
		for (Titulo item : lista) {
			System.out.println(item.getNome());
			if(item instanceof Filme filme && filme.getClassificacao() >2) {
				//Filme filme = (Filme) item;
				System.out.println("Classificacao: " + filme.getClassificacao());
				
			}
			
			
		
			ArrayList<String> buscaPorArtista = new ArrayList<>();
			buscaPorArtista.add("Adam Sandler");
			buscaPorArtista.add("Joao");
			buscaPorArtista.add("Gabriela");
			System.out.println(buscaPorArtista);
			
			Collections.sort(buscaPorArtista);
			System.out.println("Em ordem com collections: ");
			System.out.println(buscaPorArtista);
			System.out.println(lista);
			
		}
		
		
		
	}
}
