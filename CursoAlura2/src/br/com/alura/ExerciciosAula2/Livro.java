package br.com.alura.ExerciciosAula2;

public class Livro {

	private String titulo;
	private String autor;
	
	
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	
	public void exibeDetalhes() {
		System.out.println("Titulo da obra : " + titulo);
		System.out.println("Autor da obra :  " + autor);
	}
	
	
}
