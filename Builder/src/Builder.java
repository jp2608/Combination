public class Builder 
{
	public static void main(String[] args)
	{
		BuilderString string1 = new BuilderString();
		BuilderString string2 = new BuilderString();
		BuilderString string3 = new BuilderString();

		string1.read();
		System.out.println("You have entered: " + string1);

		string2.read();
		System.out.println("You have entered: " + string2);

		System.out.println("The first two combinaiton string sentence is: " + string1  + " " + string2);
		System.out.println("Please Enter in a third string word or words to insert indie between first and second string.");
		string3.read();
		System.out.println("You have entered: " + string3);
		System.out.println("The new combined sentence with the third string is: " + string1 + " " + string3 + " " + string2);

	}
}
