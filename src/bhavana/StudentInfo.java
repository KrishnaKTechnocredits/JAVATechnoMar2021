package bhavana;
class StudentInfo{
	String FirstName="Xyz";
	String MiddleName="pqr";
	String LastName="abc";
	String BirthDate="14th May 1998";
	String Address="Pune";
	int RollNo=10;
	
	void studentName(){
		System.out.println("FirstName of the student is:" +FirstName);
		System.out.println("MiddleName of the student is:" +MiddleName);
		System.out.println("LastName of the student is:" +LastName);
	}
	
	void studentOtherDetails(){
		System.out.println("Address of the student:"+Address);
		System.out.println("BirthDate of the student:"+BirthDate);
		System.out.println("RollNo of the student:"+RollNo);
	}
	
	public static void main(String[] args){
		StudentInfo SI=new StudentInfo();
		SI.studentName();
		SI.studentOtherDetails();
	}
}