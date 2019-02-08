package jdbc;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.Lob;
import javax.persistence.OneToOne;

//@Entity
public class FlussoModo1 {
	
	@Id
	private String nomeFlusso;
	
	private String tipoFlusso;
	@Lob @Basic(fetch=FetchType.LAZY)
	private byte[] contenuto;
	
	private String codiceFlusso;
	
	private Date dataOra;
	
	@Column(length=1)
	private String direzione;
	
	//@OneToOne(mappedBy="flussoCorrispondente")
	@JoinColumns({
		@JoinColumn(name="codiceFlusso", referencedColumnName="codiceFlusso"),
		@JoinColumn(name="tipoFlusso", referencedColumnName="tipoFlusso")
	})
	private FlussoModo1 flussoIn;
	
	private FlussoModo1 flussoOut;

	public String getNomeFlusso() {
		return nomeFlusso;
	}

	public void setNomeFlusso(String nomeFlusso) {
		this.nomeFlusso = nomeFlusso;
	}

	public String getTipoFlusso() {
		return tipoFlusso;
	}

	public void setTipoFlusso(String tipoFlusso) {
		this.tipoFlusso = tipoFlusso;
	}

	public byte[] getContenuto() {
		return contenuto;
	}

	public void setContenuto(byte[] contenuto) {
		this.contenuto = contenuto;
	}

	public String getCodiceFlusso() {
		return codiceFlusso;
	}

	public void setCodiceFlusso(String codiceFlusso) {
		this.codiceFlusso = codiceFlusso;
	}

	public Date getDataOra() {
		return dataOra;
	}

	public void setDataOra(Date dataOra) {
		this.dataOra = dataOra;
	}

	public String getDirezione() {
		return direzione;
	}

	public void setDirezione(String direzione) {
		this.direzione = direzione;
	}

//	public Flusso getFlussoCorrispondente() {
//		return flussoCorrispondente;
//	}
//
//	public void setFlussoCorrispondente(Flusso flussoCorrispondente) {
//		this.flussoCorrispondente = flussoCorrispondente;
//	}
	

}
