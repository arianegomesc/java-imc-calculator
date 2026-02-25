import model.Pessoa;
import service.IMCService;

import javax.swing.JOptionPane;
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

            double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso(kg): "));
            double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura (m): "));


            if (peso <= 0 || altura <= 0) {
                System.out.println("ERRO: Peso e altura devem ser maiores que zero.");
                return;
            }

            Pessoa pessoa = new Pessoa(peso, altura);

            double imc = service.calcularIMC(pessoa);
            String classificacao = service.classificarIMC(imc);

            JOptionPane.showMessageDialog(
                    null,
                    String.format("Seu IMC é: %.2f\nClassificação: %s", imc, classificacao)
            );

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(
                    null,
                    "Erro: Digite apenas números válidos."
            );
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(
                    null,
                    e.getMessage()
            );
        }
    }
}