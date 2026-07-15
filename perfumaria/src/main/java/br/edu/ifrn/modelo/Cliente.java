package br.edu.ifrn.modelo;

public class Cliente {

    private String nome;
    private String telefone;
    private String email;

    public boolean emailValido() {
        return email != null && email.contains("@");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
