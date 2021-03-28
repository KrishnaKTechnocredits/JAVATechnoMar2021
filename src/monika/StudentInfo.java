package monika;
/*
 Assignment1: 
 */

class StudentInfo{
	int rollNumber = 34;
	String name = "Shikha", middlename = "Amit", surname = "Patel", birthdate = "10th Aug 1998";
	String address = "G-809, Heaven Apartment, Baner, Pune.";

	void studentName(){
		System.out.println(name);
		System.out.println(middlename);
		System.out.println(surname);
	}

	void studentOtherDetails(){
		System.out.println(birthdate);
		System.out.println(address);
		System.out.println(rollNumber);
	}
	
	public static void main(String[] args){
		StudentInfo studentInfo = new StudentInfo();
		studentInfo.studentName();
		studentInfo.studentOtherDetails();
	}
}