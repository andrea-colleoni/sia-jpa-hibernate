package jdbc;

import javax.persistence.EntityManager;

public class EsempiCascade {

	public static void main(String[] args) {
		EntityManager em = JPAUtil.getInstance().getEm();
		
		em.getTransaction().begin();
		
		Persona p = new Persona();
		p.setNome("Test");
		p.setCodiceFiscale("TSTCSC5");
		p.setCognome("Cascade");
		
		Indirizzo i = new Indirizzo();
		i.setVia("Gonin");
		i.setCitta("Milano");
		
		Corso c = new Corso();
		c.setCodiceCorso("HIB");
		c.setDescrizione("Hibernate JPA");
		
		p.addIscrizione(c);
		
//		Persona p2 = new Persona();
//		i.setPersona(p2);
		
		p.addIndirizzo(i);
		
		em.persist(p);
		em.getTransaction().commit();
	}

}
