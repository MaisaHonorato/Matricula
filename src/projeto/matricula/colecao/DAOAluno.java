/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.matricula.colecao;

/**
 *
 * @author Maisa Honorato
 */

import java.util.List;
import org.hibernate.Session;
import projeto.matricula.modelo.Aluno;
import projeto.matricula.modelo.Pessoa;
import projeto.matricula.modelo.Perfil;


public class DAOAluno {
	
	public static void conferirPerfil(Perfil pe) {
		for(Perfil p : listarPerfis()) {
			if(pe.getNivel()==2||pe.getNivel()==3) {
				System.err.println("Somente Secretaria pode Salvar");
				return;
			}
		}
		salvarAluno( al );
	}
   
			public static void salvarAluno(Aluno al) {
				
			
			for(Aluno a : listarAlunos()) {
				if( al.getNome().equals( a.getNome() ) ) {
					System.err.println("Aluno ja cadastrado");
					return;
				}
			}
			
			inserirAluno( al );	
		}
		
		private static void inserirAluno(Aluno al) {
			
			Session sessao = ConexaoBD.getSessionFactory().openSession();
			sessao.beginTransaction();
			sessao.save( al );
			sessao.getTransaction().commit();
			sessao.close();
		}
    
    public static void updateAluno(Aluno a){
        Session s = ConexaoBD.getSessionFactory().openSession();
        s.beginTransaction();
        s.update(a);
        s.getTransaction().commit();
        s.close();
    }
    
    public static List<Aluno> listarAlunos(){
        Session s = ConexaoBD.getSessionFactory().openSession();
        s.beginTransaction();
        List<Aluno> lista = s.createQuery("FROM Aluno").list();
        s.getTransaction().commit();
        s.close();
        return lista;
    }
    
    public static Aluno localizarAlunosId(int id){
        Session s = ConexaoBD.getSessionFactory().openSession();
        s.beginTransaction();
        Aluno lista = (Aluno) s.createQuery("FROM Aluno WHERE id = " + id).uniqueResult();
        s.getTransaction().commit();
        s.close();
        return lista;
    }
    
    public static Aluno localizarAlunosNome(String nome){
        Session s = ConexaoBD.getSessionFactory().openSession();
        s.beginTransaction();
        Aluno lista = (Aluno) s.createQuery("FROM Aluno as p WHERE p.nome="+nome).uniqueResult();
        s.getTransaction().commit();
        s.close();
        return lista;
    }
    
    
    
     
}