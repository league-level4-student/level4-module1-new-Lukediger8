package _00_Intro_to_Exceptions;

import javax.swing.JOptionPane;

public class NegativeNumberException extends Exception{
	public static void scarypopup() {
		JOptionPane.showMessageDialog(null, "woah there is a virus in yo computer son im crine");
	}
}
