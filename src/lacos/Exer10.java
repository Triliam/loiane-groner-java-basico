package lacos;

public class Exer10 {
    public static void main(String[] args) {

        int numInicial = 4;
        int numLimite = 10;
        int soma = 0;

        for (int i = numInicial; i <= numLimite; i++) {
            soma = soma + i;
            System.out.println("Agora o valor de i eh: " + i);
            System.out.println("Agora o valor de soma eh: " + soma);
        }
        System.out.println(soma);
    }
}
