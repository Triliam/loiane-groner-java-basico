package vetor;

import java.util.Scanner;

public class Exer25 {
    public static void main(String[] args) {

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com o valor da posicao " + i + " do vetorA");
            vetorA[i] = scan.nextInt();
            if (vetorA[i] > 5) {
                vetorB[i] = vetorA[i];
            }
        }

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Vetor A: " + vetorA[i]);
        }

        for (int i = 0; i < vetorB.length; i++) {
            System.out.println("Vetor B: " + vetorB[i]);
        }
    }
}
