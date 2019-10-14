import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

 public class DataView extends Frame{
	Panel P1 = new Panel();
	TextField RegNoScreen;
	TextField NameScreen;
	TextField MarksScreen;
	Label Blank1 = new Label("");
	Label Blank2 = new Label("");
	Label Blank3 = new Label("");
	Label Blank4 = new Label("");
	Label Blank5 = new Label("");
	Label Blank6 = new Label("");
	Label Blank7 = new Label("");
	Label Blank8 = new Label("");
	Label RegNo = new Label("RegNo");
	Label Name = new Label("Name");
	Label Marks = new Label("Marks");
	RegNoScreen = new TextField(20);
	NameScreen = new TextField(20);
	MarksScreen = new TextField(20);
	Button Next = new Button("Next");
	Button Back = new Button("Back");
	P1.setLayout(G1);
	
	P1.add(Blank1);
	P1.add(RegNo);
	P1.add(RegNoScreen);
	P1.add(Blank2);
	P1.add(Blank3);
	P1.add(Name);
	P1.add(NameScreen);
	P1.add(Blank4);
	P1.add(Blank5);
	P1.add(Marks);
	P1.add(MarksScreen);
	P1.add(Blank6);
	P1.add(Back);
	P1.add(Blank7);
	P1.add(Blank8);
	P1.add(Next);
	
	Record = DBConnection.S.executeQuery("Select * from school;");
	NextHandler NHandler = new NextHandler;
	//BackHandler BHandler = new BackHandler;
	
	Next.addListener(NHandler);
	Back.addListener(BHandler);
	
	showResult();
	F.add(P1,BorderLayout.CENTER);
	F.setSize(400,300);
	F.setVisible(true);

	public void showResult() {
		if(Record.next()) {
			RegNoScreen.setText(Integer.toString(Record.getInt(1)));
			NameScreen.setText(Integer.toString(Name.getString(2)));
			MarksScreen.setText(Integer.toString(Marks.getInt(3)));
		}
	}
}
