package monika.Examples;
// Example1

class Student
{

	int age = 29;
	String name = "Monika";

	void display()
	{
		System.out.println(age);
		System.out.println(name);
	}

	public static void main(String[] args){
		Student studentDetails = new Student();
		studentDetails.display();
		
	}
}