package orientacaoAObjetos.heranca;

public class PessoaTeste {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Jess");

        Aluno aluno = new Aluno();
        aluno.setNome("Jiu");

        Professor prof = new Professor();
        prof.setNome("Des");
        prof.setDepartamento("Historia");

        Professor prof2 = new Professor("Geo", 2.000);
        prof2.setNome("Jonas");

        System.out.println(pessoa.obterInfo());
        System.out.println(aluno.obterInfo());
        System.out.println(prof.obterInfo());
        System.out.println(prof2.obterInfo());
    }
}
