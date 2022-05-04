package fsms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Connect {
	public Connection c;
	public Statement s;
	
	public Connect() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			c=DriverManager.getConnection("jdbc:mysql://localhost:3306/sms","root","amankr07");
			s=c.createStatement();
		}catch(Exception e) {
			throw new RuntimeException("invalid");
		}
	}
	

}
