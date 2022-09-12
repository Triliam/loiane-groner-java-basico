package orientacaoAObjetos.interfaceEPolimorfismo.animais;

public class Ave extends Animal  {

    public Ave() {
    }

    public Ave(String nomeCientifico, Tamanho tamanho, double peso, int idade) {
        super(nomeCientifico, tamanho, peso, idade);
    }

    public void alimentar(){
        System.out.println("alimenta seus  filhotes");
    }
    public String alimentarFilhotes(){
        return "mastiga a comida e cospe na boca dos filhotes";
    }

}
