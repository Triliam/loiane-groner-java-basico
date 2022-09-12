package lacos;

import java.util.Scanner;

public class Exer07 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num;
        //int maior = Integer.MIN_VALUE;
        int maior = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Entre com o numero");
            num = scan.nextInt();

            if (num > maior) {
                maior = num;
                System.out.println("Agora o maior numero é: " + maior);
            }
        }
        System.out.println("O maior numero é: " + maior);
    }
}
