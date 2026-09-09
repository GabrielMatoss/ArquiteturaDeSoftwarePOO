
package com.mycompany.aula04exec07;

public class Matematica {
    public static int max3(int n1, int n2, int n3){
        if (n1 > n2 && n1 > n3)
            return n1;
        else if(n2 > n1 && n2 > n3)
            return n2;
        else 
            return n3;
    }
    
    public static boolean impar(boolean n1, boolean n2, boolean n3){
        return n1&&!n2&&!n3 || !n1&&!n2&&n3 || !n1&&n2&&!n3 || n1&&n2&&n3;
    }
    
    public static boolean maioria(boolean n1, boolean n2, boolean n3){
        return n1&&n2&&!n3 || !n1&&n2&&n3 || n1&&!n2&&n3 || n1&&n2&&n3;
    }
}
