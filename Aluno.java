
package com.mycompany.teste04;

public class Aluno {
   private String nome, ra, curso;
   private Disciplina disciplina; //agregação

    public Aluno(String nome, String ra, String curso, Disciplina disciplina) {
        this.nome = nome;
        this.ra = ra;
        this.curso = curso;
        this.disciplina = disciplina;
    }

    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", ra=" + ra + ", curso=" + curso + ", disciplina=" + disciplina + '}';
    }

    public String getNome() {
        return nome;
    }

    public String getRa() {
        return ra;
    }

    public String getCurso() {
        return curso;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
   
    
}
