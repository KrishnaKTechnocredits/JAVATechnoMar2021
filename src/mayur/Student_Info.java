package mayur;
class Student_Info
{
	String Name="Shikha";
	String Middle_Name="Amit";
	String Surname="Patel";
	String Date_of_Birth="10th Aug 1998";
	String Address="G-809,Heaven Apartment,Baner,Pune";
	int Roll_No=15;
	
	void student_Name()
	{
		System.out.println(Name);
		System.out.println(Middle_Name);
		System.out.println(Surname);
	}
	
	void student_Other_Details()
	{
		System.out.println(Date_of_Birth);
		System.out.println(Address);
		System.out.println(Roll_No);
	}
	
	public static void main (String [] args)
	{
		Student_Info student_Info = new Student_Info();
		student_Info.student_Name();
		student_Info.student_Other_Details();
	}
	
}