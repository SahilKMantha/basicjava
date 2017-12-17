import java.awt.*;

public class Application {

	public static void main(String[] args) {

		Frame j1 = new Frame("Sahil");
		Label l1 = new Label("hi");
		j1.setSize(1000, 1000);
		j1.setVisible(true);
		l1.setText("This is my first GUI application");
		j1.add(l1);

	}

}
