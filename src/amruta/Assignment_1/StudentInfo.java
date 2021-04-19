package amruta.Assignment_1;

class StudentInfo
{
	String Name = "Amruta";
	String MiddleName = "Arun";
	String Surname = "Kharat";
	String Birthdate = "15 Feb 1997";
	String Address = "Pune";
	int RollNo = 20;
	
	void Studentname()
	{
	System.out.println(Name);
	System.out.println(MiddleName);
	System.out.println(Surname);
	}
	void StudentotherInfo()
	{
	System.out.println(Birthdate);
	System.out.println(Address);
	System.out.println(RollNo);
	}
	public static void main(String[] a)
	{
	StudentInfo stud1 = new StudentInfo();
	stud1.Studentname();
	stud1.StudentotherInfo();
	}
}





