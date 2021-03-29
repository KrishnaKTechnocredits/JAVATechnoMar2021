package krati_Jain;

class StudentInfo{
	String name = "Krati";
	String middleName = "AnyMiddleName"; 
	String surname = "Jain";
	String birthdate = "21st March 2000";
	String address = "123, Main Street, Random Address - 78";
	int rollNumber =16;
	
	void studentName() {
		System.out.println(name);
		System.out.println(middleName);
		System.out.println(surname);
	}
	
	void studentOtherDetails() {
		System.out.println(birthdate);
		System.out.println(address);
		System.out.println(rollNumber);
	}
	
	public static void main(String[] a){
		StudentInfo studentInfo = new StudentInfo();
		studentInfo.studentName();
		studentInfo.studentOtherDetails();
	}
}