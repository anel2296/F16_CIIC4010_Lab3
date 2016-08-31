import javax.swing.JFrame;

public class Lab3Exercises {
	public static void main(String[] args) {
		JFrame AnelMartinez = new JFrame("Hello, world!");
		AnelMartinez.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		AnelMartinez.setLocation(850, 400);
		AnelMartinez.setSize(200, 200);
		AnelMartinez.setVisible(true);
        MyPanelClass myPanel = new MyPanelClass();
        AnelMartinez.getContentPane().add(myPanel);
	}
}