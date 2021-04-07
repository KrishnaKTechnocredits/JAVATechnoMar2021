/*
 Assignment 1
 Print all details of Student like Name, Middle name, Surname, birthdate, Address, and Roll number.
 */
package neha_Rathi.assignment1;

class StudentInfo {
	String name = "Shikha";
	String middleName = "Amit";
	String surname = "Patel";
	String birthdate = "10th Aug 1998";
	String Address = "G-809, Heaven Apartment, Baner, Pune.";
	int rollNumber = 34;

	void studentName() {
		System.out.println(name);
		System.out.println(middleName);
		System.out.println(surname);
	}

	void studentOtherDetails() {
		System.out.println(birthdate);
		System.out.println(Address);
		System.out.println(rollNumber);
	}

	public static void main(String[] args) {
		StudentInfo studentInfo = new StudentInfo();
		studentInfo.studentName();
		studentInfo.studentOtherDetails();
	}
}