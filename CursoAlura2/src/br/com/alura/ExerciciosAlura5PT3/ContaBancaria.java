package br.com.alura.ExerciciosAlura5PT3;

import java.util.ArrayList;

public class ContaBancaria {

    public static void main(String[] args) {

        MetodosBanco conta1 = new MetodosBanco(101, 2500);
        MetodosBanco conta2 = new MetodosBanco(102, 10000);
        MetodosBanco conta3 = new MetodosBanco(103, 5555555);

        ArrayList<MetodosBanco> listaDeContas = new ArrayList<>();
        listaDeContas.add(conta1);
        listaDeContas.add(conta2);
        listaDeContas.add(conta3);

        MetodosBanco contaMaiorSaldo = listaDeContas.get(0);
        for (MetodosBanco conta : listaDeContas) {
            if (conta.getSaldo() > contaMaiorSaldo.getSaldo()) {
                contaMaiorSaldo = conta;
            }
        }

        System.out.println("Conta com o maior saldo - Número: " + contaMaiorSaldo.getNumeroConta() +
                ", Saldo: " + contaMaiorSaldo.getSaldo());

    }
}
