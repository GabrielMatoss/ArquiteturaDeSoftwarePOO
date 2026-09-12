
package com.mycompany.aula05exec03;

public class Navio {
    protected int numeroTripulantes;
    protected String nome;

    public Navio() {
    }

    public Navio(int numeroTripulantes, String nome) {
        this.numeroTripulantes = numeroTripulantes;
        this.nome = nome;
    }

    public int getNumeroTripulantes() {
        return numeroTripulantes;
    }

    public void setNumeroTripulantes(int numeroTripulantes) {
        this.numeroTripulantes = numeroTripulantes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Navio{" + "numeroTripulantes=" + numeroTripulantes + ", nome=" + nome + '}';
    }
    
    public void ExibirInfoGeral(){
        System.out.println("---- INFO GERAL NAVIO ----");
        System.out.println("Nome....... " + nome);
        System.out.println("Numero de Tripulantes...... " + numeroTripulantes);
    }
}
