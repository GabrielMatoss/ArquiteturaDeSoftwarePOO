
package com.mycompany.aula05exec02;

public class Prefeito extends Politico {
    private String municipio;

    public Prefeito() {
       
    }

    public Prefeito(String municipio, String nome, String partido, String estado) {
        super(nome, partido, estado, "Prefeito");
        this.municipio = municipio;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    @Override
    public String toString() {
        return "Prefeito{" + "municipio=" + municipio + '}';
    }
    
    @Override
    public void apresentacao(){
        System.out.println("-----Apresentação Prefeito------");
        System.out.println("Nome......... " + getNome());
        System.out.println("Partido....... " + getPartido());
        System.out.println("Estado......... " + getEstado());
        System.out.println("Funcao........... " + getFuncao());
        System.out.println("Municipio......... " + municipio);
    }
}
