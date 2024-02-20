package CursoAlura2;

public class PrincipalMusica {

	public static void main(String[] args) {
		
		Musica musica = new Musica();
		
		musica.titulo = "Loucura";
		musica.artista = "Veigh";
		musica.anoDeLancamento = 2004;
		
		
		musica.exibeFichaTecnica();
		musica.avalia(10);
		musica.avalia(5);
		musica.avalia(7);
		musica.avalia(3);
		System.out.println(musica.somaDasAvaliacoes);
		System.out.println(musica.numDeAvaliacoes);
		System.out.println(musica.pegaMedia());
		
		

	}

}
