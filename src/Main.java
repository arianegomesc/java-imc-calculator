import model.Pessoa;
import service.IMCService;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        IMCService service = new IMCService();

        System.out.println("===============");
        System.out.println("CALCULADORA IMC");
        System.out.println("===============");

        try {

            System.out.println("Digite seu peso(kg): ");
            double peso = sc.nextDouble();

            System.out.println("Digite sua altura(m): ");
            double altura = sc.nextDouble();

            if (peso <= 0 || altura <= 0){
                System.out.println("ERRO: Peso e altura devem ser maiores que zero.");
                return;
            }

            Pessoa pessoa = new Pessoa(peso, altura);

            double imc = service.calcularIMC(pessoa);

            System.out.printf("Seu IMC é: %.2f%n", imc);
            System.out.println("Classificação: " + service.classificarIMC(imc));

            System.out.println("================");

        } catch (Exception e){
            System.out.println("Erro: Digite apenas números válidos.");
        } finally {
            sc.close();
        }
    }
}