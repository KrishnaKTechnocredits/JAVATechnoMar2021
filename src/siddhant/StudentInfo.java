package siddhant;

class StudentInfo{
	String Name = "Siddhant";
	String Middle_Name = "Sujit";
	String Last_Name = "Dixit";
	String Birthdate = "21st Feb 2000";
	String Address   = "Shri Nagar Colony";
	int Roll_no      = 21;
	
	void studentname()
	{
		System.out.println(Name);
		System.out.println(Middle_Name);
		System.out.println(Last_Name);
	}
	void studentotherdetails()
	{
		System.out.println(Birthdate);
		System.out.println(Address);
		System.out.println(Roll_no);
	}
	public static void main(String[] a)
	
	{
		StudentInfo studentinfo = new StudentInfo();
		studentinfo.studentname();
		studentinfo.studentotherdetails();
	}
}