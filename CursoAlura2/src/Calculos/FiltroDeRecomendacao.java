package Calculos;

public class FiltroDeRecomendacao {
	private String recomendacao;
	
	public void filtrar(CalculoDeClassificacao calculoDeClassificacao) {
		if(calculoDeClassificacao.getClassificacao()>= 4) {
			System.out.println("Esta entre os preferidos do momento.");
		}else if (calculoDeClassificacao.getClassificacao()>=2) {
			System.out.println("Muito bem avaliado no momento.");
		}else {
			System.out.println("Coloque na sua lista para assistir depois.");
		}
	}
	
	
}
