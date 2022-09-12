package enumerador;

public class Formulario {

    enum Side{
        DARK('D'), LIGHT('L'), GREY('G');

        private char valor;

        Side(char valor){
            this.valor = valor;
        }
    }

    private String nome;
    private Side side;
}
