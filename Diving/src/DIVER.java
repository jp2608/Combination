import java.util.Scanner;
public class DIVER
{
	public static void main(String[] args)
	{
		double finalScore;
		System.out.println("Judges Please Enter Your Scores");
		finalScore = calculateScore();
		System.out.println("Results are in! \n" 
		+ "Divers Final Score is " + finalScore + "!!!");
	}
	public static double inputAllScores()
	{
		double validScore, lowScore = 10, highScore = 0, scoreAdd = 0, hlScore=0;
		for(int i=1; i<8; i++)
		{
			validScore = inputValidScore();
			if (validScore < lowScore)
			{
				lowScore = validScore;
			}
			else if (validScore > highScore)
			{
				highScore = validScore;
			}
			scoreAdd = scoreAdd + validScore;
			System.out.println("Total Sum of Score is " + scoreAdd);
		}
		hlScore = highScore + lowScore;
		System.out.println("Subtracting " + scoreAdd + " From Sum of Highest and Lowest Scores \n"
				+ highScore + " + " + lowScore + " = " + hlScore + "\n"
				+ scoreAdd + " - " + hlScore + " = ");
		scoreAdd = scoreAdd - highScore - lowScore;
		System.out.println(scoreAdd);
		System.out.println("The total Score is " + scoreAdd);
		return scoreAdd;
		
	}
	public static double inputValidScore()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Score 0-10 Please");
		double validScore = scan.nextDouble();
		while (validScore<0 || validScore>10)
		{
			System.out.println("Invalid Score Number Please Enter a Valid Number");
			validScore = scan.nextDouble();
		}
		return validScore;
	}
	public static double inputValidDegree()
	{
		double validDegree;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter in the Degree of Difficulty from 1.2 - 3.8");
		validDegree = scan.nextDouble();
		while (validDegree < 1.2 || validDegree > 3.8)
		{
			System.out.println("Invalid Number Please Enter Again");
			validDegree = scan.nextDouble();
		}
		System.out.println("Degree is " + validDegree);
		return validDegree;
		
	}
	public static double calculateScore()
	{
		double scoreAdd, finalScore=0, validDegree;
		scoreAdd = inputAllScores();
		System.out.println("Final Score will be declared");
		System.out.println("Degree of difficulty?");
		validDegree = inputValidDegree();
		finalScore = scoreAdd * validDegree;
		System.out.println("Final Score " + finalScore + " will now be multiplied by 0.6" );
		finalScore = finalScore * (0.6);
		return finalScore;
	}
}