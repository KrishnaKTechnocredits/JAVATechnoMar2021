//Assignment 1

package radha;


class StudentInfo{
	String name = "Shikha";
	String middleName = "Amit";
	String surname = "Patel";
	String birthdate = "10th Aug 1998";
	String address = "G-809, Heaven Apts, Baner, Pune";
	int rollNumber = 34;
	
	void studName(){
		System.out.println(name);
		System.out.println(middleName);
		System.out.println(surname);
	}

	void studentOtherDetails(){
		System.out.println(birthdate);
		System.out.println(address);
		System.out.println(rollNumber);
	}

	public static void main(String[] args){
		StudentInfo studentinfo  = new StudentInfo();	
		studentinfo.studName();
		studentinfo.studentOtherDetails();
	}
}