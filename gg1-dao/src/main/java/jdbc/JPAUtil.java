package jdbc;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	
	private static JPAUtil instance; // = new JPAUtil();
	
	private EntityManagerFactory emf;

	private JPAUtil() {
		emf = Persistence.createEntityManagerFactory("gg1-dao");
	}
	
	public static JPAUtil getInstance() {
		if (instance == null) // lazy initialization
			instance = new JPAUtil();
		return instance;
	}
	
	public EntityManager getEm() {
		return emf.createEntityManager();
	}

}
