package projeto.matricula.colecao;

import java.util.List;
import projeto.matricula.modelo.Turma;
import org.hibernate.Session;


public class DAOTurma {
    
    public void inserirTurma(Turma a){
        Session s = ConexaoBD.getSessionFactory().openSession();
        s.beginTransaction();
        s.save(a);
        s.getTransaction().commit();
        s.close();
    }
    
    public void updateTurma(Turma a){
        Session s = ConexaoBD.getSessionFactory().openSession();
        s.beginTransaction();
        s.update(a);
        s.getTransaction().commit();
        s.close();
    }
    
    public List<Turma> listarTurmas(){
        Session s = ConexaoBD.getSessionFactory().openSession();
        s.beginTransaction();
        List<Turma> lista = s.createQuery("FROM Turma").list();
        s.getTransaction().commit();
        s.close();
        return lista;
    }
    
    public Turma localizarTurmaId(int id){
        Session s = ConexaoBD.getSessionFactory().openSession();
        s.beginTransaction();
        Turma lista = (Turma) s.createQuery("FROM Turma WHERE id = " + id).uniqueResult();
        s.getTransaction().commit();
        s.close();
        return lista;
    }
    
    public Turma localizarTurmaNome(String nome){
        Session s = ConexaoBD.getSessionFactory().openSession();
        s.beginTransaction();
        Turma lista = (Turma) s.createQuery("FROM Turma as p WHERE p.nome="+nome).uniqueResult();
        s.getTransaction().commit();
        s.close();
        return lista;
    }

}
