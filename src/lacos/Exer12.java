package lacos;

import java.util.Scanner;

public class Exer12 {
    public static void main(String[] args) {

        int num;
        int tabuada;

        Scanner scan = new Scanner(System.in);
        System.out.println("Escolha um numero ");
        num = scan.nextInt();

        for (int i = 0; i <= 10; i++) {
            //System.out.println(num + "x" + i + "=" + (num*i));
            tabuada = num * i;
            System.out.println(num + "x" + i + " = " + tabuada);
        }
    }
}
