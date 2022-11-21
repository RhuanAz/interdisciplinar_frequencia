package frequência.interdisciplinar;

import FakeBD.FakeBD;
import Modelo.Aluno;
import Modelo.Disciplina;
import Modelo.Faltas;
import Modelo.Professor;
import Modelo.Turma;
import java.util.Scanner;
import java.util.Vector;

public class FrequênciaInterdisciplinar {

    
    
    public static void mostrarAlunos(){
        
        System.out.println("\nALUNOS CADASTRADOS");

        //bucando todos os alunos cadastrados em BANCO!!!!
        Vector<Aluno> alunosBD = FakeBD.selectAllAlunos();

        for (Aluno i : alunosBD) {
            System.out.println(i.toString());
        }
        System.out.println("");
    }
    
        public static void CadastroAluno(){
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("----- Iniciando Cadastro de Aluno -----");
        
            System.out.println("Defina o nome do aluno: ");
            String nomeAluno = entrada.nextLine();

            System.out.println("Defina o RA do aluno: ");
            String RAaluno = entrada.nextLine();

            System.out.println("Defina o e-mail do aluno: ");
            String emailAluno = entrada.nextLine();

            System.out.println("Defina a senha de acesso do aluno: ");
            String senhaAluno = entrada.nextLine();

            System.out.println("Defina o endereço do aluno: ");
            String endereçoAluno = entrada.nextLine();

            System.out.println("Defina o telefone do aluno: ");
            String telAluno = entrada.nextLine();

            int faltasAluno = 0;
        
        Aluno novoAluno = new Aluno(faltasAluno, nomeAluno, RAaluno, emailAluno, senhaAluno, endereçoAluno, telAluno);
        
        FakeBD.insertAluno(novoAluno);
        
        System.out.println("O aluno " + nomeAluno + " cadastrado com sucesso!");
        
    }
        
    public static void LançarFalta(){
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("----- Lançamento de Falta -----");
        
            System.out.println("Nome do aluno faltante: ");
            String alunoFalta = entrada.nextLine();
            
            String obsFalta = "Null";
            
            System.out.println("Disciplina: ");
            String discFalta = entrada.nextLine();
            
            System.out.println("Horario da falta: ");
            String horaFalta = entrada.nextLine();
            
        Faltas novaFalta = new Faltas(alunoFalta, obsFalta, discFalta, horaFalta);
        
        FakeBD.insertFalta(novaFalta);
   
    }    
    
    public static void ExcluirAluno(){
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("----- Iniciando exclusão de Aluno -----");
        
            System.out.println("RA do aluno a ser excluído: ");
            String RAexclusao = entrada.nextLine();
        
            for(int i = 0; i >= 0 & i <= FakeBD.selectAllAlunos().size(); i++){

                if(FakeBD.selectAllAlunos().get(i).getRA().equals(RAexclusao)){
                    
                    FakeBD.selectAllAlunos().remove(i);
                    System.out.println("Aluno removido do sistema com sucesso!");
                    
                    break;

                }

            }   
    }
    public static void ExcluirProf(){

        Scanner entrada = new Scanner(System.in);

        System.out.println("----- Iniciando exclusão de Professor -----");

        System.out.println("RA do docente a ser excluído: ");
        String RAexclusao = entrada.nextLine();

        for(int i = 0; i >= 0 & i <= FakeBD.selectAllProfessores().size(); i++){

            if(FakeBD.selectAllProfessores().get(i).getRA().equals(RAexclusao)){

                FakeBD.selectAllProfessores().remove(i);
                System.out.println("Professor removido do sistema com sucesso!");

                break;

            }
        }
              
    }
    
    public static void cadastroProf(){
        Scanner input = new Scanner(System.in); 
        System.out.println("\n--CADASTRANDO PROFESSOR: ");
        System.out.print("Nome: ");
        String nome = input.nextLine();
        System.out.print("RA: ");
        String ra = input.nextLine();
        System.out.print("Endereço: ");
        String endereco = input.nextLine();
        System.out.print("Telefone: ");
        String telefone = input.nextLine();
        System.out.print("Área de atuação: ");
        String area = input.nextLine();
        System.out.print("E-mail: ");
        String email = input.nextLine();
        System.out.print("Senha: ");
        String senha = input.nextLine();
        
        Professor novoProf = new Professor(area, nome, ra, email, senha, endereco, telefone);
        FakeBD.insertProfessor(novoProf);
        
        System.out.println("\n----------------------------------------------------");
        System.out.println("Professor " + nome + " cadastrado com SUCESSO!");
        System.out.println("----------------------------------------------------");
    }
    
     public static void cadastroDisciplina(){
        Scanner input = new Scanner(System.in); 
        System.out.println("\n--CADASTRANDO DISCIPLINA: ");
        System.out.print("Nome: ");
        String nome = input.nextLine();
        System.out.print("Código da Disciplina: ");
        String cod = input.nextLine();
        System.out.print("Horário: ");
        String horario = input.nextLine();

        
        Disciplina novaDisciplina = new Disciplina(nome, horario, cod);
        FakeBD.insertDisciplina(novaDisciplina);
        
        System.out.println("\n----------------------------------------------------");
        System.out.println("Disciplina " + nome + " cadastrado com SUCESSO!");
        System.out.println("----------------------------------------------------");
    }
     
    public static void cadastroTurma(){
        Scanner input = new Scanner(System.in); 
        System.out.println("\n--CADASTRANDO TURMA: ");
        System.out.print("Nome: ");
        String nome = input.nextLine();
        System.out.print("Código da Turma: ");
        String cod = input.nextLine();
        System.out.print("Núm. da sala: ");
        int sala = input.nextInt();

        Turma novaTurma = new Turma(nome, sala, cod);
        FakeBD.insertTurma(novaTurma);

        System.out.println("\n----------------------------------------------------");
        System.out.println("Disciplina " + nome + " cadastrado com SUCESSO!");
        System.out.println("----------------------------------------------------");
    }
    
    
    public static void main(String[] args) {
        
        FakeBD.iniciaBD();
        
        Scanner entrada = new Scanner(System.in);
        
        int opcao;
        
        System.out.println("Iniciando o sistema...\n");
        
        do{
            System.out.println("""
                               Selecione uma função:  
                               1 - Cadastro de Aluno 
                               2 - Cadastro de Docente 
                               3 - Cadastro de Turma 
                               4 - Cadastro de Disciplina 
                               5 - Lançar Faltas
                               6 - Excluir Aluno
                               7 - Excluir Professor
                               8 - Mostrar Alunos
                               9 - Sair""");

            opcao = entrada.nextInt();

            switch(opcao){
                case 1: CadastroAluno(); break;
                case 2: cadastroProf(); break;
                case 3: cadastroTurma(); break;
                case 4: cadastroDisciplina(); break;
                case 5: LançarFalta(); break;
                case 6: ExcluirAluno(); break;
                case 7: ExcluirProf(); break;
                case 8: mostrarAlunos(); break;
                case 9: System.out.println("Encerrando o sistema..."); break;

                default:
                System.out.println("Opção Inválida!");

            }  
        }while(opcao != 9);
        
 
    }
    
}
