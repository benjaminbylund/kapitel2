import javax.swing.*;

public class Greetings{
	public static void main(String[] args) {
		String firstname;
		String lastname;
		String greeting;

		firstname = JOptionPane.showInputDialog("What is your first name?");
		lastname =JOptionPane.showInputDialog("What is your lastname?");
		greeting = "Hello" + " " + firstname + " " + lastname;
		JOptionPane.showMessageDialog(null, greeting);
	}
}