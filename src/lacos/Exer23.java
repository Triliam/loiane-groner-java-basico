package lacos;

public class Exer23 {
    public static void main(String[] args) {

        double valor = 1.99;
        int itens = 50;
        double multiplica;

        System.out.println("Loja quase dois - [tabela de preços]");

        System.out.println("1 item = " + valor + " reais ");
        for (int i = 2; i <= itens; i++) {
            multiplica = valor * i;
            System.out.println(i + " itens  = " + multiplica + " reais");
        }
    }
}
