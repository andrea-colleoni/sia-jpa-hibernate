package jdbc;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class ChiaveCitta implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String nomeCitta;
	private String paese;
	

	public ChiaveCitta() {
		super();
	}
	
	public String getNomeCitta() {
		return nomeCitta;
	}
	public void setNomeCitta(String nome) {
		this.nomeCitta = nome;
	}
	public String getPaese() {
		return paese;
	}
	public void setPaese(String paese) {
		this.paese = paese;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nomeCitta == null) ? 0 : nomeCitta.hashCode());
		result = prime * result + ((paese == null) ? 0 : paese.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ChiaveCitta other = (ChiaveCitta) obj;
		if (nomeCitta == null) {
			if (other.nomeCitta != null)
				return false;
		} else if (!nomeCitta.equals(other.nomeCitta))
			return false;
		if (paese == null) {
			if (other.paese != null)
				return false;
		} else if (!paese.equals(other.paese))
			return false;
		return true;
	}
	
	

}
