import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

public class eventScreen extends JFrame {
	private JTextField item1;
	private JTextField item2;
	private JTextField item3;
	private JPasswordField passwordField;

	public eventScreen() {
		super("Title Bar");
		setLayout(new FlowLayout());

		item1 = new JTextField(10);
		item2 = new JTextField("Enter Text Here");
		item3 = new JTextField("Uneditable", 20);
		item3.setEditable(false);
		passwordField = new JPasswordField("password");

		add(item1);
		add(item2);
		add(item3);
		add(passwordField);

		EventHandler handler = new EventHandler();
		item1.addActionListener(handler);
		item2.addActionListener(handler);

		item3.addActionListener(handler);

		passwordField.addActionListener(handler);
	}

	private class EventHandler implements ActionListener {

		public void actionPerformed(ActionEvent event) {
			String s = "";

			if (event.getSource() == item1) {
				s = String.format("Field 1: %s", event.getActionCommand());
			} else if (event.getSource() == item2) {
				s = String.format("Field 2: %s", event.getActionCommand());
			} else if (event.getSource() == item3) {
				s = String.format("Field 3: %s", event.getActionCommand());
			} else if (event.getSource() == passwordField) {
				s = String.format("Field 2: %s", event.getActionCommand());
			}
			JOptionPane.showMessageDialog(null, s);
		}
	}

}