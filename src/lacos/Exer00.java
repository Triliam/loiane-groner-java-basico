package lacos;

public class Exer00 {
    public static void main(String[] args) {

        //for incrementando
        for (int i = 0; i < 5; i++) {
            System.out.println("O valor de i é: " + i);
        }

        // for decrementando
        for (int i = 5; i > 0; i--) {
            System.out.println("O valor de i é: " + i);
        }

        // incremntando e decrem ao msm tempo, valores vao de encontro
        for (int i = 0, j = 10; i < j; i++, j--) {
            System.out.println("valor de i: " + i);
            System.out.println(" Valor de j: " + j);
        }

        //com inicializacao fora do corpo for
        int soma = 0;

        for (int i = 1; i < 5; soma = soma + i++) {
            System.out.println("O valor de i eh: " + i);
            System.out.println("O valor de soma eh: " + soma);
        }

//        for (int i = 1; i < 5; i++) {
//            soma = soma + i;
//            System.out.println("O valor de i eh: " + i);
//            System.out.println("O valor de soma eh: " + soma);
//        }

        System.out.println("O valor de 'soma' eh a soma com o valor de soma mais o valor que é incrementado a i em cada repeticao, definida na expressao 'i < 5' eh: soma = soma + i");
        System.out.println("O valor de soma eh: " + soma);
    }
}
