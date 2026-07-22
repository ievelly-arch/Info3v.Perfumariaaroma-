package br.edu.ifrn.serviço;

import br.edu.ifrn.modelo.Cliente;

public class ClienteServico {

    public void cadastrarCliente(Cliente cliente) {

        if (cliente.getNome() == null || cliente.getNome().isEmpty()) {
            throw new IllegalArgumentException("Nome inválido.");
        }

        if (!cliente.emailValido()) {
            throw new IllegalArgumentException("Email inválido.");
        }

        System.out.println("Cliente cadastrado com sucesso!");
    }
}
    

