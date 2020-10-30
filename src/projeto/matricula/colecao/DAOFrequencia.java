package projeto.matricula.colecao;

import java.util.List;
import projeto.matricula.modelo.*;
import org.hibernate.Session;


public class DAOFrequencia {
    
	public static void salvarFrequencia(Frequencia av) {
	
	for(Frequencia a : listarFrequencias()) {
		if( av.getNome().equals( a.getNome() ) ) {
			System.err.println("Frequencia ja cadastrado");
			return;
		}
	}
	
	inserirFrequencia( av );	
	}

	private static void inserirFrequencia(Frequencia av) {
	Session sessao = ConexaoBD.getSessionFactory().openSession();
	sessao.beginTransaction();
	sessao.save( av );
	sessao.getTransaction().commit();
	sessao.close();
	}
	
	public static void updateFrequencia(Frequencia a){
	Session s = ConexaoBD.getSessionFactory().openSession();
	s.beginTransaction();
	s.update(a);
	s.getTransaction().commit();
	s.close();
	}
	
	public static List<Frequencia> listarFrequencias(){
	Session s = ConexaoBD.getSessionFactory().openSession();
	s.beginTransaction();
	List<Frequencia> lista = s.createQuery("FROM Frequencia").list();
	s.getTransaction().commit();
	s.close();
	return lista;
	}
	
	public static Frequencia localizarFrequenciasId(int id){
	Session s = ConexaoBD.getSessionFactory().openSession();
	s.beginTransaction();
	Frequencia lista = (Frequencia) s.createQuery("FROM Frequencia WHERE id = " + id).uniqueResult();
	s.getTransaction().commit();
	s.close();
	return lista;
	}
	
	public static Frequencia localizarFrequenciasNome(String nome){
	Session s = ConexaoBD.getSessionFactory().openSession();
	s.beginTransaction();
	Frequencia lista = (Frequencia) s.createQuery("FROM Frequencia as p WHERE p.nome="+nome).uniqueResult();
	s.getTransaction().commit();
	s.close();
	return lista;
	}

}
