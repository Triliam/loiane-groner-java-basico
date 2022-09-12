package orientacaoAObjetos.interfaceEPolimorfismo.animais;

public class Corvo extends Ave implements Som {

    public Corvo(String nomeCientifico, Tamanho tamanho, double peso, int idade) {
        super(nomeCientifico, tamanho, peso, idade);
    }

    @Override
    public String emitirSom() {
        return "Som: kaka-kaka";
    }

    @Override
    public String significadoDoSom() {
        return "vc eh fraco, nao tem odio suficiente";
    }
}
