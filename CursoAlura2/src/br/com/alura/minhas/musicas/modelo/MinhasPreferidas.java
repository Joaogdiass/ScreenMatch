package br.com.alura.minhas.musicas.modelo;

public class MinhasPreferidas {

	public void inclui(Audio audio) {
		if(audio.getClassificacao()>=9) {
			System.out.println(audio.getTitulo() + " e considerado sucesso absoluto e preferido por todos.\n");
		}else {
			System.out.println(audio.getTitulo() + " e bem mediano.");
		}
	}
	
}
