class Assessment
{
	String name;
	String duration;
	String type_Of_Questions;
	String batch_Name;

	void assignToBatch()
	{
		System.out.println("The " + name + " assesment will be for " + batch_Name + " batch with duration of " + duration + ". The type assesment is " + type_Of_Questions +".");
	}

	void start()
	{
		System.out.println("The assesment started!");

	}
	
	void end()
	{
		System.out.println("The assesment end!");
	
	}	
		
}

class AssessmentApp
{
	public static void main(String[] args)
	{
		Assessment a1 = new Assessment();
		a1.name = "Java";
		a1.duration = "1 hour";
		a1.type_Of_Questions= "MCQ";
		a1.batch_Name = "July24";
		a1.assignToBatch();
		a1.start();
		a1.end();
		
		Assessment a2 = new Assessment();
		a2.name = "Python";
		a2.duration = "90 minutes";
		a2.type_Of_Questions= "coding";
		a2.batch_Name = "August24";
		a2.assignToBatch();
		a2.start();
		a2.end();

		Assessment a3 = new Assessment();
		a3.name = "php";
		a3.duration = "1.30 hour";
		a3.type_Of_Questions= "MCQ";
		a3.batch_Name = "February24";
		a3.assignToBatch();
		a3.start();
		a3.end();
	}
}