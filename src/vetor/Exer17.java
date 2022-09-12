package vetor;

import java.util.Scanner;

public class Exer17 {
    public static void main(String[] args) {

        int[] vetorA = new int[10];
        int qtdPessoas35Mais = 0;

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com a idade: " + i);
            vetorA[i] = scan.nextInt();
        }

        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] > 35) {
                qtdPessoas35Mais++;
                System.out.println("Pessoas com mais de 35 anos: " + vetorA[i]);
            }
        }
        System.out.println("Total de pessoas com mais de 35 anos: " + qtdPessoas35Mais);
    }
}
