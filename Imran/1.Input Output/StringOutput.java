import java.util.Scanner;

public class StringOutput
{
	public static void main(String[] args) 
	{
		Scanner cin = new Scanner(System.in);	
	
		String text;

		System.out.println("enter a line");

		text = cin.nextLine();

		System.out.println("The inputed line is: " + text);

	}
}