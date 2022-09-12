package orientacaoAObjetos.interfaceEPolimorfismo.animais;

public class Elefante extends Mamifero implements Som {

    public Elefante(String nomeCientifico, Tamanho tamanho, double peso, int idade) {
        super(nomeCientifico, tamanho, peso, idade);
    }

    @Override
    public String emitirSom() {
        return "hmmm";
    }

    @Override
    public String significadoDoSom() {
        return "o som da sabedoria suprema";
    }
}
