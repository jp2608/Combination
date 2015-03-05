import java.util.Scanner;
public class DemoVolume 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		Book book1 = new Book();
		Volume volume1 = new Volume();
		
		book1.readBook();
		volume1.readVolume();
		
		System.out.println(book1);
		System.out.println(volume1);
	}
}
