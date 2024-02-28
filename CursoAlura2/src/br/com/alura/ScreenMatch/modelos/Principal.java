package br.com.alura.ScreenMatch.modelos;

import Calculos.CalculadoraDeTempo;

public class Principal {
	public static void main(String[] args) {
		
		Filme meuFilme = new Filme();
		
		meuFilme.setNome("O poderoso Chefao");
		meuFilme.setAnoDeLancamento(1970);
		meuFilme.setDuracaoEmMinutos(180);
		System.out.println("Duracao do filme: " + meuFilme.getDuracaoEmMinutos()); 
		
		meuFilme.exibeFichaTecnica();
		meuFilme.avalia(8);
		meuFilme.avalia(5);
		meuFilme.avalia(10);
		System.out.println("Total de avaliacoes: " + meuFilme.getotalDeAvaliacoes());
		System.out.println("Media de avaliacoes: " + meuFilme.mediaAvaliacoes());
		
		Serie serie = new Serie();
		
		serie.setNome("lost");
		serie.setAnoDeLancamento(2000);
		serie.exibeFichaTecnica();
		serie.setTemporadas(10);
		serie.setEpisodiosPorTemporada(20);
		serie.setMinutosPorEpisodio(50);
		System.out.println("Duracao total de lost em minutos: " + serie.getDuracaoEmMinutos());
		
	

		
		
		CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
		calculadora.inclui(meuFilme);
		calculadora.inclui(serie);
		System.out.println(calculadora.getTempoTotal());

	}
	
}
