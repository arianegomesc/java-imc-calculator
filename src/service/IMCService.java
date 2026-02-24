package service;

import model.Pessoa;

public class IMCService {

    public double calcularIMC(Pessoa pessoa) {

        if (pessoa.getAltura() <= 0) {
            throw new IllegalArgumentException("Altura deve ser maior que zero.");
        }

        return pessoa.getPeso() / (pessoa.getAltura() * pessoa.getAltura());
    }

    public String classificarIMC(double imc) {

        if (imc < 18.5) {
            return "Magreza";
        } else if (imc < 25) {
            return "Normal";
        } else if (imc < 30) {
            return "Sobrepeso";
        } else if (imc < 35) {
            return "Obesidade grau I";
        } else if (imc < 40) {
            return "Obesidade grau II";
        } else {
            return "Obesidade III";
        }
    }

}
