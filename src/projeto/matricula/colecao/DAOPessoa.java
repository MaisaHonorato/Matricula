package projeto.matricula.colecao;

import java.util.List;

import projeto.matricula.modelo.Pessoa;

import org.hibernate.Session;


public class DAOPessoa {

	public static void salvarPessoa(Pessoa pe) {
		
		for(Pessoa p : listarPessoas()) {
			if( pe.getNome().equals( p.getNome() ) ) {
				System.err.println("Pessoa ja cadastrado");
				return;
			}
		}
		
		inserirPessoa( pe );	
	}
	
	private static void inserirPessoa(Pessoa p) {
		
		Session sessao = ConexaoBD.getSessionFactory().openSession();
		sessao.beginTransaction();
		sessao.save( p );
		sessao.getTransaction().commit();
		sessao.close();
	}

    public static void updatePessoa(Pessoa p) {
        Session s = ConexaoBD.getSessionFactory().openSession();
        s.beginTransaction();
        s.update(a);
        s.getTransaction().commit();
        s.close();
    }

    public static List<Pessoa> listarPessoas() {
        Session s = ConexaoBD.getSessionFactory().openSession();
        s.beginTransaction();
        List<Pessoa> lista = s.createQuery("FROM Pessoa").list();
        s.getTransaction().commit();
        s.close();
        return lista;
    }

    public static Pessoa localizarPessoasId(int id) {
        Session s = ConexaoBD.getSessionFactory().openSession();
        s.beginTransaction();
        Pessoa lista = (Pessoa) s.createQuery("FROM Pessoa WHERE id = " + id).uniqueResult();
        s.getTransaction().commit();
        s.close();
        return lista;
    }

    public static Pessoa localizarPessoasNome(String nome) {
        Session s = ConexaoBD.getSessionFactory().openSession();
        s.beginTransaction();
        Pessoa lista = (Pessoa) s.createQuery("FROM Pessoa as p WHERE p.nome=" + nome).uniqueResult();
        s.getTransaction().commit();
        s.close();
        return lista;
    }
    
    public static List<Pessoa> filtrarPessoaPorId(int i){ // v = 10
		Session sessao = ConexaoBD.getSessionFactory().openSession();
		sessao.beginTransaction();
		List<Servico> lista = sessao.createQuery("FROM Pessoa WHERE valor >= " + i).list();
		sessao.getTransaction().commit();
		sessao.close();
		return lista;
	}
	
	public static List<Pessoa> filtrarPessoaPorNome(String str){ // v = 10
		Session sessao = ConexaoBD.getSessionFactory().openSession();
		sessao.beginTransaction();
		List<Servico> lista = sessao.createQuery("FROM Pessoa WHERE nome like '%"+str+"%'").list();
		sessao.getTransaction().commit();
		sessao.close();
		return lista;
	}

    public static void DeletarPessoa(Pessoa p) {
        Session s = ConexaoBD.getSessionFactory().openSession();
        s.beginTransaction();
        s.createQuery("DELETE FROM pessoa WHERE pessoa_id="+ p);
        s.getTransaction().commit();
        s.close();
        return HibernateUtil.getSessionFactory().containsFetchProfileDefinition(String.valueOf(p));
    }

}
