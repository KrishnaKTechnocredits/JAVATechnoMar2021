
// Name,Middle name,Surname,BirthDate,Address,and Roll Number
 
package monali;

class StudentInfo{
    String name = "monali";
	String middleName = "vikas";
	String surname = "tondare";
	String birthdate = "10th Aug 1998";
	String address = "sinhgad road,pune";
	int rollno = 9;
	
	void studentName(){
		System.out.println(name);
		System.out.println(middleName);
		System.out.println(surname);
	}
	void studentOtherDetails(){
		System.out.println(birthdate);
		System.out.println(address);
		System.out.println(rollno);
	}
	public static void main(String[] a){
		StudentInfo Student1 = new StudentInfo();
		Student1.studentName();
		Student1.studentOtherDetails();
	}
		
		
	
}
	
	
	
	 
	 
	
	
