import java.util.Scanner;
public class Volume
{
	private String volumeName;
	private int numberOfBooks;
	private String Book[];
	public void readVolume()
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is the Volume Name?");
		volumeName = keyboard.nextLine();
		System.out.println("How many number of books?");
		numberOfBooks = keyboard.nextInt();
	}
	public void setBookArray(String Book1[])
	{
		Book = Book1;
	}
	public String[] getBookArray()
	{
		return Book;
	}
	public String toString() 
	{
		return "\nVolume Name     "+ volumeName + "\n" + "Number of Books  " + numberOfBooks;
	}
}
