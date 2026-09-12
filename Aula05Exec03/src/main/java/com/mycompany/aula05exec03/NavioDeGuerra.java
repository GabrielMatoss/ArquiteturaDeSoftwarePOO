/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula05exec03;

/**
 *
 * @author unifglourenco
 */
public class NavioDeGuerra extends Navio{
    protected double blindagem, ataque;
    
    public void NavioDeGuerra(){
    
    }

    public NavioDeGuerra(double blindagem, double ataque, int numeroTripulantes, String nome) {
        super(numeroTripulantes, nome);
        this.blindagem = blindagem;
        this.ataque = ataque;
    }

    public double getBlindagem() {
        return blindagem;
    }

    public void setBlindagem(double blindagem) {
        this.blindagem = blindagem;
    }

    public double getAtaque() {
        return ataque;
    }

    public void setAtaque(double ataque) {
        this.ataque = ataque;
    }
    
    
    public void ExibirArmas(){
        System.out.println("Exibindo Armas");
        System.out.println("Nome........ " + getNome());
        System.out.println("Numero de tripulantes...... " + getNumeroTripulantes());
        System.out.println("Blindagem........ " + blindagem);
        PoderDeFogo();
    }
    
    public void PoderDeFogo(){
        System.out.println("Poder de Fogo....... " + ataque);
    }

    @Override
    public String toString() {
        return "NavioDeGuerra{" + "blindagem=" + blindagem + ", ataque=" + ataque + '}';
    }
    
    
}
