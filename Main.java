
package com.mycompany.aula03exerblue01;


public class Main {
    public static void main(String[] args) {
        Data data01 = new Data(1, 9, 2026);
        
        data01.printFormato01();
        data01.printFormato02();
        data01.printFormato03();
        
        Data data02 = new Data("Setembro", 1, 2026);
        data02.printFormato01();
        data02.printFormato02();
        data02.printFormato03();
        
        Data data03 = new Data(244, 2026);
        data03.printFormato01();
        data03.printFormato02();
        data03.printFormato03();
    }
}
