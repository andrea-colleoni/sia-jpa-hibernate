package jdbc;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="TABELLA")
public class EntitaRidotta2 {

	
	@Id
	@Column(name="COLUMN1")
	private String campoXxx;
	@Column(name="COLUMN2")
	@Basic(fetch=FetchType.LAZY)
	// @Formula("UCASE(COLUMN4)") // SOLO HIBERNATE!!
	private String campoYyy;
	
	@Transient
	private String campoZzz;
	
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
	public String getCampoZzz() {
		switch(this.campoXxx) {
		case "aaa":
			return "OK";
		case "eee":
			return "KO";
		case "iii":
			return "~";
		case "mmm":
			return "??";
		}
		
		return campoZzz;
	}
	
	
	
}
