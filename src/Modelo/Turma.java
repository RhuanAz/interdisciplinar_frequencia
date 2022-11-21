
package Modelo;


public class Turma {
    
    //Atributos
        private String nomeTurma;
        private int numeroSala;
        private String codTurma;
        
    //Construtor

    public Turma(String nomeTurma, int numeroSala, String codTurma) {
        this.nomeTurma = nomeTurma;
        this.numeroSala = numeroSala;
        this.codTurma = codTurma;
    }
        
    //Getter and Setter

    public String getNomeTurma() {
        return nomeTurma;
    }

    public void setNomeTurma(String nomeTurma) {
        this.nomeTurma = nomeTurma;
    }

    public int getNumeroSala() {
        return numeroSala;
    }

    public void setNumeroSala(int numeroSala) {
        this.numeroSala = numeroSala;
    }

    public String getCodTurma() {
        return codTurma;
    }

    public void setCodTurma(String codTurma) {
        this.codTurma = codTurma;
    }
        
    
    
    
    
}
