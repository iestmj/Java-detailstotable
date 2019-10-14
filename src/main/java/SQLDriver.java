import java.sql.*;

public class SQLDriver {
	public static void main(String[] args){
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection C = DriverManager.getConnection("jdbc:mysql://localhost/Nationwide","root","root");
		Statement S = C.createStatement();
		S.executeUpdate("insert into tdp values('Phil')");
		}
		catch(Exception e) {
			System.out.println("error");
		}
		
	}

}
