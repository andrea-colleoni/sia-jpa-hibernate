package jdbc;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.TableGenerator;

@Entity
@TableGenerator(table = "CHIAVI", name = "chiavi_materia", pkColumnName = "entita", 
				pkColumnValue = "materia", initialValue = 1, valueColumnName="valore")
public class Materia {

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE, generator="chiavi_materia")
	private int id;
	
	private String nome;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}
