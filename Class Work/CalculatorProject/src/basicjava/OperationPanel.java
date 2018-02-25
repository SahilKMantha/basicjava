package basicjava;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class OperationPanel extends JPanel {

	OperationPanel() {
		String a = "";
		String f = "*";
		String c = "/";
		String num = "+";
		JButton b = new JButton();
		b.setSize(100, 100);
		b.setText(num);
		super.add(b);
		JButton b1 = new JButton();
		b.setSize(100, 100);
		b.setText(a);
		super.add(b);
		JButton b2 = new JButton();
		b.setSize(100, 100);
		b.setText(f);
		super.add(b);
		JButton b3 = new JButton();
		b.setSize(100, 100);
		b.setText(c);
		super.add(b);
		GridLayout l = new GridLayout(4,1);
		b.setLayout(l);
	}

}
