
public class CycleDemo 
{
	public static void main(String[] args)
	{
		Cycle bike = new Cycle();
		System.out.println("Enter Bikes information.");
		bike.read();
		System.out.println("Your Bikes information is " + bike);
		Cycle bike2 = new Cycle();
		System.out.println("Default Bike info " + bike2);
	}
}
