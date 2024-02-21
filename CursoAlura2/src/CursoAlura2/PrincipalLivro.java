package CursoAlura2;

import br.com.alura.ExerciciosAula2.Livro;

public class PrincipalLivro {

	public static void main(String[] args) {
		Livro livro = new Livro();
		
		
		livro.setAutor("Gabriel Derviche");
		livro.setTitulo("Diario de uma tapada");
		
		
		livro.exibeDetalhes();

	}

}
