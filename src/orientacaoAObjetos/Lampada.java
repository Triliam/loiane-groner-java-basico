package orientacaoAObjetos;

public class Lampada {
    String modelo;
    String tensao;
    int potencia;
    String cor;
    String tipoLuz;
    int garantiaMeses;
    String[] tipos;
    boolean tipoAbajur;
    boolean ligada;


    void ligarLampada() {
        ligada = true;
        System.out.println("Lampada ligada");
    }

    void desligarLampada() {
        ligada = false;
        System.out.println("Lampada desligada");
    }

    void mudarEstadoLampada() {
        if (ligada) {
            desligarLampada();
        } else {
            ligarLampada();
        }
    }

    void mostrarEstadoLampada() {
        if (ligada) {
            System.out.println("A lampada esta ligada");
        } else {
            System.out.println("A lampada esta desligada");
        }
    }
}
