package br.mack.heranca;

                    // é
public class Aluno extends Pessoa {

    String curso;
    int matricula;

    public Aluno(String curso, int matricula) {
        this.curso = curso;
        this.matricula = matricula;
    }

    public Aluno() {
    }

    public Aluno(String nome, int idade, String email, Endereco end, String estadoCivil, String curso, int matricula) {
        super(nome, idade, end, email,estadoCivil);
        this.curso = curso;
        this.matricula = matricula;
    }

    @Override
    public void apresentarse() {

        System.out.println("Eu sou um aluno!");
        //...
        super.apresentarse();
    }
}
