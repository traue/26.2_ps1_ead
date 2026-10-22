package br.mack.agregacao;

public class CarrinhoCompras {
    public static void main(String[] args) {

        // 1) As "partes" nascem INDEPENDENTES, fora da Venda.
        Produto   produto = new Produto();
        Vendedor  vendedor = new Vendedor();
        Comprador comprador = new Comprador();

        // 2) A Venda é criada "vazia" e recebe as partes por atribuição.
        Venda vendaHoje = new Venda();
        vendaHoje.p = produto;   // associação: venda -> produto
        vendaHoje.c = comprador;   // associação: venda -> comprador
        vendaHoje.v = vendedor;   // associação: venda -> vendedor

        // 3) Manipulando atributos através da associação.
        vendaHoje.p.preco    = 1000.00;
        vendaHoje.v.comissao = 100.00;
        vendaHoje.c.verba    = 50000.00;

        // 4) Executando os métodos da venda e das partes.
        vendaHoje.concretizaVenda();
        vendaHoje.p.vendido();
        vendaHoje.v.vende();
        vendaHoje.c.compra();

        // 5) Simulação do conceito: se a venda "some" (virar null),
        //    as partes continuam existindo.
        vendaHoje = null;
        System.out.println("\nVenda cancelada, mas olha só:");
        System.out.println("Preço do produto ainda existe: " + produto.preco);
        System.out.println("Comissão do vendedor ainda existe: " + vendedor.comissao);
        System.out.println("Verba do comprador ainda existe: " + comprador.verba);
    }

}
