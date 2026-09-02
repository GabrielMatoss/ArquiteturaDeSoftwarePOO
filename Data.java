package com.mycompany.aula03exerblue01;

public class Data {
    private int dia, mes, ano;
    
    public Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    public Data(String mes, int dia, int ano){
        if(mes.equalsIgnoreCase("janeiro")){//strings em java sao objetos, nao podemos comparar objetos, ignora se é case sensitive
            this.mes = 1;
        } else if(mes.equalsIgnoreCase("fevereiro")){
            this.mes = 2;
        }  else if(mes.equalsIgnoreCase("março")){
            this.mes = 3;
        }  else if(mes.equalsIgnoreCase("abril")){
            this.mes = 4;
        } else if(mes.equalsIgnoreCase("maio")){
            this.mes = 5;
        } else if(mes.equalsIgnoreCase("junho")){
            this.mes = 6;
        } else if(mes.equalsIgnoreCase("julho")){
            this.mes = 7;
        } else if(mes.equalsIgnoreCase("agosto")){
            this.mes = 8;
        } else if(mes.equalsIgnoreCase("setembro")){
            this.mes = 9;
        } else if(mes.equalsIgnoreCase("outubro")){
            this.mes = 10;
        }  else if(mes.equalsIgnoreCase("novembro")){
            this.mes = 11;
        } else if(mes.equalsIgnoreCase("dezembro")){
            this.mes = 12;
        } else {
            this.mes = 1;
        }
        
        this.dia = dia;
        this.ano = ano;
    }
    
    public Data(int dias, int ano){
        this.ano = ano;
        int dia = dias%31; //janeiro
 
        if (dia <= 31) {
            this.mes = 1;
            this.dia = dia;
        } else {
            dia = dia - 31;//31
            if (dia <= 28) {
                this.mes = 2;
                this.dia = dia;
            } else {
                dia = dia -28;
                if (dia <= 31) {
                    this.mes = 3;
                    this.dia = dia;
                } else {
                    dia = dia - 31;
                    if (dia <= 30) {
                        this.mes = 4;
                        this.dia = dia;
                    } else {
                        dia = dia- 30;
                        if (dia <= 30) {
                            this.mes = 5;
                            this.dia = dia;
                        } else {
                            dia = dia % 28;
                            if (dia <= 30) {
                                this.mes = 6;
                                this.dia = dia;
                            } else {
                                dia = dia % 28;
                                if (dia <= 31) {
                                    this.mes = 7;
                                    this.dia = dia;
                                } else {
                                    dia = dia % 28;
                                    if (dia <= 31) {
                                        this.mes = 8;
                                        this.dia = dia;
                                    } else {
                                        dia = dia % 28;
                                        if (dia <= 30) {
                                            this.mes = 9;
                                            this.dia = dia;
                                        } else {
                                            dia = dia % 28;
                                            if (dia <= 31) {
                                                this.mes = 10;
                                                this.dia = dia;
                                            } else {
                                                dia = dia % 28;
                                                if (dia <= 30) {
                                                    this.mes = 11;
                                                    this.dia = dia;
                                                } else {
                                                    dia = dia % 28;
                                                    if (dia <= 31) {
                                                        this.mes = 12;
                                                        this.dia = dia;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    public void printFormato01(){
        System.out.printf("%d/%d/%d \n", dia, mes, ano);
    }
    
    public void printFormato02(){
        String mesString = "";
        if(mes == 1)
            mesString = "Janeiro";
        
        if(mes == 2)
            mesString = "Fevereiro";
        
        if(mes == 3)
            mesString = "Março";
        
        if(mes == 4)
            mesString = "Abril";
        
        if(mes == 5)
            mesString = "Maio";
        
        if(mes == 6)
            mesString = "Junho";
        
        if(mes == 6)
            mesString = "Junho";
        
        if(mes == 7)
            mesString = "Julho";
        
        if(mes == 8)
            mesString = "Agosto";
        
        if(mes == 9)
            mesString = "Setembro";
        
        if(mes == 10)
            mesString = "Outubro";
        
        if(mes == 11)
            mesString = "Novembro";
        
        if(mes == 12)
            mesString = "Dezembro";
        
        System.out.printf("%s %d, %d \n", mesString, dia, ano);
    }
    public void printFormato03(){
        int dias = 0;
        if(mes==1)
            dias=dia;
        if(mes==2)
            dias = dia + 31;
        if(mes==3)
            dias = dia + 59;
        if(mes==4)
            dias = dia + 90;
        if(mes==5)
            dias = dia + 120; //30
        if(mes==6)
            dias = dia +151; //31
        if(mes==7)
            dias = dia + 181 ;//30
        if(mes==8)
            dias = dia + 212; //31
        if(mes==9)
            dias = dia + 243; //31
        if(mes==10)
            dias = dia + 273; //30
        if(mes==11)
            dias = dia + 304; //31
        if(mes==12)
            dias = dia + 334; //30
        System.out.printf("%d %d \n", dias, ano);
    }
}

