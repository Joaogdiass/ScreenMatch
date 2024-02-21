package br.com.alura.ExerciciosAula2;

public class IdadePessoa {

	private String nome;
	private byte idade;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public byte getIdade() {
		return idade;
	}
	public void setIdade(byte idade) {
		this.idade = idade;
	}
	
	public void VerificarIdade() {
		if (idade>=18) {
			System.out.println(nome + " é maior de idade.");
        } else {
            System.out.println(nome + " não é maior de idade.");
        
		}
	}
	
	
	
	
}
