import java.util.Scanner;

public class Box 
{
	private int length, width, height;

	public Box()
	{
		length=0;
		width=0;
		height=0;
	}
	public Box(int length)
	{
		this();
		this.length=length;

	}
	public Box(int length,int width)
	{
		this();
		this.length=length;
		this.width=width;
	}

	public void Show()
	{
		System.out.println("Length is "+ length);
		System.out.println("Height is "+ height);
		System.out.println("Width is "+ width);

	}
}