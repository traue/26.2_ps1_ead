package br.mack.heranca;

public class Pessoa  {

    //atributos:
    String nome;
    int idade;
    Endereco endereco;
    String email;
    private String estadoCivil; //ninguém que herda de pessoa herdará esse atributo

    //construtores…
    public Pessoa() {
    }

    public Pessoa(String nome, int idade, Endereco endereco, String email, String estadoCivil) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
        this.email = email;
        this.estadoCivil = estadoCivil;
    }

    //operações
    public void apresentarse() {
        System.out.println("Meu nome é " + nome + ". Prazer!");
    }




}
