
package Modelo;

import java.util.Date;


public class Disciplina {
    
    //Atributos
        private String nomeDisc;
        private String horario;
        private String codDisc;
        
    //Construtor

    public Disciplina(String nomeDisc, String horario, String codDisc) {
        this.nomeDisc = nomeDisc;
        this.horario = horario;
        this.codDisc = codDisc;
    }

        
    //Getter and Setter

    public String getNomeDisc() {
        return nomeDisc;
    }

    public void setNomeDisc(String nomeDisc) {
        this.nomeDisc = nomeDisc;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getCodDisc() {
        return codDisc;
    }

    public void setCodDisc(String codDisc) {
        this.codDisc = codDisc;
    }
        
    
}
