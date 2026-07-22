package br.edu.ifrn.serviço;


import br.edu.ifrn.modelo.Venda;

public class VendaServico {

    public void registrarVenda(Venda venda) {

        if (venda.getQuantidade() <= 0) {
            throw new IllegalArgumentException("Quantidade inválida.");
        }

        System.out.println("Venda registrada com sucesso!");
    }
}
