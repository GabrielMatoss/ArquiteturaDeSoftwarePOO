
package com.mycompany.aula05exec02;

public class Vereador extends Politico{
    private String municipio;
     
    public Vereador(){
    
    }

    public Vereador(String municipio, String nome, String partido, String estado) {
        super(nome, partido, estado, "Vereador");
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
        return "Vereador{" + "municipio=" + municipio + '}';
    }
     
    @Override
     public void apresentacao(){
        System.out.println("-----Apresentação Vereador------");
        System.out.println("Nome......... " + getNome());
        System.out.println("Partido....... " + getPartido());
        System.out.println("Estado......... " + getEstado());
        System.out.println("Funcao........... " + getFuncao());
        System.out.println("Municipio......... " + municipio);
    }
}
