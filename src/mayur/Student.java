package mayur;

class Student
{
	int age=22;
	String name="Mayur";
	void showData()
	{
		System.out.println(age);
		System.out.println(name);
		
	
	
	}
	public static void main(String[] a)
	{
		Student s1= new Student();
		s1.showData();
		System.out.println(s1);
	}
}