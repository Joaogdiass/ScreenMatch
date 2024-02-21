package CursoAlura2;

import br.com.alura.ExerciciosAula2.IdadePessoa;

public class PrincipalIdadePessoa {

	public static void main(String[] args) {
		
		IdadePessoa pessoa = new IdadePessoa();
		
		pessoa.setNome("Gabriela");
		pessoa.setIdade((byte) 18);
		
		
		
		System.out.println("Nome: " + pessoa.getNome());
		System.out.println("Idade: " + pessoa.getIdade());
		pessoa.VerificarIdade();
		
		
	}
	
}
