import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;

public class DataHandler implements ActionListener {
	TextField RegNo;
	TextField Name;
	TextField Marks;
	Label Error;
	
	public DataHandler(TextField R1, TextField N1, TextField M1, Label E1) {
	RegNo=R1;
	Name=N1;
	Marks=M1;
	Error=E1;
	}
	
	public void actionPerformed(ActionEvent E) {
		String regno=RegNo.getText();
		String name=Name.getText();
		String marks =Marks.getText();

		
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection C = DriverManager.getConnection("jdbc:mysql://localhost/Nationwide","root","root");
		Statement S = C.createStatement();
		
		S.executeUpdate("insert into school values("+regno+",'"+name+"',"+marks+");");
		RegNo.setText("");
		Name.setText("");
		Marks.setText("");
		Error.setVisible(true);
		Error.setText("Successfull");
		}
		catch(java.sql.SQLIntegrityConstraintViolationException e) {
			Error.setText("RegNo duplicated");
			//System.out.println("Duplicated regno");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		
		}
	}
	