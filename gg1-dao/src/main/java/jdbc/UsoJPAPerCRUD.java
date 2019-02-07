package jdbc;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

public class UsoJPAPerCRUD {

	public static void main(String[] args) {
	
		EntityManager em = JPAUtil.getInstance().getEm();
		String cf = "RSSMRA";
		/*
		em.getTransaction().begin();
		Persona p1 = new Persona();
		p1.setNome("Mario");
		p1.setCognome("Rossi");
		p1.setCodiceFiscale(cf);
		
		em.persist(p1); // persist aggiunge al contesto JPA questo oggetto 
		// INSERT è una conseguenza del fatto che l'oggetto è nuovo (new a riga 12), non del 
		// fatto che l'ho aggiunto a JPA!!
		em.getTransaction().commit();
		*/
		
		// AGGIORNAMENTO (UPDATE)
		em.getTransaction().begin();
		Persona p2 = em.find(Persona.class, cf);
		p2.setCognome("WW Rossi!!");
		em.getTransaction().commit();
		
		// merge (oggetto fabbricato in java che già c'era sul DB)
		Persona p4 = new Persona();
		p4.setCodiceFiscale(cf);
		p4.setNome("Nuovo nome");
		p4.setCognome("Rossi Merge");
//		Persona p5 = em.find(Persona.class, p4.getCodiceFiscale());
//		p5.setCognome(p4.getCognome());
		em.getTransaction().begin();
		em.merge(p4); // rimpiazza completamente l'oggetto nel DB con quello che c'è attualmente in p4
		em.getTransaction().commit();
		
		
		// ELIMINAZIONE (DELETE)
		/*
		em.getTransaction().begin();
		Persona p3 = em.find(Persona.class, cf);
		em.remove(p3);
		em.getTransaction().commit();
		*/
		
		// EntityManager em2 = JPAUtil.getInstance().getEm();
		Persona p6 = em.find(Persona.class, cf);
		em.detach(p6);
		em.getTransaction().begin();
		p6.setCognome("!!!!!!!!!!!!!!!!!!!");
		// em.persist(p6);
		em.getTransaction().commit();
		
		// estrazione di risultati multipli
		TypedQuery<Persona> q = em.createQuery("select p from Persona p", Persona.class);
		List<Persona> elenco = q.getResultList();
		for(Persona p : elenco)
			System.out.println(p.getNome());
		
		System.out.println("----");
		// uso una named query (definita in Persona.class)
		elenco = em.createNamedQuery("persona.all", Persona.class).getResultList();
		for(Persona p : elenco)
			System.out.println(p.getNome());
		
		System.out.println("----");
		// uso una named query con named parameter
		elenco = em.createNamedQuery("persona.searchByName", Persona.class)
				.setParameter("name", "A%")
				.getResultList();
		for(Persona p : elenco)
			System.out.println(p.getNome());
		
	}

}
