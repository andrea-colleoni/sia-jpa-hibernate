package jdbc;

import javax.persistence.Entity;

@Entity
public class CaneJ extends AnimaleJ	 {
	
	private String razza;

	public String getRazza() {
		return razza;
	}

	public void setRazza(String razza) {
		this.razza = razza;
	}
	
	

}
