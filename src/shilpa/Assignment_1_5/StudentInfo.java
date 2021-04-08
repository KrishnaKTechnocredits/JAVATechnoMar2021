//Print all details of Student like Name, Middle name, Surname, birthdate, Address, and Roll number.
package shilpa;

class StudentInfo {

	String name = "Shilpa";
	String middleName = "Prashant";
	String surname = "Akarte";
	String birthdate = "10th Aug 1998";
	String address = "Sus road ,Pashan ,pune 21";
	int rollNo = 6;
	
	void studentName()
	{
		System.out.println(name);
		System.out.println(middleName);
		System.out.println(surname);
	}
	
	void studentOtherDetails()
	{
		System.out.println(birthdate);
		System.out.println(address);
		System.out.println(rollNo);
	}
	
	public static void main(String[] arg)
	{
		StudentInfo s1 = new StudentInfo();
		s1.studentName();
		s1.studentOtherDetails();
	}
}