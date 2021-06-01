package rikin.assignment1;

class StudentInfo{
	String name = "Rikin";
	char middleName = 'C';
	String surname = "Hingrajiya";
	String birthdate = "04th Sep 1989";
	String address = "Gajanan Society, Near White House appartment, Dhrol";
	int rollNo = 13;
	
	void studentName(){
		System.out.println(name);
		System.out.println(middleName);
		System.out.println(surname);
	}
	
	void studentOtherDetails(){
		System.out.println(birthdate);
		System.out.println(address);
		System.out.println(rollNo);
	}
	
	public static void main(String[] args){
		StudentInfo studentInfo = new StudentInfo();
		studentInfo.studentName();
		studentInfo.studentOtherDetails();		
	}
}		