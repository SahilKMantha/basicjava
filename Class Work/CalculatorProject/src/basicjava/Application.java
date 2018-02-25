package basicjava;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.*;

public class Application {

	public static void main(String[] args) {

		JFrame j = new JFrame("Calculator");
		j.setSize(1000, 1000);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Makes it so that it will close when x is pressed
		
		NumberPanel n = new NumberPanel();
		OperationPanel o = new OperationPanel();
		
	
		j.add(o);
		j.add(n);
		j.setVisible(true);
		
		GridLayout l = new GridLayout(2,1);
		j.setLayout(l);
		}
	}


