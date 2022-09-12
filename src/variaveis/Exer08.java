package variaveis;

import java.util.Scanner;

public class Exer08 {
    public static void main(String[] args) {

        double valorHora;
        double horasTrabalhadas;
        double salario;

        System.out.println("Para descobrir o valor do seu salario deste mes:");
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com o valor da hora:");
        valorHora = scan.nextDouble();
        System.out.println("Entre com a quantidade de horas trabalhadas:");
        horasTrabalhadas = scan.nextDouble();
        salario = valorHora * horasTrabalhadas;
        System.out.println("O valor do salario deste mes sera: " + salario);
    }
}
