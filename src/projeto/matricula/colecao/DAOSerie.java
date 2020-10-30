package projeto.matricula.colecao;

import java.util.List;
import projeto.matricula.modelo.Serie.*;
import org.hibernate.Session;


public class DAOSerie {
	
	    
		public static void salvarSerie(Serie al) {
		
		for(Serie a : listarSeries()) {
			if( al.get().equals( a.get() ) ) {
				System.err.println("Aluno ja cadastrado");
				return;
			}
		}
		
		inserirAluno( al );	
	}
    
    public void inserirSerie(Serie a){
        Session s = ConexaoBD.getSessionFactory().openSession();
        s.beginTransaction();
        s.save(a);
        s.getTransaction().commit();
        s.close();
    }
    
    public void updateSerie(Serie a){
        Session s = ConexaoBD.getSessionFactory().openSession();
        s.beginTransaction();
        s.update(a);
        s.getTransaction().commit();
        s.close();
    }
    
    public List<Serie> listarSeries(){
        Session s =ConexaoBD.getSessionFactory().openSession();
        s.beginTransaction();
        List<Serie> lista = s.createQuery("FROM Serie").list();
        s.getTransaction().commit();
        s.close();
        return lista;
    }
    
    public Serie localizarSeriesId(int id){
        Session s = ConexaoBD.getSessionFactory().openSession();
        s.beginTransaction();
        Serie lista = (Serie) s.createQuery("FROM Serie WHERE id = " + id).uniqueResult();
        s.getTransaction().commit();
        s.close();
        return lista;
    }
    
    public Serie localizarSeriesNome(String nome){
        Session s = ConexaoBD.getSessionFactory().openSession();
        s.beginTransaction();
        Serie lista = (Serie) s.createQuery("FROM Serie as p WHERE p.nome="+nome).uniqueResult();
        s.getTransaction().commit();
        s.close();
        return lista;
    }

}
