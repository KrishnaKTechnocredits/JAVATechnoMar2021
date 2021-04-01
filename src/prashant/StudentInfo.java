// Print all details of Student like Name, Middle name, Surname, birthdate, Address, and Roll number

package prashant;

class StudentInfo{
	int rollnumber=66;
		String name="Shikha";
		String middlename="Amit";
		String surname="Patel";
		String birthdate="10 Aug 1998";
		String address = "G-809 Heaven Apt. ,Baner ,Pune";

// Method for Display student name
		
	void studentName(){
		System.out.println("Student Name: "+name);
		System.out.println("Student Middle Name: "+middlename);
		System.out.println("Student Surname: "+surname);
	}

// Method for Display student details
	
	void studentDetails(){
		System.out.println("Student Birth date: " +birthdate);
		System.out.println("Student Middle Name: "+middlename);
		System.out.println("Student Address: " +address);
		System.out.println("Student Roll No: " +rollnumber);
    }

public static void main (String[] arg ){

		StudentInfo student = new StudentInfo();
		student.studentName();
	    student.studentDetails();

}

}