package orientacaoAObjetos.heranca;

public class Professor extends Pessoa{
    private String departamento;
    private double salario;


    public Professor() {
    }

    public Professor(String departamento, double salario) {
        this.departamento = departamento;
        this.salario = salario;
    }

//    public Professor(String nome, String telefone, String cpf) {
//        super(nome, telefone, cpf);
//
//    }


    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    protected String obterInfo(){
        System.out.println("prof");
        String s = super.getNome();
        s = s + " " + this.getDepartamento();

        return s;
    }
}
