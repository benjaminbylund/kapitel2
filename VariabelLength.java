import javax.swing.*;

/*	Variabel Length, klippa och klistra ramsa från programsprok
	Benjamin Bylund
	2017-09-18
*/

public class VariabelLength{
	public static void main(String[] args) {
		String a, b;
	
		a = "Programsprok";
		b = a.substring(4,8) + a.charAt(5); 

		JOptionPane.showMessageDialog(null, b); 


		
	}	
}
