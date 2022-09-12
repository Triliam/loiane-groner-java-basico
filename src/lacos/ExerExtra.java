package lacos;

import java.util.Scanner;

public class ExerExtra {
    public static void main(String[] args) {

        //pegue a quantidade de produtos, o valor dos produtos, some conforme for adicionando os valores, verifica e mostra se atingiu valor pra frete gratis e se atingiu valor pra desconto, mostre o valor final

        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com o numeros de produtos");
        int produtos = scan.nextInt();

        double valor;
        double soma = 0;
        double frete = 200;
        double desconto1 = 300;
        boolean freteJaIncluso = false;
        boolean descontoJaIncluso = false;

        for (int i = 0; i < produtos; i++) {
            System.out.println("entre com os valores");
            valor = scan.nextDouble();

            soma = soma + valor;
            System.out.println("a soma dos valores: " + soma);

            if (soma >= frete && !freteJaIncluso) {
                System.out.println("Voce ganhou frete gratis");
                freteJaIncluso = true;
            } else if (soma < frete) {
                System.out.println("falta " + (frete - soma) + " para conseguir frete gratis");
            }

            if (soma >= desconto1 && !descontoJaIncluso) {
                System.out.println("Voce ganhou 5% de desconto");
                descontoJaIncluso = true;
            }
        }
        if (soma >= desconto1) {
            soma = soma - (soma * 5 / 100);
            System.out.println("total dos valores: " + soma);
        }
    }
}
