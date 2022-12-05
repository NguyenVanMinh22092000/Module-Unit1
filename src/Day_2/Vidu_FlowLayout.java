package Day_2;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
public class Vidu_FlowLayout extends JFrame{
	public Vidu_FlowLayout() {
		this.setTitle("Phuong and Minh");
		this.setSize(600, 400);
		this.setLocationRelativeTo(null);
		
		
		GridLayout GridLayout = new GridLayout();
		this.setLayout(GridLayout);
		
		JButton jButton_1 = new JButton("1");
		JButton jButton_2 = new JButton("1");
		JButton jButton_3 = new JButton("1");
		
		this.add(jButton_1);
		this.add(jButton_2);
		this.add(jButton_3);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Vidu_FlowLayout();
	}
}
