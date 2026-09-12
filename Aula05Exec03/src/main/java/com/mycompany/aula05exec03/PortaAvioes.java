package com.mycompany.aula05exec03;

public class PortaAvioes extends NavioDeGuerra{
    protected int numAvioes;

    public PortaAvioes(int numAvioes, double blindagem, double ataque, int numeroTripulantes, String nome) {
        super(blindagem, ataque, numeroTripulantes, nome);
        this.numAvioes = numAvioes;
    }

    public int getNumAvioes() {
        return numAvioes;
    }

    public void setNumAvioes(int numAvioes) {
        this.numAvioes = numAvioes;
    }

    @Override
    public String toString() {
        return "PortaAvioes{" + "numAvioes=" + numAvioes + '}';
    }
    
    @Override
    public void PoderDeFogo(){
        System.out.println("Poder de Fogo Porta Avioes....... " + ataque*Math.pow(numAvioes,2));
    }
}
