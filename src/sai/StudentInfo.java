package sai;

class StudentInfo{

	String name = "Shikha", middleName = "Amit", surname = "Patel", birthdate = "10th Aug 1998", address = "G-809, Heave Apartment, Baner, Pune";
	int rollNumber = 34;
	
	void studentName(){
		System.out.println(name);
		System.out.println(middleName);
		System.out.println(surname);
	}
	
	void studentOtherDetails(){
		System.out.println(birthdate);
		System.out.println(address);
		System.out.println(rollNumber);
	}

	public static void main (String[] args){
		StudentInfo studentInfo = new StudentInfo();
		studentInfo.studentName();
		studentInfo.studentOtherDetails();
	}		
}