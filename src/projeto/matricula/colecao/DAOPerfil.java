package projeto.matricula.colecao;


import java.util.List;
import projeto.matricula.modelo.*;
import org.hibernate.Session;

public class DAOPerfil {
	
public static void salvarPessoa(Pessoa pe) {
		
		for(Pessoa p : listarPessoas()) {
			if( pe.getNome().equals( p.getNome() ) ) {
				System.err.println("Pessoa ja cadastrado");
				return;
			}
		}
		
		inserirPessoa( pe );	
	}
    
     public static void inserirPerfil(Perfil a){
        Session s = ConexaoBD.getSessionFactory().openSession();
        s.beginTransaction();
        s.save(a);
        s.getTransaction().commit();
        s.close();
    }
    
    public static void updatePerfil(Perfil a){
        Session s = ConexaoBD.getSessionFactory().openSession();
        s.beginTransaction();
        s.update(a);
        s.getTransaction().commit();
        s.close();
    }
    
    public static List<Perfil> listarPerfis(){
        Session s = ConexaoBD.getSessionFactory().openSession();
        s.beginTransaction();
        List<Perfil> lista = s.createQuery("FROM Perfil").list();
        s.getTransaction().commit();
        s.close();
        return lista;
    }
    
    public static Perfil localizarPerfisId(int id){
        Session s = ConexaoBD.getSessionFactory().openSession();
        s.beginTransaction();
        Perfil lista = (Perfil) s.createQuery("FROM Perfil WHERE id = " + id).uniqueResult();
        s.getTransaction().commit();
        s.close();
        return lista;
    }
    
    public static Perfil localizarPerfisNome(String nome){
        Session s = ConexaoBD.getSessionFactory().openSession();
        s.beginTransaction();
        Perfil lista = (Perfil) s.createQuery("FROM Perfil as p WHERE p.nome="+nome).uniqueResult();
        s.getTransaction().commit();
        s.close();
        return lista;
    }

}
