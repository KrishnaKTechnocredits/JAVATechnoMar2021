package ashtha;

class StudentInfo {
	String name = "Shikha", middlename = "Amit", surname = "Patel" , birthdate = "10th Aug 1998", Address = "G-809, Heaven Apartment, Baner, Pune.";
	int rollNumber = 34;
	
	void studentName(){
		System.out.println(name);
		System.out.println(middlename);
		System.out.println(surname);
	}
	
	void studentOtherDetails() {
		System.out.println(birthdate);
		System.out.println(Address);
		System.out.println(rollNumber);
	}
	
	public static void main (String[] a) {
		StudentInfo studentInfo = new StudentInfo ();
		studentInfo.studentName();
		studentInfo.studentOtherDetails();
	}
}