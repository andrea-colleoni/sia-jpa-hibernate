package jdbc;

import javax.persistence.Entity;

@Entity
public class Gatto extends Animale {
	
	private String pelo;

	public String getPelo() {
		return pelo;
	}

	public void setPelo(String pelo) {
		this.pelo = pelo;
	}

}
