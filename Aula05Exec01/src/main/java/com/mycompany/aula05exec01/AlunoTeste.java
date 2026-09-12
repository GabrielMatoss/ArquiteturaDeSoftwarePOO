
package com.mycompany.aula05exec01;

import java.util.ArrayList;
import java.util.Scanner;

public class AlunoTeste {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Aluno> turma =  new ArrayList<>();
        
        String nomeLocal, sobrenomeLocal, cursoLocal;
        int idadeLocal;
        
        //obj aluno usando construtor padrao
        turma.add(new Aluno());
        
        //obj aluno usando construtor parametrizado
        System.out.println("Informe o nome: ");
        nomeLocal = teclado.nextLine();
        System.out.println("Informe o sobrenome: ");
        sobrenomeLocal = teclado.nextLine();
        
        System.out.println("Informe o curso: ");
        cursoLocal = teclado.nextLine();
        System.out.println("Informe a idade: ");
        idadeLocal = teclado.nextInt();
        
        turma.add(new Aluno(cursoLocal, nomeLocal, sobrenomeLocal, idadeLocal));
        
        for(Aluno a: turma){
            a.print();
        }
        
    }
}
