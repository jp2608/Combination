import java.util.Scanner;
public class BuilderString 
{
	private String string;
	public void read()
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please Enter String of Word or Words.");
		string = scan.nextLine();
	}
	public BuilderString()
	{
		this.string = string;
	}

	public String toString() 
	{
		return string;
	}
}
