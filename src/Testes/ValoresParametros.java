package Testes;

public class ValoresParametros {

    private static void valorReferencia( int valor, Contato contato){
        int novoValor = valor + 10;
        valor = novoValor;

        contato = new Contato("Contato 2", "333333", "contato2@email.com");

    }
    public static void main(String[] args) {

    }
}
