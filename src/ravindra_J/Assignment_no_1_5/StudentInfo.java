
/*WAP to print student info using two methods
*/
package ravindra_J.Assignment_no_1_5;	
class StudentInfo
{

	String s_name = "Shikha", s_middleName = "Amit", s_lastName = "Patel" , s_address = "G-809, Heaven Apartment, Baner, Pune." , s_birthDate = "10th Aug 1998";
	int s_rollNo = 34;
	
	public void studentName()
	{
		System.out.println(s_name);
		System.out.println(s_middleName);
		System.out.println(s_lastName);
	
	}
	
	public void studentOtherDetails()
	{
		System.out.println(s_birthDate);
		System.out.println(s_address);
		System.out.println(s_rollNo);
	
	}
    public static void main(String [] args)
	{
		StudentInfo student = new StudentInfo();
		student.studentName();
		student.studentOtherDetails();
	
	}

}