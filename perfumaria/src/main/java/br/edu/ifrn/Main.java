package br.edu.ifrn;

import br.edu.ifrn.modelo.*;
import br.edu.ifrn.serviço.*;

public class Main {

    public static void main(String[] args) {

        produto produto = new produto();
        produto.setNome("Egeo Dolce");
        produto.setMarca("O Boticário");
        produto.setCategoria("Perfume");
        produto.setPreco(129.90);
        produto.setQuantidadeEstoque(10);

        cliente cliente = new cliente();
        cliente.setNome("Evelly");
        cliente.setTelefone("84999999999");
        cliente.setEmail("evelly@email.com");

        venda venda = new venda();
        venda.setProduto(produto);
        venda.setCliente(cliente);
        venda.setQuantidade(2);
        venda.setValorTotal(259.80);

        produtoServico produtoServico = new produtoServico();
        clienteServico clienteServico = new clienteServico();
        vendaServiço vendaServico = new vendaServiço();
        Relatorio relatorioServico = new Relatorio();

        produtoServico.cadastrarProduto(produto);
        clienteServico.cadastrarCliente(cliente);
        vendaServico.registrarVenda(venda);

        produtoServico.consultarProduto(produto);

        relatorioServico.gerarRelatorioVendas();
        relatorioServico.gerarRelatorioEstoque();
    }
}