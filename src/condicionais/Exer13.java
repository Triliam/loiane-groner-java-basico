package condicionais;

import java.util.Scanner;

public class Exer13 {
    public static void main(String[] args) {

        // triangulo: tres lados, quando a soma de qualquer dois lados for maior que o terceiro

        int lado1;
        int lado2;
        int lado3;


        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com o primeiro lado");
        lado1 = scan.nextInt();
        System.out.println("Entre com o segundo lado");
        lado2 = scan.nextInt();
        System.out.println("Entre com o terceiro lado");
        lado3 = scan.nextInt();

        if (((lado1 + lado2) > lado3) && ((lado2 + lado3) > lado1) && ((lado1 + lado3) > lado2)) {

            if (lado1 == lado2 && lado1 == lado3) {
                System.out.println("O triangulo tem tres lados iguais, portanto é equilatero");

            } else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
                System.out.println("O triangulo tem tres lados diferentes, portanto é um escaleno");

            } else if (lado1 == lado2 || lado1 == lado3) {
                System.out.println("O triangulo tem dois lados iguais, portanto é isósceles");

            } else {
                System.out.println("As medidas nao sao compativeis para ser um triangulo");
            }
        }
    }
}
