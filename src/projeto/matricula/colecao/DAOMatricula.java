package projeto.matricula.colecao;

import java.util.List;
import projeto.barbearia.modelo.Matricula;
import org.hibernate.Session;

public class DAOMatricula {
    
		public static void salvarMaricula(Matricula mat) {
		
		for(Matricula m : listarMaticulas()) {
			if( mat.getNome().equals( m.getNome() ) ) {
				System.err.println("Matricula ja cadastrada");
				return;
			}
		}
		
		inserirAluno( mat );	
	}
	
	private static void inserirMatricula(Matricula mat) {
		
		Session sessao = ConexaoBD.getSessionFactory().openSession();
		sessao.beginTransaction();
		sessao.save( mat );
		sessao.getTransaction().commit();
		sessao.close();
	}
    
    public static void updateMatricula(Matricula a){
        Session s = ConexaoBD.getSessionFactory().openSession();
        s.beginTransaction();
        s.update(a);
        s.getTransaction().commit();
        s.close();
    }
    
    public static List<Matricula> listarMatriculas(){
        Session s = ConexaoBD.getSessionFactory().openSession();
        s.beginTransaction();
        List<Matricula> lista = s.createQuery("FROM Matricula").list();
        s.getTransaction().commit();
        s.close();
        return lista;
    }
    
    public static Matricula localizarMatriculasId(int id){
        Session s = ConexaoBD.getSessionFactory().openSession();
        s.beginTransaction();
        Matricula lista = (Matricula) s.createQuery("FROM Matricula WHERE id = " + id).uniqueResult();
        s.getTransaction().commit();
        s.close();
        return lista;
    }
    
    public static Matricula localizarMatriculasNome(String nome){
        Session s = ConexaoBD.getSessionFactory().openSession();
        s.beginTransaction();
        Matricula lista = (Matricula) s.createQuery("FROM Matricula as p WHERE p.nome="+nome).uniqueResult();
        s.getTransaction().commit();
        s.close();
        return lista;
    }
    
    public static List<Matricula> filtrarMatriculaPorId(int i){ // v = 10
		Session sessao = ConexaoBD.getSessionFactory().openSession();
		sessao.beginTransaction();
		List<Servico> lista = sessao.createQuery("FROM Matricula WHERE valor >= " + i).list();
		sessao.getTransaction().commit();
		sessao.close();
		return lista;
	}
	
	public static List<Matricula> filtrarMatriculaPorNome(String str){ // v = 10
		Session sessao = ConexaoBD.getSessionFactory().openSession();
		sessao.beginTransaction();
		List<Servico> lista = sessao.createQuery("FROM Matricula WHERE nome like '%"+str+"%'").list();
		sessao.getTransaction().commit();
		sessao.close();
		return lista;
	}

}
