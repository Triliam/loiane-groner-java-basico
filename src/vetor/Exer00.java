package vetor;

import java.util.Scanner;

public class Exer00 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[5];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com o valor do indice " + i);
            vetorA[i] = scan.nextInt();
        }

        System.out.println("Agora os valores setados serao avaliados se sao par");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Analizando todos os numeros que sao pares entre 2 ate o valor " + vetorA[i]);

            for (int j = 2; j <= vetorA[i]; j++) {
                if (j % 2 == 0) {
                    System.out.println(j + " é par");
                }
            }
//          System.out.println("Seleciona todos os valores pares nos indices de vetorA[i] ");
//            for (int valoresA : vetorA) {
//                if (valoresA % 2 ==0){
//                    System.out.println("É par: " + valoresA);
//                }
        }
        System.out.println();
    }
}
