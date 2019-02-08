package jdbc;

import java.io.Serializable;

public class ChiaveAuto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2L;
	
	private String targa;
	private String telaio;
	
	public ChiaveAuto() {
		super();
	}

	public String getTarga() {
		return targa;
	}

	public void setTarga(String targa) {
		this.targa = targa;
	}

	public String getTelaio() {
		return telaio;
	}

	public void setTelaio(String telaio) {
		this.telaio = telaio;
	}

	@Override
	public String toString() {
		return "ChiaveAuto [targa=" + targa + ", telaio=" + telaio + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((targa == null) ? 0 : targa.hashCode());
		result = prime * result + ((telaio == null) ? 0 : telaio.hashCode());
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
		ChiaveAuto other = (ChiaveAuto) obj;
		if (targa == null) {
			if (other.targa != null)
				return false;
		} else if (!targa.equals(other.targa))
			return false;
		if (telaio == null) {
			if (other.telaio != null)
				return false;
		} else if (!telaio.equals(other.telaio))
			return false;
		return true;
	}
	
	
	
}
