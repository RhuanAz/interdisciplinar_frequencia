package Modelo;


public class Aluno extends Usuario {
    
    //Atributos
        protected int totalFaltas;
    
    //Construtor

    public Aluno(int totalFaltas, String nome, String RA, String email, String acesso, String endereço, String telefone) {
        super(nome, RA, email, acesso, endereço, telefone);
        this.totalFaltas = totalFaltas;
    }
        
    //Getter and Setter 

    public int getTotalFaltas() {
        return totalFaltas;
    }

    public void setTotalFaltas(int totalFaltas) {
        this.totalFaltas = totalFaltas;
    }
        
    @Override
    public String toString(){
        String resultado = "";
        resultado += "RA: " + this.RA + " - " + this.nome;
        return resultado;
    }
    
    
    
    
    
}
