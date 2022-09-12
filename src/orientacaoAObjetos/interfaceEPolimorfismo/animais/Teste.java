package orientacaoAObjetos.interfaceEPolimorfismo.animais;

public class Teste {
    public static void main(String[] args) {

        Ave pinguim = new Ave();
        pinguim.setNomeCientifico("Pinguim");
        pinguim.setTamanho(Tamanho.MEDIO);
        pinguim.setPeso(10.0);
        pinguim.setIdade(15);
       // pinguim.emitirSom(); // n acessa a interface Som
        pinguim.alimentar(); // imprime sem precisar usar System.out.println
        System.out.println(pinguim.getNomeCientifico() + " " + pinguim.getTamanho() + " " + pinguim.alimentarFilhotes());
       // System.out.println(pinguim.alimentar()); n imprime void

        System.out.println("-------------");

        Mamifero tatu = new Mamifero();
        tatu.setNomeCientifico("tatu");
        tatu.setIdade(12);
        tatu.amamentar();
        System.out.println(tatu.getNomeCientifico() + " " + tatu.amamentar());

        System.out.println("-------------");

        Corvo corvo = new Corvo("Itachi", Tamanho.PEQUENO, 4, 100);
        corvo.alimentar();
        corvo.emitirSom();
        String sc = corvo.significadoDoSom();
       // System.out.println(corvo.alimentar());
        System.out.println("O corvo " + corvo.alimentarFilhotes());
        System.out.println(corvo.emitirSom() + ": " + sc);

        System.out.println("-------------");

        Mamifero elefante = new Elefante("Elefante", Tamanho.GRANDE, 400, 1000);
        //n acessa a interface Som
//        elefante.emitirSom();
//        elefante.significadoDoSom();
          elefante.amamentar();
        System.out.println(elefante.getNomeCientifico() + " " + elefante.amamentar());

        System.out.println("-------------");

        Elefante elefante1 = new Elefante("Fante",Tamanho.GRANDE, 300, 800);
        elefante1.amamentar();
        String somElefante = elefante1.emitirSom() + ": ";
        somElefante += elefante1.significadoDoSom();
        System.out.println(somElefante + " " + elefante.amamentar());

    }

}
