package jdbc;

import javax.persistence.EntityManager;

public class EsempioLetturaRecordCorrelati {

	public static void main(String[] args) {
		EntityManager em = JPAUtil.getInstance().getEm();
		
		Persona p = em.find(Persona.class, "TSTCSC2");
		
		for(Indirizzo i: p.getIndirizzi())
			System.out.println(i.getCitta());
	}

}
