import java.sql.*;
//import java.sql.Connection;
//import java.sql.Statement;

public class DBConnection {
	static Connection C;
	static Statement S;
	
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection C = DriverManager.getConnection("jdbc:mysql://localhost/Nationwide","root","root");
			Statement S = C.createStatement();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
}
