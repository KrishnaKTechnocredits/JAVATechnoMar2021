package upasana;

class StudentInfo{
	String Name = "Upasana";
	String MiddleName = "Anand";
	String Surname = "Singh";
	String BirthDate = "17th March 1995";
	String Address = "Newtown,Kolkata,India";
	int RollNumber = 47;
	
	void StudentName(){
		System.out.println(Name);
		System.out.println(MiddleName);
		System.out.println(Surname);
		
	}
	void SudentOtherDetails(){
		System.out.println(BirthDate);
		System.out.println(Address);
		System.out.println(RollNumber);
	}
	
	public static void main(String[] args){
		StudentInfo studentInfo = new StudentInfo();
		studentInfo.StudentName();
		studentInfo.SudentOtherDetails();
	}
}
	
	