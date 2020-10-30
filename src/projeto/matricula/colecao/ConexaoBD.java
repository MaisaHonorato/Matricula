package projeto.matricula.colecao;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ConexaoBD {

	private static SessionFactory sessionFactory;
	static {
		sessionFactory = new Configuration().configure().buildSessionFactory();
	}
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}
