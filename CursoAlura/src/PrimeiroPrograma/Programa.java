package PrimeiroPrograma;

public class Programa {
	public static void main(String[] args) {
		System.out.println("Esse e o Screen Macth");
		System.out.println("Filme: Top Gun: Maverick");
		
		int anoDeLancamento = 2022;
		System.out.println("Ano de lancamento: " + anoDeLancamento);
		boolean incluidoNoPlano = true;
		double notaDeFilme = 8.1;
		
		double media = (9.8 + 6.3 + 8.0)/3;
		System.out.println(media);
		
		String sinopse = """
				Filme Top Gun
				Filme de aventura com gala dos anos 80
				Muito bom!
				Ano de lancamento
					""" + anoDeLancamento;
		System.out.println();
		
		System.out.println(sinopse);
		System.out.println();

		
		
		String senha = "12345";
		if (senha.equals("12345")) {
		    System.out.println("Acesso autorizado!");
		} else {
		    System.out.println("Senha incorreta.");
		}
		
		
		String nome = "joao";
		if (nome.equals(nome)){
			System.out.println("Acesso autorizado");
		} else {
			System.out.println("Acesso negado");
		}
		
		String nome1 = "Maria";
		int idade = 30;
		double valor = 55.9999;
		System.out.println(String.format("Meu nome é %s, eu tenho %d anos e hoje gastei %.2f reais", nome1, idade, valor));
		
		
		System.out.println();
		String nome2 = "João";
		int aulas = 4;

		String mensagem = """
		                  Olá, %s!
		                  Boas vindas ao curso de Java.
		                  Teremos %d aulas para te mostrar o que é preciso para você dar o seu primeiro mergulho na linguagem!
		                  """.formatted(nome2, aulas);

		System.out.println(mensagem);
		
		
		System.out.println();
		
		System.out.println("Correção de variáveis(Exemplo)");
		


		int classificacao = (int) (media/ 2);
		System.out.println(classificacao);
		
		
	}
}
