package CursoAlura2;

public class Filme {
	String nome;
	int anoDeLancamento;
	boolean incluidoNoPlano;
	double somaAvaliacao;
	int totalDeAvaliacoes;
	int duracaoEmMinutos;
	
	void exibeFichaTecnica() {
		System.out.println("Nome do filme: " + nome);
		System.out.println("Ano de lancamento: " + anoDeLancamento);
	}
	void avalia(double nota){
		
		somaAvaliacao += nota;
		totalDeAvaliacoes++;
		
	}
	
	double mediaAvaliacoes() {
		return somaAvaliacao/totalDeAvaliacoes;
	}
	
}
