package orientacaoAObjetos.heranca;

public class Aluno extends Pessoa {

    private String classe;
    private double[] notas;


    public Aluno() {

    }

    public Aluno(String nome, String telefone, String cpf, String classe) {
        super(nome, telefone, cpf);
        this.classe = classe;
    }


    protected String obterInfo() {
        System.out.println("aluno");
        String s = super.getNome();
        return s;
    }
}
