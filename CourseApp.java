class Course
{
	String name;
	int duration;

	void assign()
	{
		System.out.println(name + " with duration " + duration + " Course is assigned.");
	}
}

class CourseApp
{
	public static void main(String[] args)
	{
		Course c1 = new Course();
		c1.name = "JAVA";
		c1.duration = 50;
		c1.assign();

		Course c2 = new Course();
		c2.name = "TESTING";
		c2.duration = 50;
		c2.assign();

		
	}
}