//WAP for student details.

package ashwini;

class studentInfo
{
	String name = "Ashwini";
	String middleName = "Atmaram";
	String lastName = "Jadhav";
	String DOB = "23 april 1994";
	int rollNumber =  20;
	String add =  "A-wing, 103, Sighgad road pune 41009";
	
	void studentName()
	{
	System.out.println("Student name is :"+name);
	System.out.println("Stude middleName is :"+ middleName);
	System.out.println("student lastName is :"+ lastName);
	}
	 void studentOtherDetails()
	 {
		 System.out.println("student rollNumber is :"+ rollNumber);
		 System.out.println("student dob is :"+DOB);
		 System.out.println("student address is :"+ add);
	 }
	 public static void main (String args[])
	 {
		 studentInfo studentInfo_1 = new studentInfo();
		 studentInfo_1.studentName();
		 studentInfo_1.studentOtherDetails();
	 }
}
	 