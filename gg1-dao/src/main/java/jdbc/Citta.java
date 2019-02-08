package jdbc;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Citta {

	@EmbeddedId
	private ChiaveCitta chiaveCitta;
	
	private int abitanti;

	public ChiaveCitta getChiaveCitta() {
		return chiaveCitta;
	}

	public void setChiaveCitta(ChiaveCitta chiaveCitta) {
		this.chiaveCitta = chiaveCitta;
	}
	
	public void setChiaveCitta(String n, String p) {
		this.chiaveCitta = new ChiaveCitta();
		this.chiaveCitta.setNomeCitta(n);
		this.chiaveCitta.setPaese(p);
	}

	public int getAbitanti() {
		return abitanti;
	}

	public void setAbitanti(int abitanti) {
		this.abitanti = abitanti;
	}
	
	
	
	
}
