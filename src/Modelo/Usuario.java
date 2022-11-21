
package Modelo;


public class Usuario {
    
    //Atributos
        protected String nome;
        protected String RA;
        protected String email;
        protected String acesso;
        protected String endereço;
        protected String telefone;
        
    //Construtor

    public Usuario(String nome, String RA, String email, String acesso, String endereço, String telefone) {
        this.nome = nome;
        this.RA = RA;
        this.email = email;
        this.acesso = acesso;
        this.endereço = endereço;
        this.telefone = telefone;
    }
        
        
    //Getter and Setter

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRA() {
        return RA;
    }

    public void setRA(String RA) {
        this.RA = RA;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAcesso() {
        return acesso;
    }

    public void setAcesso(String acesso) {
        this.acesso = acesso;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
        
        
    
    
    
    
    
    
}
