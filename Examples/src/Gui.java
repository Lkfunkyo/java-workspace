import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Gui extends JFrame {

	private JButton reg;
	private JButton custom;
	private JTextField tf;
	private JCheckBox boldbox;
	private JCheckBox italicbox;

	public Gui() {
		super("Title Bar");
		setLayout(new FlowLayout());

		ItemHandler handler = new ItemHandler();
		ActionHandler actionHandler = new ActionHandler();

		tf = new JTextField("Text field", 20);
		tf.setFont(new Font("Serif", Font.PLAIN, 14));

		boldbox = new JCheckBox("bold");
		italicbox = new JCheckBox("italic");

		boldbox.addItemListener(handler);
		italicbox.addItemListener(handler);
		tf.addActionListener(actionHandler);

		add(tf);
		add(boldbox);
		add(italicbox);
		
		 Icon world = new ImageIcon(getClass().getResource("world(1).png"));
		 Icon sun = new
		 ImageIcon(getClass().getResource("SunshineFoxSearchlight(1).png"));
		 
		 
		 reg = new JButton("Regular Button"); custom = new JButton("Custom",
		 world); custom.setRolloverIcon(sun);
		 
		  
		 add(reg); add(custom);
		 
		 reg.addActionListener(actionHandler); 
		 custom.addActionListener(actionHandler);
		 
		 
		 
	}

	private class ItemHandler implements ItemListener {
		public void itemStateChanged(ItemEvent event) {
			Font font = null;

			if (boldbox.isSelected() && italicbox.isSelected()) {
				font = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
			} else if (boldbox.isSelected()) {
				font = new Font("Serif", Font.BOLD, 14);
			} else if (italicbox.isSelected()) {
				font = new Font("Serif", Font.ITALIC, 14);
			} else {
				font = new Font("Serif", Font.PLAIN, 14);
			}

			tf.setFont(font);
		}
	}
	
	private class ActionHandler implements ActionListener{ public void
		 
		/*
		actionPerformed(ActionEvent event){
		 JOptionPane.showMessageDialog(null, String.format("%s",
		 event.getActionCommand())); } }
		 */
		
		actionPerformed(ActionEvent event){
			int confirm = JOptionPane.showConfirmDialog(null, "Do you want to exit");
			
			
			if(confirm == 0){
				
			}else if(confirm == 1){
				System.out.println(false);
			}else if(confirm == 2){
				System.out.println("Return");
			}
		}
	}

}
