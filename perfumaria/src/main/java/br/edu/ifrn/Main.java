package br.edu.ifrn;

import br.edu.ifrn.modelo.Produto;
import br.edu.ifrn.serviço.ProdutoServico;

public class Main {

    public static void main(String[] args) {

        ProdutoServico produtoServico = new ProdutoServico();

        System.out.println("=== INSERINDO PRODUTOS ===");

        Produto produto1 = new Produto(
                "Egeo Dolce",
                "O Boticário",
                "Perfume",
                129.90,
                
                10
        );

        Produto produto2 = new Produto(
                "Kaiak",
                "Natura",
                "Perfume",
                99.90,
                8
        );

        produtoServico.cadastrarProduto(produto1);
        produtoServico.cadastrarProduto(produto2);

        System.out.println("\n=== LISTANDO PRODUTOS ===");

        produtoServico.listarProdutos().forEach(System.out::println);

        System.out.println("\n=== ATUALIZANDO PRODUTO ===");

        produto2.setPreco(109.90);
        produto2.setQuantidadeEstoque(5);

        produtoServico.atualizarProduto(produto2);

        produtoServico.listarProdutos().forEach(System.out::println);

        System.out.println("\n=== EXCLUINDO PRODUTO ===");

        produtoServico.excluirProduto(produto1.getId());

        produtoServico.listarProdutos().forEach(System.out::println);

    }

}
