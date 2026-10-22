package br.mack.agregacao;

public class Venda {

    // Atributos do tipo de outras classes, associação.
    Comprador c;
    Vendedor  v;
    Produto   p;

    // Metodo para efetivar a venda.
    void concretizaVenda() {
        System.out.println("Venda realizada com sucesso!!");
    }

    // Metodo para cancelar a venda.
    void cancelaVenda() {
        System.out.println("Venda cancelada!!!");
    }

}
