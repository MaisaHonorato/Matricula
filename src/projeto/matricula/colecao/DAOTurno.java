package projeto.matricula.colecao;


import java.util.List;
import projeto.matricula.modelo.Turno;
import org.hibernate.Session;


public class DAOTurno {
    
    public void inserirTurno(Turno a){
        Session s = ConexaoBD.getSessionFactory().openSession();
        s.beginTransaction();
        s.save(a);
        s.getTransaction().commit();
        s.close();
    }
    
    public void updateTurno(Turno a){
        Session s = ConexaoBD.getSessionFactory().openSession();
        s.beginTransaction();
        s.update(a);
        s.getTransaction().commit();
        s.close();
    }
    
    public List<Turno> listarTurnos(){
        Session s = ConexaoBD.getSessionFactory().openSession();
        s.beginTransaction();
        List<Turno> lista = s.createQuery("FROM Turno").list();
        s.getTransaction().commit();
        s.close();
        return lista;
    }
    
    public Turno localizarTurnosId(int id){
        Session s = ConexaoBD.getSessionFactory().openSession();
        s.beginTransaction();
        Turno lista = (Turno) s.createQuery("FROM Turno WHERE id = " + id).uniqueResult();
        s.getTransaction().commit();
        s.close();
        return lista;
    }
    
    public Turno localizarTurnosNome(String nome){
        Session s = ConexaoBD.getSessionFactory().openSession();
        s.beginTransaction();
        Turno lista = (Turno) s.createQuery("FROM Turno as p WHERE p.nome="+nome).uniqueResult();
        s.getTransaction().commit();
        s.close();
        return lista;
    }

}
