/*
 *assignment 1 printi g student details
 */
package purva;

class StudentInfo{
	String name = "Shikha";
	String middlename = "Amit";
	String surname = "Patel";
	String address="G-809, Heaven Apartment, Baner, Pune";
	int rollNo = 4;
	String birthDate= "10th Aug 1998";
	
	void studentName(){
		System.out.println(name);
		System.out.println(middlename);
		System.out.println(surname);
	}
	
	void studentOtherDetails(){
		System.out.println(birthDate);
		System.out.println(address);
		System.out.println(rollNo);
	}
	
	public static void main(String[] args){
		StudentInfo studentInfo = new StudentInfo();
		studentInfo.studentName();
		studentInfo.studentOtherDetails();
	}
}
		
	
