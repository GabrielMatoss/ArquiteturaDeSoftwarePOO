package com.mycompany.aula05exec03;

public class NavioMercante extends Navio{
    protected double capacidadeCarga, carga;

    public NavioMercante() {
    }

    public NavioMercante(double capacidadeCarga, double carga, int numeroTripulantes, String nome) {
        super(numeroTripulantes, nome);
        this.capacidadeCarga = capacidadeCarga;
        this.carga = carga;
    }

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return "NavioMercante{" + "capacidadeCarga=" + capacidadeCarga + ", carga=" + carga + '}';
    }
    
    public void Carregamento(){
        System.out.println("Carregamento");
        System.out.println("Nome........ " + getNome());
        System.out.println("Numero de tripulantes...... " + getNumeroTripulantes());
        System.out.println("Volume do Navio.......... " + carga/capacidadeCarga);
    }
}
