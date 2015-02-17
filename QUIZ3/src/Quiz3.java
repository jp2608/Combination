import java.util.Scanner;
public class Quiz3
{
	private static int[] numbers = {3,6,7,5,4,1,2};
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("This will show numbers 1-7 in random order then put sort them in ascending and in descneding order");
		System.out.println("Please Hit Enter to Continue");
		scan.nextLine();
		System.out.println("Numbers: " + numbers[0] + "," + numbers[1] + "," + numbers[2] + "," + numbers[3] + "," + numbers[4] + "," 
		+ numbers[5] + "," + numbers[6]);
		System.out.println("Numbers in Ascending Order");
		ascending();
		System.out.println("Numbers in Descending Order");
		descending();
	}
	private static void numberSorting(int[] numbers)
	{
		int n = numbers.length;
		int temp = 0;

		for (int i = 0; i < n; i++) 
		{
			for (int j = 1; j < (n - i); j++) 
			{

				if (numbers[j - 1] > numbers[j]) 
				{
					temp = numbers[j - 1];
					numbers[j - 1] = numbers[j];
					numbers[j] = temp;
				}

			}
		}
	}
	private static void ascending()
	{
		numberSorting(numbers);
		for (int i = 0; i < numbers.length; i++) 
		{
			System.out.print(numbers[i]);
			System.out.print("\n");
		}
	}
	private static void descending()
	{
		numberSorting(numbers);
		for (int i = numbers.length -1; i>=0; i--) 
		{
			System.out.print(numbers[i]);
			System.out.print("\n");
		}
	}
}