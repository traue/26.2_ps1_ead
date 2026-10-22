package br.mack.composicao;

public class TestaBanco {

    public static void main(String[] args) {

        // Ao criar o Banco, as contas e poupanças são criadas automaticamente.
        Banco bancoMack = new Banco();

        // Podemos acessar as partes imediatamente.
        bancoMack.contas[0].saldo   = 1000.00;
        bancoMack.poupanca[0].saldo = 100.00;

        System.out.println("Saldo conta corrente [0]: " + bancoMack.contas[0].saldo);
        System.out.println("Saldo poupança [0]: " + bancoMack.poupanca[0].saldo);

        // Se o todo for eliminado, as partes também deixam de existir.
        bancoMack = null; // acabou o banco -> acabaram as contas.
        System.out.println("\nBanco destruído. Os arrays de contas não são mais acessíveis.");

        // tentando acessar uma conta que existia (NullPointerException)
        //System.out.println(bancoMack.contas[0].saldo);


    }
}
