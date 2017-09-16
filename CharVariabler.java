import javax.swing.*;

public class CharVariabler{	
	public static void main(String[] args) {
		String c1, c2, c3;

		c1 = "\u00D8";	
		c2 = "\u00F8";
		c2 = c1 + " " + c2;
			JOptionPane.showMessageDialog(null, c2);
	}
}