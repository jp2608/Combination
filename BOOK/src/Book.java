import java.util.Scanner;
public class Book
{
	private String title;
	private String author;
	private int pageNumber;
	public void readBook()
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is the title?");
		title = keyboard.nextLine();
		System.out.println("What is the author?");
		author = keyboard.nextLine();
		System.out.println("What is the page number?");
		pageNumber = keyboard.nextInt();
	}
	public String getTitle()
	{
		return title;
	}
	public String getAuthor()
	{ 
		return author;
	}
	public int getPageNumber()
	{
		if(pageNumber < 0)
			System.exit(0);
		return pageNumber;
	}
	public void SetTitle(String title)
	{ 
		this.title = title;
	}
	public void setCategory(String author )
	{ 
		this.author = author;
	}
	public void setPageNumber(int pageNumber)
	{ 
		this.pageNumber = pageNumber;
	}
	public void setName(String title, String author, int pageNumber)
	{	
		this.title = title;
		this.author = author;
		this.pageNumber = pageNumber;
	}
	public void setBook(Book n)
	{	
		this.title = n.title;
		this.author = n.author;
		this.pageNumber = n.pageNumber;
	}

	public String getBook()
	{	
		return title + " " + author + " " + " " + pageNumber;
	}
	public Book add(Book other)
	{
		Book answer = new Book();
		answer.title = this.title + "-" + other.title;
		answer.author = this.author + "-" + other.author;
		answer.pageNumber = this.pageNumber + other.pageNumber;
		return answer;
	}
	public String getFullNameUpperCase( )
	{	
		String temp = title + " " + author + " " + " " + pageNumber;
		return temp.toUpperCase();
	}
	public String toString()
	{	
		return "\nTitle     "+ title + "\n" + "Category  " + author 	+ "\n" +"Pages     " + pageNumber;
	}
	public boolean equals(Book n)
	{	
		return this.title.equalsIgnoreCase(n.title)
				&& this.author.equalsIgnoreCase(n.author);
	}
}