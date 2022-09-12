package orientacaoAObjetos.interfaceEPolimorfismo.animais;

public abstract class Animal {

    private String nomeCientifico;
    private Tamanho tamanho;
    private double peso;
    private int idade;

    public Animal(){

    }

    public Animal(String nomeCientifico, Tamanho tamanho, double peso, int idade) {
        this.nomeCientifico = nomeCientifico;
        this.tamanho = tamanho;
        this.peso = peso;
        this.idade = idade;
    }

    public String getNomeCientifico(){
        return this.nomeCientifico;
    }
    public void setNomeCientifico(String nomeCientifico){
        this.nomeCientifico = nomeCientifico;
    }

    public Tamanho getTamanho() {
        return tamanho;
    }

    public void setTamanho(Tamanho tamanho) {
        this.tamanho = tamanho;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return this.idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }


}
