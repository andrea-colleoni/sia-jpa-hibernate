package jdbc;

import javax.persistence.Entity;

@Entity
public class CaneTPC extends AnimaleTPC {
	
	private String razza;

	public String getRazza() {
		return razza;
	}

	public void setRazza(String razza) {
		this.razza = razza;
	}
	
	

}
