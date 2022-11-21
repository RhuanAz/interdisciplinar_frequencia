package FakeBD;

import java.util.Vector;
import Modelo.Aluno;
import Modelo.Professor;
import Modelo.Disciplina;
import Modelo.Faltas;
import Modelo.Turma;

public class FakeBD {
    
     private static Vector<Aluno> alunosSistema = new Vector<>();
     private static Vector<Professor> profsSistema = new Vector<>();
     private static Vector<Disciplina> disciplinas = new Vector<>();
     private static Vector<Turma> turmas = new Vector<>();
     private static Vector<Faltas> faltasAluno = new Vector<>();
    
     public static void iniciaBD(){
        
         //INSERTs dos Alunos
         //alunosSistema.add(new Aluno(faltas, nome, RA, email, acesso, endereço, telefone))
         alunosSistema.add(new Aluno(3, "Rhuan", "0061000", "rhuan1239@gmail.com", "1234", "Rua das Flores", "(31)99131-9183"));
         alunosSistema.add(new Aluno(2, "João Flávio", "0061001", "fafa031@gmail.com", "1234", "Rua das Andorinhas", "(31)96123-7569"));
         
         //INSERTs dos Professores
         //profsSistema.add(new Professor(area, nome, RA, email, acesso, endereço, telefone))
         profsSistema.add(new Professor("Ciências Humanas", "Letícia Bastos", "0010000", "letbastos13@gmail.com", "123", "Avenida Dutra", "(31)99381-0139"));
         profsSistema.add(new Professor("Computação", "Saulo Cabral", "0010001", "saulo05@gmail.com", "123", "Avenida Cabral", "(31)97311-0642"));
         
          //INSERTs das Disciplinas
          // disciplinas.add(new Disciplina("Matéria", "Horário", "cód"));
          disciplinas.add(new Disciplina("Geografia", "10:40", "100"));
          disciplinas.add(new Disciplina("Programação I", "07:00", "200"));
         
          //INSERTs das Turmas
          //turmas.add(new Turma(nomeTurma, numSala, codTurma)
          turmas.add(new Turma("INFO 1", 101, "001"));
          turmas.add(new Turma("INFO 2", 201, "011"));
    }

    //"Querys" SQL para o Fake BD 
    //INSERTS
    public static void insertAluno(Aluno aluno){
        alunosSistema.add(aluno);
    }
    public static void insertProfessor(Professor professor){
       profsSistema.add(professor);
    }
    public static void insertDisciplina(Disciplina disciplina){
        disciplinas.add(disciplina);
    }
    public static void insertTurma(Turma turma){
        turmas.add(turma);
    }
    public static void insertFalta(Faltas falta){
        faltasAluno.add(falta);
    }
    
    
    //SELECT
    public static Vector<Aluno> selectAllAlunos(){
        return alunosSistema;
    }
    public static Vector<Professor> selectAllProfessores(){
        return profsSistema;
    }
    public static Vector<Disciplina> selectAllDisciplinas(){
        return disciplinas;
    }
    public static Vector<Turma> selectAllTurmas(){
        return turmas;
    }
    
    
    
}
