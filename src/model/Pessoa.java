package model;

public class Pessoa {

    private double peso;
    private double altura;

    public Pessoa(double peso, double altura){
        this.peso = peso;
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }
}
