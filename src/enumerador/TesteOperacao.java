package enumerador;

public class TesteOperacao {
    public static void main(String[] args) {


        double divisao = Operacao.DIVISAO.realizarOperacao(6, 2);
        System.out.println(divisao);

        double x = 6;
        double y = 2;

        for (Operacao op : Operacao.values()){
            System.out.print(x + " ");
            System.out.print(op.toString() + " ");
            System.out.print(y + " = ");
            System.out.println(op.realizarOperacao(x, y));
        }
    }
}
