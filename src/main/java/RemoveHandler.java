import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class RemoveHandler implements ActionListener {
	TextField RegNo;
	TextField Name;
	TextField Marks;
	
	public RemoveHandler(TextField R1, TextField N1, TextField M1) {
	RegNo=R1;
	Name=N1;
	Marks=M1;
	}
	
	public void actionPerformed(ActionEvent E) {
		String regno=RegNo.getText();
		String name=Name.getText();
		String marks =Marks.getText();

		
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection C = DriverManager.getConnection("jdbc:mysql://localhost/Nationwide","root","root");
		Statement S = C.createStatement();
		
		S.executeUpdate("DELETE FROM school where RegNo ="+regno+";");
		RegNo.setText("");
		Name.setText("");
		Marks.setText("");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		}
	}
	