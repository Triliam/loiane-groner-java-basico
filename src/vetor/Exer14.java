package vetor;

import java.util.Scanner;

public class Exer14 {
    public static void main(String[] args) {

        int[] vetorA = new int[10];
        int soma = 0;
        int impares = 0;

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com o numero na posicao: " + i);
            vetorA[i] = scan.nextInt();
        }
        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 2 != 0) {
                soma = soma + vetorA[i];
                impares++;
            }
        }
        System.out.println("Total de numeros impares: " + impares + " de " + vetorA.length);
        System.out.println("Somando apenas os numeros impares: " + soma);
        System.out.println("Media da soma dos numeros impares" + soma / impares);
    }
}
