package orientacaoAObjetos.interfaceEPolimorfismo.animais;

public class Mamifero extends Animal{

    public Mamifero(){

    }

    public Mamifero(String nomeCientifico, Tamanho tamanho, double peso, int idade) {
        super(nomeCientifico, tamanho, peso, idade);
    }


    public String amamentar(){
        return "Amamenta seus filhotes";
    }
}
