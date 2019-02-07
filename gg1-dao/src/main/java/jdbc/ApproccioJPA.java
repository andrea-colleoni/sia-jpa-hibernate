package jdbc;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ApproccioJPA {
	
	// @Transactional => JTA
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("gg1-dao");
		EntityManager em = emf.createEntityManager();
		
		Persona p = em.find(Persona.class, "CLLNDR");
		System.out.println(p.getNome());
		em.close();
	}
}
