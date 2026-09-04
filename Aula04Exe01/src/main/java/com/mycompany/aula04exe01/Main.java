package com.mycompany.aula04exe01;

public class Main {
    public static void main(String[] args) {
        Laser l[] = new Laser[10];
        
        for(int i = 0; i<10; i++){
            l[i] = new Laser("XingLing", i+1, i*10, 50/(i+1));//so pra variar os valores dos objetos
        }
        
//        for(int i = 0; i<10; i++){
//            System.out.println("---------------[" + i + "]-------------------");
//            System.out.println("Fabricante..... " +  l[i].getFabricante());
//            System.out.println("Alcance..... " +  l[i].getAlcance());
//            System.out.println("Precisao..... " + l[i].getPrecisao());
//            System.out.println("Medida..... " + l[i].getMedida());
//        }

        for(int i = 0; i<10; i++){
            System.out.println("---------------[" + i + "]-------------------");
            
            //se imprimirmos a posicao do objeto vai imprimir o endereço de memoria
            //porem sobreescrevemos o toString e isso nao vai mais acontecer.
            System.out.println(l[i]);
        }
    }
}
