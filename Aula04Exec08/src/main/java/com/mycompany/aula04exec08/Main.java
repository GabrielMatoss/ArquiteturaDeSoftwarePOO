package com.mycompany.aula04exec08;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pessoa> agenda = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        
        while(true){
            System.out.println("Entre com uma da seguintes opções: ");
            System.out.println("n [nova entrada]");
            System.out.println("d [apaga registro da agenda]");
            System.out.println("p [imprime toda a agenda]");
            System.out.println("q [sai do programa]");
            
            String opcao = input.next();
            
             if(opcao.equalsIgnoreCase("n")){
                 System.out.println("Entre com o nome: ");
                 String nome = input.next();
                 System.out.println("Digite o telefone: ");
                 String telefone = input.next();
                 agenda.add(new Pessoa(nome, telefone));
             }
             
             if(opcao.equalsIgnoreCase("p")){
                 System.out.println(agenda);
             }
             
             if(opcao.equalsIgnoreCase("d")){
                System.out.println("Entre com o nome: ");
                 String nome = input.next();
                 for(Pessoa pess: agenda){
                     if(pess.getNome().equalsIgnoreCase(nome)){
                     }
                 }
             }
            
            if(opcao.equalsIgnoreCase("q"))
                break;
        }
    }
}
