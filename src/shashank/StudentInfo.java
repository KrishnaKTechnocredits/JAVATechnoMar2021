package shashank;
class StudentInfo
{
	String name="Shashank";
	String middleName="Shamrao";
	String surName="Dharmadhikari";
	String birthdate="15th November 1994";
	String address="Tingare Nagar,Pune";
	int rollNumber=123;
	void studentName(){
		System.out.println("Student Information Are Follows");
	    System.out.print("Full name:- "+name+" ");
		System.out.print(middleName+" ");
		System.out.println(surName);
	}
	
	void studentOtherDetails(){
		System.out.println("Roll Number:-"+rollNumber );
		System.out.println("Address:- "+address);
		System.out.println("Birthdate is:- "+birthdate);
	}
	public static void main(String args[])
	{
		StudentInfo studentinfo = new StudentInfo();
		studentinfo.studentName();
		studentinfo.studentOtherDetails();
	}
}