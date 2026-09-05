package com.mycompany.aula04exec02;
import java.util.ArrayList;

public class ArrayListExercicio {
    public static void main(String[] args) {
       ArrayList <String> arraylist01 = new ArrayList();
       arraylist01.add("Azul");
       arraylist01.add("Verde Carcinha");
       arraylist01.add("Verde");
       
       ArrayList <String> arraylist02 = new ArrayList();
       arraylist02.add("Roxo");
       arraylist02.add("Azul");
       arraylist02.add("Verde Carcinha");
       
//       if(arraylist01.get(0).equalsIgnoreCase(arraylist02.get(0))){
//           System.out.println(arraylist01.get(0) + "Eh igual a" + arraylist02.get(0));
//       } else {
//           System.out.println(arraylist01.get(0) + " Nao eh igual " + arraylist02.get(0));
//       };
//       
//       
//        if(arraylist01.get(1).equalsIgnoreCase(arraylist02.get(1))){
//           System.out.println(arraylist01.get(1) + "Eh igual a" + arraylist02.get(1));
//       } else {
//           System.out.println(arraylist01.get(1) + " Nao eh igual " + arraylist02.get(1));
//       };
       
//       for(int i = 0; i < 3  ; i++){
//        if(arraylist01.get(i).equalsIgnoreCase(arraylist02.get(i))){
//           System.out.println(arraylist01.get(i) + "Eh igual a" + arraylist02.get(i));
//       } else {
//           System.out.println(arraylist01.get(i) + " Nao eh igual " + arraylist02.get(i));
//       };
//           
//       }
       //jeito da professora melhor usar o equals mesmo
       //porem se tiver posicoes diferentes ele nao considera igual, entao vamos fazer uma posicao melhorada
//       for(int i = 0; i < arraylist01.size(); i++){
//           if(arraylist01.get(i).equals(arraylist02.get(i))){
//               System.out.println("Cores iguais = " + arraylist01.get(i));
//           }
//       }
        
        for(int i = 0; i < arraylist01.size(); i++){
           if(arraylist01.contains(arraylist02.get(i))){
               System.out.println("Cores iguais = " + arraylist02.get(i)); //tanto faz o arraylist que pegarmos aqui, tem que exibir a mesma quantidade
           }
       }
    }
}
