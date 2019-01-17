class Base 
{
	public static void main(String[] args) 
	{
		final Box red = new Box(8, 6, 5);

		System.out.println("Area is: " + red.Area());	
		System.out.println("Volume is: " + red.Volume());

		red.length = 1;
		red.width = 1;
		red.height = 1;

		System.out.println("Area is: " + red.Area());	
		System.out.println("Volume is: " + red.Volume());

	}
}