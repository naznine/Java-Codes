class Student extends Person
{
	private int studentID;

	Student()
	{
		super(); // invoking super class constructor

		studentID = 0;
	}

	Student(String name, int age, int id)
	{
		super(name, age);  // invoking super class constructor

		studentID = id;
	}

	public void Display()
	{
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Student ID: " + studentID);
	}
}
