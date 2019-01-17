import java.util.Scanner;

public class DoubleOutput
{
	public static void main(String[] args) 
	{
		Scanner cin = new Scanner(System.in);	
	
		double num;

		System.out.println("enter an double Number");

		num = cin.nextDouble();

		System.out.println("The inputed double is: " + num);
	}
}