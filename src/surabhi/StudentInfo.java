package surabhi;
/*
 * 
 * Assignment num 1
 * */

class StudentInfo
{
	String name="Surabhi";
	String middleName="Shreyash";
	String surname="Atal";
	String birthdate="9th Apr 1993";
	String address="Civil Lines, Yavatmal";
	int rollNumber=9;
	
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
	
	
	public static void main(String args[]){
		StudentInfo student=new StudentInfo();
		student.studentName();
		student.studentOtherDetails();
	}
}