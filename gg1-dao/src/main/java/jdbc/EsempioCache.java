package jdbc;

import javax.persistence.EntityManager;

public class EsempioCache {

	public static void main(String[] args) {
		while (true) {
			try {
				EntityManager em = JPAUtil.getInstance().getEm();
				em.createQuery("select a from AnimaleJ a", AnimaleJ.class)
				.setHint("org.hibernate.cacheable", true)
				.getResultList()
				.stream()
				.forEach(a -> {
					System.out.println(a.getNome());
				});
				em.close();
				System.out.println("----------");
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
