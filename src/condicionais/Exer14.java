package condicionais;

import java.util.Scanner;

public class Exer14 {
    public static void main(String[] args) {

        //ano bissexto é divisivel por  4

        int ano;

        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com o ano");
        ano = scan.nextInt();

        if (ano % 4 == 0) {
            System.out.println("O ano é bissexto");
        } else {
            System.out.println("O ano não é bissexto");
        }
    }
}
