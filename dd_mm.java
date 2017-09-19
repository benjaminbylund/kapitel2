import javax.swing.*;
/*  Datum enligt modellen dd/mm
	Benjamin Bylund
	2017-09-18
*/	
public class dd_mm{
	public static void main(String[] args) {
		String a, b, c; 

		a = " Erik Andersson 860314-2714 ";

		a = a.trim();
		int i = a.lastIndexOf(' ') + 1;
		int j = a.indexOf('-');
		b = a.substring(19, 21); //860314
		c = a.substring(17, 19);
		  
		JOptionPane.showMessageDialog(null,b + "/" + c);
	}
}


