import java.util.Scanner;
public class Cycle 
{
	private int numberOfWheels;
	private int weight;
	
	public void read()
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("How many number of wheels?");
		numberOfWheels = keyboard.nextInt();
		System.out.println("What is the weight of the bike?");
		weight = keyboard.nextInt();
	}
	
	public Cycle() 
	{
		this.numberOfWheels = 100;
		this.weight = 1000;
	}

	
	public Cycle(int numberOfWheels, int weight) 
	{
		this.numberOfWheels = numberOfWheels;
		this.weight = weight;
	}
	
	public String toString() 
	{
		return " [Number of Wheels = " + numberOfWheels + ", Weight = " + weight
				+ "]";
	}
}
