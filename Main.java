/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.teste04;

/**
 *
 * @author unifglourenco
 */
public class Main {
    public static void main(String[] args) {
        Professor prof = new Professor("Gabriela", "CC");
        Disciplina disc = new Disciplina("OO", "CC310", prof);
        Aluno aluno01 = new Aluno("Vinicius", "222", "CC", disc);
        
        System.out.println(aluno01.toString());
        
        System.out.println(aluno01.getNome());
        
        System.out.println(aluno01.getDisciplina().getCodigo());
        System.out.println(aluno01.getDisciplina().getProfessor().getNome());
    }
}
