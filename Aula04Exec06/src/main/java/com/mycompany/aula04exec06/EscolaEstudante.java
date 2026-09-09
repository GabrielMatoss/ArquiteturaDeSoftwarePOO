
package com.mycompany.aula04exec06;

import java.util.ArrayList;

public class EscolaEstudante {
    public static void main(String[] args) {
        
        ArrayList<Estudante> estudantes = new ArrayList<>();
        
//        Estudante estudante01 = new Estudante("Vinicius", "Santos");
//        Estudante estudante02 = new Estudante("Vinicius", "Sousa");
        
        
//        System.out.println(estudante01);
//        System.out.println(estudante02);
        //o proximo id acaba sendo da classe
//        System.out.println(estudante02.getProximoId());//quando é estatico sera 2 os dois sempre
//        System.out.println(estudante01.getProximoId());
        
        for(int i = 0; i < 30; i++){
            estudantes.add(new Estudante("Vinicius", "Santos"));
        }
//        
//        for(Estudante e: estudantes){
//            System.out.println(e);
//        }
//            
        //outra forma de fazer
        for(int i =0; i< 30; i++){
            System.out.println(estudantes.get(i));
            System.out.println(estudantes.get(i).getNome());
        }
    }
}
