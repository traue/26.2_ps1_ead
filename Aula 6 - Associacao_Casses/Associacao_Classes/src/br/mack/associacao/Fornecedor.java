package br.mack.associacao;

public class Fornecedor {

    // ----- Atributos -----
    int codigo;        // código identificador do fornecedor
    String nome;       // nome / razão social
    String telefone;   // telefone de contato

    // ----- Metodo -----
    // Exibe os dados do fornecedor no console.
    void exibirDados() {
        System.out.println("=== Fornecedor ===");
        System.out.println("Código  : " + codigo);
        System.out.println("Nome    : " + nome);
        System.out.println("Telefone: " + telefone);
    }
}