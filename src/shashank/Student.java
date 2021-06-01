package shashank;
class Student
{
	String name;
	public void studentName(String name)
	{
		this.name=name;
	}
	public void gainedMark(int mark)
	{
		if (mark<0 && mark>100)
			System.out.println("Invalid input");
		if (mark>90)
			System.out.println(name+" gets an A+ grade");
		else if (mark>=80 && mark<=90)
			System.out.println(name+" gets an A grade");
		else if (mark>=70 && mark<=80)
			System.out.println(name+" gets a B+ grade");
		else if (mark>=60 && mark<=70)
			System.out.println(name+" gets a B grade");
		else 
			System.out.println(name+" gets an C grade");
	}
	public static void main (String args [])
	{
		Student student = new Student();
		student.studentName("Shashank");
		student.gainedMark(98);
	}
}