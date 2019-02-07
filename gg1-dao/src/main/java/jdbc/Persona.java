package jdbc;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

@Entity
//@Table(name = "persone")
@NamedQueries(value = { 
		@NamedQuery(name = "persona.all", query = "select p from Persona p"),
		@NamedQuery(name = "persona.searchByName", query = "select p from Persona p where p.nome = :name ")
})
public class Persona {

	@Id
	//@Column(name = "codfisc")
	private String codiceFiscale;
	@Column(nullable = false)
	private String nome;
	// @Lob @Basic(fetch=FetchType.LAZY)
	private String cognome;
	
	@OneToMany(mappedBy="persona")
	private List<Indirizzo> indirizzi;

	public String getCodiceFiscale() {
		return codiceFiscale;
	}

	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public List<Indirizzo> getIndirizzi() {
		return indirizzi;
	}

	public void setIndirizzi(List<Indirizzo> indirizzi) {
		this.indirizzi = indirizzi;
	}

}
