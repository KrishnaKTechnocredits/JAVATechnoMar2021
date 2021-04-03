package shivani.shivani_Assignment_1;

//Print all details of Student like Name, Middle name, Surname, birthdate, address,and roll number
//Assignment_1

class StudentInfo {
	String Name = "Shikha";
	String Middle_name = "Amit";
	String Surname = "Patel";
	String Birthdate = "10th Aug 1998";
	String Address = "G-809, Heaven Apartment, Baner, Pune.";
	int RollNo = 34;

	void StudentName() {
		System.out.println(Name);
		System.out.println(Middle_name);
		System.out.println(Surname);

	}

	void StudentOtherDetails() {
		System.out.println(Birthdate);
		System.out.println(Address);
		System.out.println(RollNo);
	}

	public static void main(String[] a) {
		StudentInfo studentInfo = new StudentInfo();
		studentInfo.StudentName();
		studentInfo.StudentOtherDetails();
	}

}
