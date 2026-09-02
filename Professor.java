/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.teste04;


public class Professor {
    private String nome, departamento;

    public Professor(String nome, String departamento) {
        this.nome = nome;
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Professor{" + "nome=" + nome + ", departamento=" + departamento + '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
}
