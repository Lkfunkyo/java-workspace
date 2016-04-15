import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class labelExample extends JFrame {
	private JLabel item1;
	
	public labelExample(){
		super("Title Bar");
		
		setLayout(new FlowLayout());
		
		item1 = new JLabel("JLabel output");
		item1.setToolTipText("Tool tip text");
		
		add(item1);
	}
}
