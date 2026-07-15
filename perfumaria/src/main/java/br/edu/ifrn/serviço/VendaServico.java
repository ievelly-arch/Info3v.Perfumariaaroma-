package br.edu.ifrn.serviço;


import br.edu.ifrn.modelo.venda;

public class VendaServico {

    public void registrarVenda(venda venda) {

        if (venda.getQuantidade() <= 0) {
            throw new IllegalArgumentException("Quantidade inválida.");
        }

        System.out.println("Venda registrada com sucesso!");
    }
}
