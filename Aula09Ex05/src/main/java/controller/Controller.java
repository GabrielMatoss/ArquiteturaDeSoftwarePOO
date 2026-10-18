/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import aula01.aula09ex05.model.Div;
import aula01.aula09ex05.model.Mult;
import aula01.aula09ex05.model.OperacaoMatematica;
import aula01.aula09ex05.model.Soma;
import aula01.aula09ex05.model.Sub;
import aula01.aula09ex05.view.CalculadoraGUI;

/**
 *
 * @author gabri
 */
public class Controller {

    private CalculadoraGUI janela;
    private OperacaoMatematica calc;
    private String n1, n2;
    
    public Controller(CalculadoraGUI view) {
        this.janela = view;
    }
    
    public void um(){
        String texto = janela.getDisplay().getText();
        janela.getDisplay().setText(texto + "1");
    }
    
    public void dois(){
        String texto = janela.getDisplay().getText();
        janela.getDisplay().setText(texto + "2");
    }
    
    public void tres(){
        String texto = janela.getDisplay().getText();
        janela.getDisplay().setText(texto + "3");
    }
    
    public void quatro(){
        String texto = janela.getDisplay().getText();
        janela.getDisplay().setText(texto + "4");
    }
    
    public void cinco(){
        String texto = janela.getDisplay().getText();
        janela.getDisplay().setText(texto + "5");
    }
    
    public void seis(){
        String texto = janela.getDisplay().getText();
        janela.getDisplay().setText(texto + "6");
    }
    
    public void sete(){
        String texto = janela.getDisplay().getText();
        janela.getDisplay().setText(texto + "7");
    }
    
    public void oito(){
        String texto = janela.getDisplay().getText();
        janela.getDisplay().setText(texto + "8");
    }
    
    public void nove(){
        String texto = janela.getDisplay().getText();
        janela.getDisplay().setText(texto + "9");
    }
    
    public void zero(){
        String texto = janela.getDisplay().getText();
        janela.getDisplay().setText(texto + "0");
    }
    
    public void subtracao(){
        n1 = janela.getDisplay().getText();
        calc = new Sub();
        janela.getDisplay().setText("");
    }
    
    public void soma(){
        n1 = janela.getDisplay().getText();
        calc = new Soma();
        janela.getDisplay().setText("");
    }
    
    public void multiplicacao(){
        n1 = janela.getDisplay().getText();
        calc = new Mult();
        janela.getDisplay().setText("");
    }
    
    public void divisao(){
        n1 = janela.getDisplay().getText();
        calc = new Div();
        janela.getDisplay().setText("");
    }
    
    public void clear(){
        janela.getDisplay().setText("");
    }
    
    public void igual(){
        n2 = janela.getDisplay().getText();
        double resposta = calc.calcular(Double.parseDouble(n1), 
                Double.parseDouble(n2));
        janela.getDisplay().setText(String.valueOf(resposta));
    }
}
