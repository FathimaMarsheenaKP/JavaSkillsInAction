class Student
{
	String name;
	int age;
	String gender;
	int marks;


	void eat()
	{
		System.out.println(name + " eats nomm nomm nomm!");
	}

	void sleep()
	{
		System.out.println(age + " age Student sleeps gorra gorra gorra");
	}

	void study()
	{
		System.out.println("Student studies one hour before exam");
	}
}

class StudentApp
{
	public static void main(String[] args)
	{
		Student s1 = new Student();

		Student s2 = new Student();

		s1.name = "Ami";
		s1.age = 22;
		s1.gender = "Female";
		s1.marks = 99;

		s1.eat();
		s1.sleep();
		s1.study();

		System.out.println("==============================");

		s2.name = "Mirash";
		s2.age = 24;
		s2.gender = "Male";
		s2.marks = 89;

		s2.eat();
		s2.sleep();
		s2.study();


	}
}