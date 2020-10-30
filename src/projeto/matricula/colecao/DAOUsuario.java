package projeto.matricula.colecao;


import java.util.List;
import projeto.matricula.modelo.Usuario;
import org.hibernate.Session;


public class DAOUsuario {
    
   public void inserirUsuario(Usuario a){
        Session s = ConexaoBD.getSessionFactory().openSession();
        s.beginTransaction();
        s.save(a);
        s.getTransaction().commit();
        s.close();
    }
    
    public void updateUsuario(Usuario a){
        Session s = ConexaoBD.getSessionFactory().openSession();
        s.beginTransaction();
        s.update(a);
        s.getTransaction().commit();
        s.close();
    }
    
    public List<Usuario> listarUsuarios(){
        Session s = ConexaoBD.getSessionFactory().openSession();
        s.beginTransaction();
        List<Usuario> lista = s.createQuery("FROM Usuario").list();
        s.getTransaction().commit();
        s.close();
        return lista;
    }
    
    public Usuario localizarUsuariosId(int id){
        Session s = ConexaoBD.getSessionFactory().openSession();
        s.beginTransaction();
        Usuario lista = (Usuario) s.createQuery("FROM Usuario WHERE id = " + id).uniqueResult();
        s.getTransaction().commit();
        s.close();
        return lista;
    }
    
    public Usuario localizarUsuariosNome(String nome){
        Session s = ConexaoBD.getSessionFactory().openSession();
        s.beginTransaction();
        Usuario lista = (Usuario) s.createQuery("FROM Usuario as p WHERE p.nome="+nome).uniqueResult();
        s.getTransaction().commit();
        s.close();
        return lista;
    }

}
