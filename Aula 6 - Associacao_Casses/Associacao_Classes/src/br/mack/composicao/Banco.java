package br.mack.composicao;

public class Banco {

    // Arrays de contas correntes e poupanças do banco.
    ContaCorrente[] contas;
    Poupanca[] poupanca;

    // CONSTRUTOR: é aqui que a composição se concretiza.
    Banco() {
        int maxConta = 10; // capacidade do banco

        // As partes nascem JUNTO com o Banco.
        contas   = new ContaCorrente[maxConta];
        poupanca = new Poupanca[maxConta];

        // Inicializa cada posição dos arrays com uma conta "vazia".
        for (int i = 0; i < maxConta; i++) {
            contas[i]   = new ContaCorrente();
            poupanca[i] = new Poupanca();
        }
    }

    void iniciaBanco()  { /* ... */ }
    void abreConta()    { /* ... */ }
    void abrePoupanca() { /* ... */ }

}
