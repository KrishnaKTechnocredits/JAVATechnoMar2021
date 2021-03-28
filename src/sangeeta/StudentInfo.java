// Print all details of student like Name, Middle name, Surname, Birthdate, Address and Roll number.
package sangeeta;
class StudentInfo{
	String name = "Sangeeta";
	String Middlename = "Kartik";
	String Surname = "Kuttarmare";
	String Birthdate = "27 Aug 1989";
	String Address = "Dattanagar, Parva, Tah. Ghatanji, Dis. Yawatmal";
	int Rollnumber = 9;
	
	void studentName(){
		System.out.println(name);
		System.out.println(Middlename);
		System.out.println(Surname);
	}
	void studentOtherDetails(){
		System.out.println(Birthdate);
		System.out.println(Address);
		System.out.println(Rollnumber);	
	}
	
	public static void main(String[] a){
		StudentInfo StudentInfo = new StudentInfo();
		StudentInfo.studentName();
		StudentInfo.studentOtherDetails();
	}
}
