package br.mack.associacao;

public class Produto {

    // ----- Atributos "básicos" -----
    int codigo;
    String descricao;
    int qtde;
    double precoUnit;

    // ----- Atributo de ASSOCIAÇÃO -----
    // um Produto TEM UM Fornecedor.
    Fornecedor fornecedor;

    // ----- Métodos -----
    // Exibe os dados do produto E, se existir, do fornecedor associado.
    void exibir() {
        System.out.println("=== Produto ===");
        System.out.println("Código    : " + codigo);
        System.out.println("Descrição : " + descricao);
        System.out.println("Quantidade: " + qtde);
        System.out.println("Preço Un. : R$ " + precoUnit);

        // Navegação pela associação:
        // a partir do Produto, chegamos aos dados do Fornecedor.
        if (fornecedor != null) {
            fornecedor.exibirDados();
        } else {
            System.out.println("(Este produto ainda não tem fornecedor)");
        }
    }

    // Aplica um reajuste percentual no preço unitário.
    double reajustar(double porcentagem) {
        precoUnit = precoUnit + (precoUnit * porcentagem / 100.0);
        return precoUnit;
    }


}
