package lacos;

import java.util.Scanner;

public class Exer32 {
    public static void main(String[] args) {

        int codigo = 0;
        double preco;
        int unidades = 0;
        double total = 0;
        String resposta;
        boolean sair = false;

        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("mais alguma coisa? digite S/N");
            resposta = scan.next();

            if (resposta.equalsIgnoreCase("s")) {
                System.out.println("Entre com o codigo do produto: 100 - cachorro quente; 101 - bauru simples; 102 - bauru com ovo");
                codigo = scan.nextInt();
                System.out.println("Entre com a quantidade do produto");
                unidades = scan.nextInt();
            } else {
                System.out.println("obrigada");
                System.out.println("valor: " + (total));
                sair = true;
            }

            if (codigo == 100) {
                preco = 1.20;
                total = total + (preco * unidades);
                System.out.println("cachorro quente fica: " + (preco * unidades));
            }
            if (codigo == 101) {
                preco = 1.30;
                total = total + (preco * unidades);
                System.out.println("bauru simples, fica " + (preco * unidades));
            }
            if (codigo == 102) {
                preco = 1.50;
                total = total + (preco * unidades);
                System.out.println("bauru com ovo, fica: " + (preco * unidades));
            }

        } while (!sair);
    }
}
