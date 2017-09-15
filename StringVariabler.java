import javax.swing.*;

public class StringVariabler {
	public static void main(String[] args) {
		String s1, s2, s3;

		s1 = "Benjamin";
		s2 = "Teg";
		s3 = "112";	
		s2 = s1 + "\n" + s2 + "\n" + s3;

			JOptionPane.showMessageDialog(null, s2);
	}	
}