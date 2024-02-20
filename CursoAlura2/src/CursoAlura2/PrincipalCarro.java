package CursoAlura2;

public class PrincipalCarro {
	public static void main(String[] args) {
		
		Carro carro = new Carro();
		
		carro.nomeCarro = "Porsche";
		carro.ano = 2023;
		carro.cor = "Preta";
		
		carro.exibeFichaTecnica();
		System.out.println("A idade do carro e:  " + carro.calculaIdade() + " anos");
	
		
	}
}
