import javax.swing.JOptionPane;
public class Quiz2 
{
	public static String correctUsername = "John";
	public static String correctPassword = "1234";
	public static String username, password;
	public static void main(String[] args)
	{
		username = JOptionPane.showInputDialog("Please Enter Username");
		authentication(username);
	}
	public static boolean authentication(String username)
	{
		boolean status = false;
		if(username.equalsIgnoreCase(correctUsername))
		{
			password = JOptionPane.showInputDialog("Please Enter Password");
			if(password.equals(correctPassword))
			{
				JOptionPane.showMessageDialog(null, "Welcome back " + username);
				status = true;
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Invalid Password");
			}
		}
		else
		{
			status = false;
			JOptionPane.showMessageDialog(null, "Invalid Username");
		}
		return status;
	}
}
