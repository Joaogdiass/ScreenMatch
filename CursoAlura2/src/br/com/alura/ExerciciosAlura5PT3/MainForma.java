package br.com.alura.ExerciciosAlura5PT3;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainForma {

	public static void main(String[] args) {
		Circulo circulo = new Circulo();
		circulo.raio = 2.15;
		
		Quadrado quadrado = new Quadrado();
		quadrado.lado = 5;
		
		ArrayList<Forma> listaFormas = new ArrayList<>();
		listaFormas.add(quadrado);
		listaFormas.add(circulo);
		
		for (Forma forma : listaFormas) {
            System.out.println("Área: " + forma.calcularArea());
		}
	}

}
