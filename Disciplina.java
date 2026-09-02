
package com.mycompany.teste04;

public class Disciplina {
    private String nome, codigo; 
    private Professor professor;

    public Disciplina(String nome, String codigo, Professor professor) {
        this.nome = nome;
        this.codigo = codigo;
        this.professor = professor;
    }

    @Override
    public String toString() {
        return "Disciplina{" + "nome=" + nome + ", codigo=" + codigo + ", professor=" + professor + '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    
    
}
