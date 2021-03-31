package nikita;

public class StudentInfo {

	void studentName()
	{
		String name="Nikita";
	    String surname="Naik";
	    String middlename="Nitin";
		System.out.println(name);
		System.out.println(middlename);
		System.out.println(surname);
		
	}
	
	void studentOtherDetails()
	{
		int birthdate= 01;
		String Address= "Nakshatra Apt,Pune,chinchwad ";
		int Rollno=12;
		System.out.println(birthdate);
		System.out.println(Address);
		System.out.println(Rollno);
		
	}
	
public static void main(String args[])
{
	StudentInfo s=new StudentInfo();
	s.studentName();
	s.studentOtherDetails();
}
}
