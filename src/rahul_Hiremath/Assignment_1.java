package rahul_Hiremath;
class StudentInfo
{
	String name = "Rahul";
	String middleName = "Shivanand";
	String surname = "Hiremath";
	String birthdate = "23rd Aug 1992";
	String address = "G-701, Greens,Thergaon, Chinchwad, Pune 411033";
	int rollNumber = 23;
	
	void studentName()
	{
		System.out.println("Name: " + name);
		System.out.println("Middle name: " + middleName);
		System.out.println("Surname" + surname);
	}
	
	void studentOtherDetails()
	{
		System.out.println("Birthdate: " + birthdate);
		System.out.println("Address: " + address);
		System.out.println("Roll no.: " + rollNumber);
	}
	
	public static void main (String[] args)
	{
		StudentInfo stdInfo = new StudentInfo();
		stdInfo.studentName();
		stdInfo.studentOtherDetails();
	}
}