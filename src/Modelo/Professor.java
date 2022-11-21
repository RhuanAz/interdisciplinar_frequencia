package Modelo;

public class Professor extends Usuario{

    //Atributos
       protected String area;
       
    //Construtor

    public Professor(String area, String nome, String RA, String email, String acesso, String endereço, String telefone) {
        super(nome, RA, email, acesso, endereço, telefone);
        this.area = area;
    }
       


    //Gettter and Setter
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
       



    
}
