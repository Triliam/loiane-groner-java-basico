package orientacaoAObjetos.heranca;

public class Pessoa {

    private String nome;
    private String telefone;
    private String cpf;


    public Pessoa() {
    }

    public Pessoa(String nome, String telefone, String cpf) {
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    protected String obterInfo() {
        return nome;
    }
}
