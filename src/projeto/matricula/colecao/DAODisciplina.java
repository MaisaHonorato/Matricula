package projeto.matricula.colecao;

import java.util.List;
import projeto.matricula.colecao.*;
import org.hibernate.Session;


public class DAODisciplina {
    
	public static void salvarDisciplina(Disciplina dis) {
	
	for(Disciplina d : listarDisciplinas()) {
		if( dis.getNome().equals( d.getNome() ) ) {
			System.err.println("Disciplina ja cadastrada");
			return;
		}
	}
	
	inserirDisciplina( dis );	
	}

	private static void inserirDisciplina(Disciplina dis) {
	Session sessao = ConexaoBD.getSessionFactory().openSession();
	sessao.beginTransaction();
	sessao.save( dis );
	sessao.getTransaction().commit();
	sessao.close();
	}
	
	public static void updateDisciplina(Disciplina d){
	Session s = ConexaoBD.getSessionFactory().openSession();
	s.beginTransaction();
	s.update(d);
	s.getTransaction().commit();
	s.close();
	}
	
	public static List<Disciplina> listarDisciplinas(){
	Session s = ConexaoBD.getSessionFactory().openSession();
	s.beginTransaction();
	List<Disciplina> lista = s.createQuery("FROM Disciplina").list();
	s.getTransaction().commit();
	s.close();
	return lista;
	}
	
	public static Disciplina localizarDisciplinasId(int id){
	Session s = ConexaoBD.getSessionFactory().openSession();
	s.beginTransaction();
	Disciplina lista = (Disciplina) s.createQuery("FROM Disciplina WHERE id = " + id).uniqueResult();
	s.getTransaction().commit();
	s.close();
	return lista;
	}
	
	public static Disciplina localizarDisciplinasNome(String nome){
	Session s = ConexaoBD.getSessionFactory().openSession();
	s.beginTransaction();
	Disciplina lista = (Disciplina) s.createQuery("FROM Disciplina as p WHERE p.nome="+nome).uniqueResult();
	s.getTransaction().commit();
	s.close();
	return lista;
	}

}