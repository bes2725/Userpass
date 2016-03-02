/*
PSUEDOCODE
~~~~~~~~~~
INIT constant USERNAME
INIT constant PASSWORD
PROMPT for username
GET inuser
PROMPT for password
GET inpass
IF USERNAME.equalsIgnoreCase(inuser) && PASSWORD.equals(inpass)
DISPLAY "Welcome" + USERNAME
ELSE
DISPLAY "Wrong username or password!"
*/

import javax.swing.JOptionPane;
/*Bailey Spicer
**March 2, 2016
**bes2725@email.vccs.edu
**this program will prompt the user for a username and a password, and test to see 
**if those values match given parameters*/
public class Userpass
{
	public static void main (String[] args)
	{
		//declare constants - username/password
		final String USERNAME = "bailzor", PASSWORD = "orangeJuice";
		//declare variables
		String inuser, inpass;
		//user input
		inuser = JOptionPane.showInputDialog("Please enter your username: ");
		inpass = JOptionPane.showInputDialog("Please enter your password: ");

		//if/else
		if (USERNAME.equalsIgnoreCase(inuser) && PASSWORD.equals(inpass))
		{
			JOptionPane.showMessageDialog(null, "Welcome, " + USERNAME);
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Wrong username or password!");
		}
	}
}
