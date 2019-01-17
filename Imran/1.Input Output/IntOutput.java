import java.util.Scanner;

public class IntOutput
{
	public static void main(String[] args) 
	{
		Scanner cin = new Scanner(System.in);	
	
		int num;

		System.out.println("enter an int Number");

		num = cin.nextInt();

		System.out.println("The inputed int is: " + num);
	}
}