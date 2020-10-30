package projeto.matricula.colecao;

import java.util.List;
import projeto.matricula.colecao.*;
import org.hibernate.Session;


public class DAODiario {
    
	public static void salvarDiario(Diario di) {
	
	for(Diario d : listarDiarios()) {
		if( di.getNome().equals( d.getNome() ) ) {
			System.err.println("Diario ja cadastrado");
			return;
		}
	}
	
	inserirDiario( av );	
	}

	private static void inserirDiario(Diario di) {
	Session sessao = ConexaoBD.getSessionFactory().openSession();
	sessao.beginTransaction();
	sessao.save( di );
	sessao.getTransaction().commit();
	sessao.close();
	}
	
	public static void updateDiario(Diario d){
	Session s = ConexaoBD.getSessionFactory().openSession();
	s.beginTransaction();
	s.update(d);
	s.getTransaction().commit();
	s.close();
	}
	
	public static List<Diario> listarDiarios(){
	Session s = ConexaoBD.getSessionFactory().openSession();
	s.beginTransaction();
	List<Diario> lista = s.createQuery("FROM Diario").list();
	s.getTransaction().commit();
	s.close();
	return lista;
	}
	
	public static Diario localizarDiariosId(int id){
	Session s = ConexaoBD.getSessionFactory().openSession();
	s.beginTransaction();
	Diario lista = (Diario) s.createQuery("FROM Diario WHERE id = " + id).uniqueResult();
	s.getTransaction().commit();
	s.close();
	return lista;
	}
	
	public static Diario localizarDiariosNome(String nome){
	Session s = ConexaoBD.getSessionFactory().openSession();
	s.beginTransaction();
	Diario lista = (Diario) s.createQuery("FROM Diario as p WHERE p.nome="+nome).uniqueResult();
	s.getTransaction().commit();
	s.close();
	return lista;
	}

}