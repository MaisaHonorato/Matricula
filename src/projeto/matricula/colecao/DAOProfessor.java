package projeto.matricula.colecao;


import java.util.List;
import projeto.matricula.modelo.*;
import org.hibernate.Session;

public class DAOProfessor {
	
	public static void salvarProfessor(Professor av) {
		
		for(Professor a : listarProfessores()) {
			if( av.getNome().equals( a.getNome() ) ) {
				System.err.println("Professor ja cadastrado");
				return;
			}
		}
		
		inserirProfessor( av );	
		}
    
    public static void inserirProfessor(Professor a){
        Session s = HibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        s.save(a);
        s.getTransaction().commit();
        s.close();
    }
    
    public static void updateProfessor(Professor a){
        Session s = HibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        s.update(a);
        s.getTransaction().commit();
        s.close();
    }
    
    public static List<Professor> listarProfessors(){
        Session s = HibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        List<Professor> lista = s.createQuery("FROM Professor").list();
        s.getTransaction().commit();
        s.close();
        return lista;
    }
    
    public static Professor localizarProfessorsId(int id){
        Session s = HibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        Professor lista = (Professor) s.createQuery("FROM Professor WHERE id = " + id).uniqueResult();
        s.getTransaction().commit();
        s.close();
        return lista;
    }
    
    public static Professor localizarProfessorsNome(String nome){
        Session s = HibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        Professor lista = (Professor) s.createQuery("FROM Professor as p WHERE p.nome="+nome).uniqueResult();
        s.getTransaction().commit();
        s.close();
        return lista;
    }

}
