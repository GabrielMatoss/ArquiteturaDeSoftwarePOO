
package com.mycompany.aula04exec03;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> nomes1 = new ArrayList<>();
        
        nomes1.add("Gabriela");
        nomes1.add("Daniel");
        nomes1.add("Rafael");
        nomes1.add("Miguel");
        
        //ArrayList<String> nomes2 = new ArrayList<>();
        
        //passa o arraylist a ser copiado, no construtor do novo arraylist
        ArrayList<String> nomes2 = new ArrayList<>(nomes1);
        
        //nao funciona como copia
        //nomes2 = nomes1; //nao criou uma copia, criou uma referencia para a mesma sequencia, por isso exibirá a mudança
        
        
        nomes1.set(0, "Gabi");
        
        System.out.println("Nomes 1: " + nomes1);
        System.out.println("Nomes 2: " + nomes2);
    }
}
