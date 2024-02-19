package PrimeiroPrograma;

public class DesafioTemperatura {
	public static void main(String[] args) {
		
		double tempcelsius = 30.9;
		double tempfire = (tempcelsius*1.8) + 32;
		System.out.println(tempfire);
		
		String mensagem = String.format("A temperatura de %f Celsius e igual a %f Fahrenheit",tempcelsius, tempfire);
		System.out.println(mensagem);
		
		int tempfireint = (int) tempfire;
		System.out.println(tempfireint);
	}
}
