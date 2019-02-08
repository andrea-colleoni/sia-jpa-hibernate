package jdbc;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass(ChiaveAuto.class)
public class Automobile {

	@Id
	private String targa;
	@Id
	private String telaio;
	
	private String nome;

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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
