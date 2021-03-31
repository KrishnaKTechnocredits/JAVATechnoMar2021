package krati_Shukla;

class Student
{
	int age = 19;
	String name = "Krati";
	void ShowData()
	{
		System.out.println (age);
		System.out.println (name);
	}
	public static void main (String[] a)
	{
		Student s1 = new Student();
		s1.ShowData();
	}
}