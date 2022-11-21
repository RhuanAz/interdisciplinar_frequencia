
package Modelo;

import java.util.Date;

public class Faltas {
    
    //Atributos
        private String aluno;
        private String observaçoes;
        private String disciplina;
        private String horarioFalta;
    
    //Construtor 

    public Faltas(String aluno, String observaçoes, String disciplina, String horarioFalta) {
        this.aluno = aluno;
        this.observaçoes = observaçoes;
        this.disciplina = disciplina;
        this.horarioFalta = horarioFalta;
    }
        
    //Getter and Setter

    public String getAluno() {
        return aluno;
    }

    public void setAluno(String aluno) {
        this.aluno = aluno;
    }

    public String getObservaçoes() {
        return observaçoes;
    }

    public void setObservaçoes(String observaçoes) {
        this.observaçoes = observaçoes;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getHorarioFalta() {
        return horarioFalta;
    }

    public void setHorarioFalta(String horarioFalta) {
        this.horarioFalta = horarioFalta;
    }
        
    
}
