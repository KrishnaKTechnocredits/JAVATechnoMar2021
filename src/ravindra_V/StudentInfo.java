//Assignment 1

package ravindra_V;

class StudentInfo{
	String name = "Shikha";
	String middlename = "Amit";
	String surname = "Patel";
	String birthdate = "10th Aug 1998";
	String address = "G-809,Heaver Apartment, Baner, Pune.";
	int rollNumber= 34;
	
	void studentName(){
		System.out.println (name);
		System.out.println (middlename);
		System.out.println (surname);
	}
	
	void studentOtherDetails(){	
		System.out.println(birthdate);
		System.out.println(address);
		System.out.println(rollNumber);
	}
	
	public static void main (String[] args){
		StudentInfo studentinfo = new StudentInfo ();
		studentinfo.studentName();
		studentinfo.studentOtherDetails();
	}
}	
	