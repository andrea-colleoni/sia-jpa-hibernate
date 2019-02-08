package jdbc;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TABELLA")
public class EntitaRidotta {

	
	@Id
	@Column(name="COLUMN2")
	private String campoXxx;
	@Column(name="COLUMN3")
	private String campoYyy;
	public String getCampoXxx() {
		return campoXxx;
	}
	public void setCampoXxx(String campoXxx) {
		this.campoXxx = campoXxx;
	}
	public String getCampoYyy() {
		return campoYyy;
	}
	public void setCampoYyy(String campoYyy) {
		this.campoYyy = campoYyy;
	}
	
	
	
}
