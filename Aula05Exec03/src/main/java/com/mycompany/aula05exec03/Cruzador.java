/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula05exec03;


public class Cruzador extends NavioDeGuerra{
    protected int numCanhoes;

    public Cruzador(int numCanhoes, double blindagem, double ataque, int numeroTripulantes, String nome) {
        super(blindagem, ataque, numeroTripulantes, nome);
        this.numCanhoes = numCanhoes;
    }

    public int getNumCanhoes() {
        return numCanhoes;
    }

    public void setNumCanhoes(int numCanhoes) {
        this.numCanhoes = numCanhoes;
    }
    
    @Override
    public void PoderDeFogo(){
        System.out.println("Poder de Fogo Cruzador....... " + ataque*Math.sqrt(numCanhoes));
    }
}
