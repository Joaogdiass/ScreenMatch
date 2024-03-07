package br.com.alura.ScreenMatch.modelos;

public class Titulo {

	private int anoDeLancamento;
	private boolean incluidoNoPlano;
	private double somaAvaliacao;
	private int totalDeAvaliacoes;
	private int duracaoEmMinutos;
	
	//construtores
	
	private String nome;
	public Titulo(String nome, int anoDeLancamento) {
		super();
		this.nome = nome;
		this.anoDeLancamento = anoDeLancamento;
	}
	
	
	
	//Colocando os setters e os getters
	
	public int getotalDeAvaliacoes() {
		return totalDeAvaliacoes;
	}
	

	public boolean isIncluidoNoPlano() {
		return incluidoNoPlano;
	}

	public void setIncluidoNoPlano(boolean incluidoNoPlano) {
		this.incluidoNoPlano = incluidoNoPlano;
	}

	public String getNome() {
		return nome;
	}

	public int getAnoDeLancamento() {
		return anoDeLancamento;
	}

	public int getDuracaoEmMinutos() {
		return duracaoEmMinutos;
	}

	public void setDuracaoEmMinutos(int duracaoEmMinutos) {
		this.duracaoEmMinutos = duracaoEmMinutos;
	}

	public void setAnoDeLancamento(int anoDeLancamento) {
		this.anoDeLancamento = anoDeLancamento;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void exibeFichaTecnica() {
		System.out.println("Nome do filme: " + nome);
		System.out.println("Ano de lancamento: " + anoDeLancamento);
	}
	public void avalia(double nota){
		
		somaAvaliacao += nota;
		totalDeAvaliacoes++;
		
	}
	
	public double mediaAvaliacoes() {
		return somaAvaliacao/totalDeAvaliacoes;
	}
	
	@Override
	public String toString() {
		return "Filme: " + this.getNome() + " Ano de lancamento: " + this.getAnoDeLancamento();
	}
	
}
