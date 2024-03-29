package br.com.alura.ScreenMatch.principal;

import java.util.ArrayList;

import Calculos.CalculadoraDeTempo;
import Calculos.FiltroDeRecomendacao;
import br.com.alura.ScreenMatch.modelos.Episodio;
import br.com.alura.ScreenMatch.modelos.Filme;
import br.com.alura.ScreenMatch.modelos.Serie;

public class Principal {
	public static void main(String[] args) {
		
		Filme meuFilme = new Filme("O poderoso Chefao",1970);
		
		
		
		meuFilme.setDuracaoEmMinutos(180);
		System.out.println("Duracao do filme: " + meuFilme.getDuracaoEmMinutos()); 
		
		meuFilme.exibeFichaTecnica();
		meuFilme.avalia(8);
		meuFilme.avalia(5);
		meuFilme.avalia(10);
		System.out.println("Total de avaliacoes: " + meuFilme.getotalDeAvaliacoes());
		System.out.println("Media de avaliacoes: " + meuFilme.mediaAvaliacoes());
		
		Serie serie = new Serie("lost",2000);
		
		
		
		serie.exibeFichaTecnica();
		serie.setTemporadas(10);
		serie.setEpisodiosPorTemporada(20);
		serie.setMinutosPorEpisodio(50);
		System.out.println("Duracao total de lost em minutos: " + serie.getDuracaoEmMinutos());
		
	

		
		
		CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
		calculadora.inclui(meuFilme);
		calculadora.inclui(serie);
		System.out.println(calculadora.getTempoTotal());
		
		FiltroDeRecomendacao filtro = new FiltroDeRecomendacao();
		
		filtro.filtrar(meuFilme);
		
		Episodio episodio = new Episodio();
		episodio.setNumero(1);
		episodio.setSerie(serie);
		episodio.totalDeVizualizacoes(300);
		filtro.filtrar(episodio);
				
		
		var filmeDoPaulo = new Filme("Dogville",2003);
		filmeDoPaulo.setDuracaoEmMinutos(200);
		
		filmeDoPaulo.avalia(10);
		
		ArrayList<Filme> listaDeFilmes = new ArrayList<>();
		listaDeFilmes.add(filmeDoPaulo);
		listaDeFilmes.add(meuFilme);
		System.out.println("Tamanho da lista: " + listaDeFilmes.size());
		System.out.println("Primeiro filme: " + listaDeFilmes.get(0).getNome());
		System.out.println(listaDeFilmes);
		System.out.println("toString do filme: " + listaDeFilmes.get(0).toString());
				

	}
	
}
