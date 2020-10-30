package projeto.matricula.colecao;


import java.util.List;
import projeto.matricula.modelo.Boletim;
import projeto.matricula.modelo.Perfil;
import org.hibernate.Session;

public class DAOBoletim {
	
	public static void salvarBoletim(Perfil pe) {
		
		for(Perfil p : listarPerfis()) {
			if( pe.getNivel(1).equals( p.getNivel(1) ) ) {
				System.err.println("Aluno ja cadastrado");
				return;
			}
		}
		
		inserirAluno( al );	
	}
    
     public static void inserirBoletim(Boletim a){
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
    
    public static List<Perfil> listarBoletins(){
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
    
    

}
