package CursoAlura2;

public class Musica {
	
	String titulo;
	String artista;
	int anoDeLancamento;
	double somaDasAvaliacoes;
	int numDeAvaliacoes;
	
	void exibeFichaTecnica(){
		System.out.println("Nome da musica: " + titulo);
		System.out.println("Nome do(a) artista: " + artista);
		System.out.println("Ano de lancamento:  " + anoDeLancamento);
		
	}
	
	void avalia (double nota) {
		somaDasAvaliacoes += nota;
		numDeAvaliacoes++;
	}
	
	double pegaMedia() {
        return somaDasAvaliacoes / numDeAvaliacoes;
    }
	
}
