package br.com.alura.ExerciciosAlura5PT3;

class MetodosBanco {
    private int numeroConta;
    private double saldo;

    public MetodosBanco(int numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }
}