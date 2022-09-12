package condicionais;

import java.util.Scanner;

public class Exer22 {
    public static void main(String[] args) {

        int num;

        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com o numero inteiro");
        num = scan.nextInt();

        if (num % 2 == 0) {
            System.out.println("O numero é par");
        } else {
            System.out.println("O numero é impar");
        }
    }
}
