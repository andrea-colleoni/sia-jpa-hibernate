package jdbc;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;

public class EsempioLetturaRecordCorrelati {

	public static void main(String[] args) {
		EntityManager em = JPAUtil.getInstance().getEm();
		
		Persona p = em.find(Persona.class, "TSTCSC2");
		
		for(Indirizzo i: p.getIndirizzi())
			System.out.println(i.getCitta());
		
		em.getTransaction().begin();
		Scuola s = new Scuola();
		s.setNome("Primaria");
		
		em.persist(s);
		System.out.println(s.getId());
		
		Materia m = new Materia();
		m.setNome("IT");
		
		em.persist(m);
		
		Automobile a = new Automobile();
		a.setTarga("4567E");
		a.setTelaio("098763");
		a.setNome("Peugeot");
		
		em.persist(a);
		
		Citta ct = new Citta();
		
		ct.setChiaveCitta("Parigi", "Texas");
		ct.setAbitanti(2345678);
		
		em.persist(ct);
		em.getTransaction().commit();
		
		em.createQuery("select fgc from FlussoGiornaleCassa fgc where dataOra >= :dataMin AND dataOra <= :dataMax");
		
		
		List<FlussoGC> flussi = em.createNativeQuery("SELECT i.TIPO_FLUSSO, i.CODICE_FLUSSO codFLusso, i.DATAORA dataIn, o.DATAORA dataOut, i.NOME nomeIn, o.NOME nomeOut \r\n" + 
							"FROM flussi i INNER JOIN flussi o\r\n" + 
							"ON (i.DIREZIONE = 'I' AND o.DIREZIONE = 'O' AND i.CODICE_FLUSSO=o.CODICE_FLUSSO AND i.TIPO_FLUSSO=o.TIPO_FLUSSO)", FlussoGC.class)
		.getResultList();
		
		flussi.parallelStream()
			.filter(f -> f.getDataIn().getTime() > new Date().getTime())
			.forEach(f -> {
				System.out.println(f.getDataIn());
			});
	}

}
