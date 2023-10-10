import java.awt.*;
import javax.swing.*;

public class Frame extends JFrame{

	Panel panel;
	
	Frame(){
		panel = new Panel();
		panel.setBackground(new Color(255, 255, 255));
		getContentPane().add(panel);
		this.setTitle("Pong Game");
		this.setResizable(false);
		this.setBackground(Color.black);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	}
}