
package com.mycompany.aula05exec03;

public class HierarquiaTeste {
    public static void main(String[] args) {
        Navio nav = new Navio(10, "Abravante");
        
        System.out.println(nav);
        
        NavioDeGuerra navGuerra = new NavioDeGuerra(150, 100, 15, "Fragata");
        
        
    }
}
