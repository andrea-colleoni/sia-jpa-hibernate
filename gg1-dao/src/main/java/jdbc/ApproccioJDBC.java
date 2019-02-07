package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ApproccioJDBC {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("org.apache.derby.jdbc.ClientDriver");
		Connection conn = DriverManager.getConnection("jdbc:derby:corsojpa;create=true");
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery("select * from persone");
		while(rs.next()) {
			System.out.println(rs.getString("nome"));
		}
		rs.close();
		st.close();
		conn.close();
	}

}
