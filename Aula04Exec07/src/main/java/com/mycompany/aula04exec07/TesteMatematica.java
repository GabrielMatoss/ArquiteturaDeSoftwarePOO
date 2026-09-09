package com.mycompany.aula04exec07;

public class TesteMatematica {
    public static void main(String[] args) {
        //Matematica mat = new Matematica();
        int maior = Matematica.max3(3, 2, 1);
        System.out.println(maior);
        
        System.out.println(Matematica.impar(true, true, true));
        System.out.println(Matematica.impar(true, false, true));
        System.out.println(Matematica.impar(false, false, true));
        
        System.out.println(Matematica.maioria(true, true, true));
        System.out.println(Matematica.maioria(true, false, true));
        System.out.println(Matematica.maioria(false, false, true));
        System.out.println(Matematica.maioria(false, false, false));
    }
}
