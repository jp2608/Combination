import java.util.Arrays;
import java.util.Scanner;
public class CharacterArray 
{
	private String address;
	private String[] sentence = new String[0];
	private int characterCount;

	public void read()
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please Enter in an Address.");
		address = scan.nextLine();
		
		String[] sentence = {address};
		
		characterCount = address.length();
		
		System.out.println("The address you entered in is: " + sentence[0]);
		System.out.println("The system will now turn your address number into asterisk(*) "+ "\n"
				+ "and turn the address letters into opposite lowercase or uppercase.");
		System.out.println("Please Press Enter to Continue");
		scan.nextLine();
		
		String result = "";
		String asterisk = "*";
		for(int i = 0; i < characterCount; i++)
		{
			char j = address.charAt(i);
			if (Character.isUpperCase(j))
			{
				char lowerCaseCurrent = Character.toLowerCase(j);
				result = result + lowerCaseCurrent;
			}
			else if (Character.isLowerCase(j))
			{
				char upperCaseCurrent = Character.toUpperCase(j);
				result = result + upperCaseCurrent;
			}
			else if (Character.isDigit(j))
			{
				result = result + asterisk;
			}
			else
			{
				result = result + j;
			}
		}
		System.out.println("New Address: " + "\n" + result);	
	}
	public CharacterArray(String address, String[] sentence, int characterCount)
	{
		this.address = address;
		this.sentence = sentence;
		this.characterCount = characterCount;
	}
	public String toString() {
		return "CharacterArray [address=" + address + ", characterCount="
				+ characterCount + ", sentence=" + Arrays.toString(sentence)
				+ "]";
	}
	
}
