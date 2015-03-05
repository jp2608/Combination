import java.util.Scanner;
public class Locker
{

	int lockerNumber;
	private String studentName;

	int numberOfBooks;

	CombinationLock combinationLock;

	// do the no input argument
	public void readLocker()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter in the Students Name");
		studentName = scan.nextLine();
	}
	public Locker()
	{
		
	}
	public Locker(int lockerNum, String name)
	{
		// do the input arguments for all attributes
		this.lockerNumber = lockerNum;
		this.studentName = name;  
	}

	public String getStudentName() 
	{
		return studentName;
	}

	public void setStudentName(String studentName)
	{
		this.studentName = studentName;
	}
	public void putBookInLocker(int addBook)
	{
		addBook += 1;
	}
	public boolean removeBookFromLocker (boolean booksRemoved)
	{
		if(booksRemoved)
		{
			System.out.print(true);
		}
		else
			System.out.print(false);
		return booksRemoved;
	}

	public int openLocker()
	{
		return lockerNumber;
		// if statements with combinations assigned from the input
	}
}