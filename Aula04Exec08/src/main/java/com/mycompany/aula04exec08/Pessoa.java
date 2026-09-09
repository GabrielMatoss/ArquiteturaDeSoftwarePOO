
package com.mycompany.aula04exec08;

public class Pessoa {
    private String nome;
    private String telefone;
    private static int id=0;

    public Pessoa(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
        this.id++;
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

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Pessoa.id = id;
    }

    

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", telefone=" + telefone + ", id=" + id +  '}';
    }
    
    
}
