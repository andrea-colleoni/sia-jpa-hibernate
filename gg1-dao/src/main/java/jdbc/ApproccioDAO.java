package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ApproccioDAO {

	public static void main(String[] args) throws SQLException, ReflectiveOperationException {
		List<Persona> elenco = tutteLePersone();
		System.out.println(elenco.get(0).getNome());
	}
	
	public static List<Persona> tutteLePersone() throws ReflectiveOperationException, SQLException {
		List<Persona> risultato = new ArrayList<Persona>(); // aggiunto
		Class.forName("org.apache.derby.jdbc.ClientDriver");
		Connection conn = DriverManager.getConnection("jdbc:derby:corsojpa;create=true");
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery("select * from persone");
		while(rs.next()) {
			// istanzio una nuova persona per ogni record
			Persona p = new Persona();
			p.setNome(rs.getString("nome"));
			p.setCognome(rs.getString("cognome"));
			p.setCodiceFiscale(rs.getString("codfisc"));
			risultato.add(p);
		}
		rs.close();
		st.close();
		conn.close();
		return risultato;
	}

}
