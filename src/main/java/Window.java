import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

public class Window {
	public static void main(String[] args){
		Frame F = new Frame("Table");
		//Frame F1 = new Frame("Table");
		Panel P1 = new Panel();
		//Panel P2 = new Panel();
		TextField RegNoScreen;
		TextField NameScreen;
		TextField MarksScreen;
		Label RegNo = new Label("RegNo");
		Label Name = new Label("Name");
		Label Marks = new Label("Marks");
		//Label Blank = new Label("");
		Label Error = new Label("");
		RegNoScreen = new TextField(20);
		NameScreen = new TextField(20);
		MarksScreen = new TextField(20);
		Button Save = new Button("Save");
		Button Remove = new Button("Remove");
		GridLayout G1 = new GridLayout(5,2);
		P1.setLayout(G1);
		
		P1.add(RegNo);
		P1.add(RegNoScreen);
		P1.add(Name);
		P1.add(NameScreen);
		P1.add(Marks);
		P1.add(MarksScreen);
		P1.add(Remove);
		P1.add(Save);
		P1.add(Error);
		
		F.add(P1,BorderLayout.CENTER);
		F.setSize(400,300);
		F.setVisible(true);
		
		DataHandler DataHandler = new DataHandler(RegNoScreen,NameScreen,MarksScreen,Error);
		RemoveHandler RemoveHandler = new RemoveHandler(RegNoScreen,NameScreen,MarksScreen);
		
		Save.addActionListener(DataHandler);
		Remove.addActionListener(RemoveHandler);
		
	}
}
