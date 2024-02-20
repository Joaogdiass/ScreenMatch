package CursoAlura2;

public class Carro {
	
	String nomeCarro;
	String cor;
	int ano;
	
	void exibeFichaTecnica() {
	System.out.println("O modelo do carro e: " + nomeCarro);
	System.out.println("O ano do carro e:    " + ano);
	System.out.println("A cor e:             "  + cor);
	}
	
	int calculaIdade() {
		return 2023 - ano;
	}
	
}
