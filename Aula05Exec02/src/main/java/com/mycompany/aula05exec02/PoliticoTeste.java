/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula05exec02;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author unifglourenco
 */
public class PoliticoTeste {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        ArrayList<Vereador> vereadores = new ArrayList<>();
        ArrayList<Prefeito> prefeitos = new ArrayList<>();
        
        String nomeL, partidoL, estadoL, municipioL;
        
        System.out.println("--- ENTRADA DE DADOS DE PREFEITOS ---");
        for(int i = 0; i < 3; i++){
            System.out.println("Informe o nome: ");
            nomeL = teclado.nextLine();
            System.out.println("Informe o partido: ");
            partidoL = teclado.nextLine();
            System.out.println("Informe o estado: ");
            estadoL = teclado.nextLine();
            System.out.println("Informe o municipio: ");
            municipioL = teclado.nextLine();
            prefeitos.add(new Prefeito(municipioL, nomeL, partidoL, estadoL));
        }
        
       
        
        System.out.println("--- ENTRADA DE DADOS DE VEREADORES ---");
        
         for(int i = 0; i < 3; i++){
            System.out.println("Informe o nome: ");
            nomeL = teclado.nextLine();
            System.out.println("Informe o partido: ");
            partidoL = teclado.nextLine();
            System.out.println("Informe o estado: ");
            estadoL = teclado.nextLine();
            System.out.println("Informe o municipio: ");
            municipioL = teclado.nextLine();
            prefeitos.add(new Prefeito(municipioL, nomeL, partidoL, estadoL));
        }
         
        for(Prefeito p: prefeitos){
            p.apresentacao();
        }
         
         for(Vereador v: vereadores){
            v.apresentacao();
        }
        
    }
}
