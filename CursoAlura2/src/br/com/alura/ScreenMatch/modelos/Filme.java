package br.com.alura.ScreenMatch.modelos;

import Calculos.CalculoDeClassificacao;

public class Filme extends Titulo implements CalculoDeClassificacao {
	
		private String diretor;

		public String getDiretor() {
			return diretor;
		}

		public void setDiretor(String diretor) {
			this.diretor = diretor;
		}

		@Override
		public int getClassificacao() {
			
			return (int) mediaAvaliacoes()/2;
		}
		
		
		
		@Override
		public String toString() {
			
			return "Filme: " + this.getNome() + "(" + this.getAnoDeLancamento()+ ")";
		}
		
}
