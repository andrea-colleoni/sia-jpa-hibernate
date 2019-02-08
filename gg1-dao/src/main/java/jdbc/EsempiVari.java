package jdbc;

import java.util.List;

import javax.persistence.EntityManager;

public class EsempiVari {

	public static void main(String[] args) {
		EntityManager em = JPAUtil.getInstance().getEm();
		
		List<EntitaRidotta2> lista = em.createQuery("select e from EntitaRidotta2 e", EntitaRidotta2.class)
				.getResultList();

		lista.parallelStream().forEach(e -> {
			System.out.println(e.getCampoZzz());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			System.out.println(e.getCampoYyy());
		});
	}

}
