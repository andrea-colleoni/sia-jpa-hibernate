package jdbc;

import java.util.List;

import javax.persistence.EntityManager;

public class EsempioEreditarieta {

	public static void main(String[] args) {
		EntityManager em = JPAUtil.getInstance().getEm();
		
		em.getTransaction().begin();
		
		CaneTPC c = new CaneTPC();
		c.setNome("Fido1");
		c.setRazza("Cocker???");
		
		em.persist(c);
		
		GattoTPC g = new GattoTPC();
		g.setNome("Felix1");
		g.setPelo("liscio");
		
		em.persist(g);
		em.getTransaction().commit();
		
		List<AnimaleTPC> animali = em.createQuery("select a from AnimaleTPC a", AnimaleTPC.class)
				.getResultList();
		
		for(AnimaleTPC aa : animali) {
			if (aa instanceof CaneTPC) {
				System.out.println(((CaneTPC)aa).getRazza());
			}
			System.out.println(aa.getNome());
		}

	}

}
