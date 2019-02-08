package jdbc;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Lob;

@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Flusso {
	
	@Id
	private String nomeFlusso;
	
	private String tipoFlusso;
	@Lob
	private byte[] contenuto;
	
	private String codiceFlusso;
	
	private Date dataOra;
	
	@Column(length=1)
	private String direzione;

}
