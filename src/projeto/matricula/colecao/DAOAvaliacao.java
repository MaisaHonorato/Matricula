package projeto.matricula.colecao;

import java.util.List;
import projeto.matricula.colecao.*;
import org.hibernate.Session;


public class DAOAvaliacao {
    
	public static void salvarAvaliacao(Avaliacao av) {
	
	for(Avaliacao a : listarAvaliacaos()) {
		if( av.getNome().equals( a.getNome() ) ) {
			System.err.println("Avaliacao ja cadastrado");
			return;
		}
	}
	
	inserirAvaliacao( av );	
	}

	private static void inserirAvaliacao(Avaliacao av) {
	Session sessao = ConexaoBD.getSessionFactory().openSession();
	sessao.beginTransaction();
	sessao.save( av );
	sessao.getTransaction().commit();
	sessao.close();
	}
	
	public static void updateAvaliacao(Avaliacao a){
	Session s = ConexaoBD.getSessionFactory().openSession();
	s.beginTransaction();
	s.update(a);
	s.getTransaction().commit();
	s.close();
	}
	
	public static List<Avaliacao> listarAvaliacaos(){
	Session s = ConexaoBD.getSessionFactory().openSession();
	s.beginTransaction();
	List<Avaliacao> lista = s.createQuery("FROM Avaliacao").list();
	s.getTransaction().commit();
	s.close();
	return lista;
	}
	
	public static Avaliacao localizarAvaliacaosId(int id){
	Session s = ConexaoBD.getSessionFactory().openSession();
	s.beginTransaction();
	Avaliacao lista = (Avaliacao) s.createQuery("FROM Avaliacao WHERE id = " + id).uniqueResult();
	s.getTransaction().commit();
	s.close();
	return lista;
	}
	
	public static Avaliacao localizarAvaliacaosNome(String nome){
	Session s = ConexaoBD.getSessionFactory().openSession();
	s.beginTransaction();
	Avaliacao lista = (Avaliacao) s.createQuery("FROM Avaliacao as p WHERE p.nome="+nome).uniqueResult();
	s.getTransaction().commit();
	s.close();
	return lista;
	}

}
