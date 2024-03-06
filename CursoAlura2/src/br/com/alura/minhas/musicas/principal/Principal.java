package br.com.alura.minhas.musicas.principal;


import br.com.alura.minhas.musicas.modelo.MinhasPreferidas;
import br.com.alura.minhas.musicas.modelo.Musica;
import br.com.alura.minhas.musicas.modelo.Podcasts;

public class Principal {

	public static void main(String[] args) {
		Musica minhaMusica = new Musica();
		minhaMusica.setTitulo("Londres Freestyle");
		minhaMusica.setCantor("Veigh");
		
		
		for (int i = 0; i < 1000; i++) {
			minhaMusica.reproduz();
		}
		
		for (int i = 0; i < 50; i++) {
			minhaMusica.curte();
		}
		
		
		Podcasts meuPodcast = new Podcasts();
		meuPodcast.setTitulo("Flow Podcast");
		meuPodcast.setHost("Igor 3K");
		
		for (int i = 0; i < 1000; i++) {
			meuPodcast.curte();
		}
		
		for (int i = 0; i < 5000; i++) {
			meuPodcast.reproduz();
		}
		
		MinhasPreferidas preferidas = new MinhasPreferidas();
		preferidas.inclui(meuPodcast);
		preferidas.inclui(minhaMusica);
		
	}

}
