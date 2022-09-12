package condicionais;

import java.util.Scanner;

public class Exer10 {
    public static void main(String[] args) {

        double nota1;
        double nota2;
        double media;

        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com a primeira nota: ");
        nota1 = scan.nextDouble();
        System.out.println("Entre com a segunda nota: ");
        nota2 = scan.nextDouble();
        media = (nota1 + nota2) / 2;
        System.out.println("A média é: " + media);

        if (media == 10.0) {
            System.out.println("Aprovacao com distincao");

        } else if (media >= 7) {
            System.out.println("Aprovacao");
        } else {
            System.out.println("Reprovacao");
        }
    }
}
