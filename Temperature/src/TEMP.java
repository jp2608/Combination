import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class TEMP
{
	private static Random random = new Random();
	private static final int TEMP = 2;
	private static final int TEMP2 = 1;
	private static final int MONTHS = 12;
	private static int MAX_TEMP = 1;
	private static int MIN_TEMP = 0;
	private static final int m=0;
	private static final String[] month = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args)
	{		
		int temp[][] = new int [MONTHS][TEMP];
		inputTempForMonth(month,temp);
		inputTempForYear(month,temp);
		calculateAverageHigh(temp);
		calculateAverageLow(temp);
		findHighestTemp(temp);
		findLowestTemp(temp);

	}
	private static int[][] inputTempForMonth(String[] month, int temp[][])
	{	
		int m=0;
		Scanner scan = new Scanner(System.in);      
		for(int i=0; i<MONTHS; i++)//12 times
		{
			for(int j=0; j<TEMP; j++)//2 times
			{
				if (j==0)
				{
					System.out.println("Enter the Temperature that is high for " + month[m]);
					temp[i][j] = scan.nextInt();
				}
				else if (j==1)
				{
					System.out.println("Enter the Temperature that is low for " + month[m]);
					temp[i][j] = scan.nextInt();
					m = m+1;
				}
			}
		}
		return temp;

	}

	private static int[][] inputTempForYear(String[] month, int temp[][])
	{
		int m=0;
		for(int i=0; i<MONTHS; i++, m++)//12 times
		{
			System.out.print(month[m]);
			for(int j=0; j<TEMP; j++)//2 times
			{
				if (j==0)
				{
					System.out.print(" has a High of " + temp[i][0]);
				}
				else if (j==1)
				{
					System.out.print(" and Low of " + temp[i][1]);
				}
			}
			System.out.println();
		}
		return temp;
	}
	private static double calculateAverageHigh(int[][] temp)
	{
		double sum = 0;
		double avg= 0;

		for (int col = 0; col < temp[0].length; col++)
		{
			sum = 0;
			for (int row = 0; row < temp.length; row++)
				sum += temp[row][0];
		}

		avg = sum / 12;
		System.out.println("High Temperature Average: " + avg);
		return avg;
	}
	private static double calculateAverageLow(int[][] temp)
	{
		{
			double sum = 0;
			double avg= 0;

			for (int col = 0; col < temp[0].length; col++)
			{
				sum = 0;
				for (int row = 0; row < temp.length; row++)
					sum += temp[row][1];		                		               
			}

			avg = sum / 12;
			System.out.println("Low Temperature Average: " + avg);
			return avg;
		}
	}
	private static int[][] findHighestTemp(int temp[][])
	{
		String Hmonth = null;
		for(int i=0; i<MONTHS; i++)//12 times
		{
			if (MAX_TEMP<temp[i][0])
			{
				MAX_TEMP = temp[i][0];
				Hmonth = month[i];
			}
		}
		System.out.println("The Highest Temperature is " + MAX_TEMP + " in " + Hmonth);
		return temp;
	}




	private static int[][] findLowestTemp(int temp[][])
	{
		String Lmonth = null;
		for(int i=0; i<MONTHS; i++)//12 times
		{
			if (MIN_TEMP>temp[i][1])
			{
				MIN_TEMP = temp[i][1];
				Lmonth = month[i];
			}
		}
		System.out.println("The Lowest Temperature is " + MIN_TEMP + " in " + Lmonth);
		return temp;
	}
}