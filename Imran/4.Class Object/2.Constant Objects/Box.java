import java.util.Scanner;

class Box
{
	public int length, width, height;

	Box()
	{
		length = width = height = 0;
	}

	Box(int length, int width, int height)
	{
		this.length = length;
		this.width = width;
		this.height = height;
	}

	public void SetValues(int length, int width, int height)
	{
		this.length = length;
		this.width = width;
		this.height = height;

	}

	public int Area()
	{
		return length * width;
	}

	public int Volume()
	{
		return length * width * height;
	}
}