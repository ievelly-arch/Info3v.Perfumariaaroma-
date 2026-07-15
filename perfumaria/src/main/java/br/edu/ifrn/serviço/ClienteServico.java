package br.edu.ifrn.serviço;

import br.edu.ifrn.modelo.cliente;

public class ClienteServico {

    public void cadastrarCliente(cliente cliente) {

        if (cliente.getNome() == null || cliente.getNome().isEmpty()) {
            throw new IllegalArgumentException("Nome inválido.");
        }

        if (!cliente.emailValido()) {
            throw new IllegalArgumentException("Email inválido.");
        }

        System.out.println("Cliente cadastrado com sucesso!");
    }
}
    

