package br.mack.heranca;

public class Principal {

    public static void main(String[] args) {

        Pessoa p = new Pessoa(
                "Fulaninho de Tal",
                25,
                new Endereco(),
                "fulaninho@beltrano.com",
                "a espera de um milagre");
        //p.nome = "Fulaninho";

        p.apresentarse();

        Aluno a = new Aluno("ADS", 12344);
        a.nome = "Fabricio";

        a.apresentarse();

        Aluno b = new Aluno("Daniel", 21, "dani@batman.com", new Endereco(), "concorrido", "ADS", 12346);
        b.apresentarse();

    }

}
