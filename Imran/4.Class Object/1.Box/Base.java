public class Base 
{
	public static void main(String[] args) 
	{
		Box red = new Box(8, 6, 5);

		System.out.println("Area is: " + red.Area());	
		System.out.println("Volume is: " + red.Volume());	
	}
}