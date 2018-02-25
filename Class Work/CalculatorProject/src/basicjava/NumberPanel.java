package basicjava;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class NumberPanel extends JPanel {

	NumberPanel(){
		
	
		super.setSize(700, 700);
		setBackground(Color.red);
		
		for(int x=0;x<=9; x=x+1) { // for loop to create multiple buttons
			String num;
			num = Integer.toString(x); // converting integer x into string x 
			GridLayout g = new GridLayout(4,3); // makes a grid
			setLayout(g);
			JButton b = new JButton();
			b.setSize(100, 100);
			b.setText(num);
			b.setBackground(Color.blue);
			add(b);
			setVisible(true); 
			
			
			
		}
	}
}
	

