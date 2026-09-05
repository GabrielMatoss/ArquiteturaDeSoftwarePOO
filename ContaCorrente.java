package com.mycompany.aula04exec04;

public class ContaCorrente {
    private double saldo;
    
    public ContaCorrente(double saldo){
        this.saldo = saldo;
    }
    
    
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public double Sacar(double valor){
        if(valor > this.saldo){
            return 0;
        }
        
       saldo = saldo - valor;
       return saldo;
    }
    
    public double Depositar(double valor){
        saldo += valor;
        return saldo;
    }

    @Override
    public String toString() {
        return "ContaCorrente{" + "saldo=" + saldo + '}';
    }
    
    
}
