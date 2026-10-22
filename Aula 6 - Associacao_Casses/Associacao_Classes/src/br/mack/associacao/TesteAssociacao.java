package br.mack.associacao;

public class TesteAssociacao {
    public static void main(String[] args) {

        Produto p1 = new Produto();

        p1.codigo = 1;
        p1.descricao = "Arroz";
        p1.qtde = 10;
        p1.precoUnit = 10.0;

        p1.exibir();

        Fornecedor fornecedorX = new Fornecedor();

        fornecedorX.codigo = 5;
        fornecedorX.nome = "Fornecedor Supimpa";
        fornecedorX.telefone = "11999999999";

        p1.fornecedor = fornecedorX;

        System.out.println("Imprimindo de novo o produto, agora com fornecdor");

        p1.exibir();
    }
}
