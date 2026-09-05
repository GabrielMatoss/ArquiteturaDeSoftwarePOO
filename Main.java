package com.mycompany.aula04exec04;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<ContaCorrente> contas = new ArrayList<>();;
        
        Scanner teclado = new Scanner(System.in);
        double saldoLocal, valorLocal;
        String escolha;
        
        System.out.println("----- CRIANDO AS CONTAS ------");
        int num = 1;
        for(int i = 0; i < 3; i++){
            System.out.println("Informe o saldo inicial da conta numero " + num++ + ":");
            saldoLocal = teclado.nextDouble();
            contas.add(new ContaCorrente(saldoLocal));
        }
        
        System.out.println("----- SALDO DAS CONTAS APOS A CRIACAO -----");
        for(int i = 0; i < contas.size(); i++){
            System.out.println(contas.get(i));
        }
        
        System.out.println("----- REALIZANDO SAQUES E DEPOSITOS -----");
        for(int i =0; i < contas.size(); i++){
            //limpa buffer
            teclado.nextLine();
            System.out.println("Digite o Saque ou Deposito: ");
            escolha = teclado.nextLine();
            System.out.println("Informe o valor: ");
            valorLocal = teclado.nextDouble();
            if(escolha.equalsIgnoreCase("saque")){
                contas.get(i).Sacar(valorLocal);
            } else {
                contas.get(i).Depositar(valorLocal);
            }
        }
        
        System.out.println("----- SALDO DAS CONTAS APOS SAQUE/DEPOSITO -----");
        for(int i = 0; i < contas.size(); i++){
            System.out.println(contas.get(i));
        }
        
    }
}
