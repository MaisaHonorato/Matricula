package projeto.matricula.colecao;


import java.util.List;
import projeto.matricula.modelo.*;
import org.hibernate.Session;


public class DAOFuncionario {
    
	public static void salvarFuncionario(Funcionario av) {
		
		for(Funcionario a : listarFuncionarios()) {
			if( av.getNome().equals( a.getNome() ) ) {
				System.err.println("Funcionario ja cadastrado");
				return;
			}
		}
		
		inserirFuncionario( av );	
		} 
	
	public static void inserirFuncionario(Funcionario a){
        Session s = ConexaoBD.getSessionFactory().openSession();
        s.beginTransaction();
        s.save(a);
        s.getTransaction().commit();
        s.close();
    }
    
    public static void updateFuncionario(Funcionario a){
        Session s = ConexaoBD.getSessionFactory().openSession();
        s.beginTransaction();
        s.update(a);
        s.getTransaction().commit();
        s.close();
    }
    
    public static List<Funcionario> listarFuncionarios(){
        Session s = ConexaoBD.getSessionFactory().openSession();
        s.beginTransaction();
        List<Funcionario> lista = s.createQuery("FROM Funcionario").list();
        s.getTransaction().commit();
        s.close();
        return lista;
    }
    
    public static Funcionario localizarFuncionariosId(int id){
        Session s = ConexaoBD.getSessionFactory().openSession();
        s.beginTransaction();
        Funcionario lista = (Funcionario) s.createQuery("FROM Funcionario WHERE id = " + id).uniqueResult();
        s.getTransaction().commit();
        s.close();
        return lista;
    }
    
    public static Funcionario localizarFuncionariosNome(String nome){
        Session s = ConexaoBD.getSessionFactory().openSession();
        s.beginTransaction();
        Funcionario lista = (Funcionario) s.createQuery("FROM Funcionario as p WHERE p.nome="+nome).uniqueResult();
        s.getTransaction().commit();
        s.close();
        return lista;
    }

}
