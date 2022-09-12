package variaveis;

import java.util.Scanner;

public class Exer05 {
    public static void main(String[] args) {

        //transformar valor metros em centimetros
        //1m = 100cm multiplicar o valor por 100

        double metros;
        double centimetros;

        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com o valor em metros");
        metros = scan.nextDouble();
        centimetros = metros * 100;
        System.out.println("O valor em centimetros é: " + centimetros);
    }
}
