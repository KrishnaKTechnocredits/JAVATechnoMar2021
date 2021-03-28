package prachi;

//Print all details of Student like Name, Middle name, Surname, birthdate, address,and roll number
// Assignment_1


class StudentInfo{
	
	String name = "Prachi";
	String middleName = "Vilasrao";
	String surname = "Lonkar";
	String birthDate = "14 Aug 1991";
	int rollNo = 45;
	String address = "Baner, Pune";
	
	void studentName(){
		System.out.println(name);
		System.out.println(middleName);
		System.out.println(surname);
	}
	
	void studentOtherDetails(){
		System.out.println(birthDate);
		System.out.println(address);
		System.out.println(rollNo);
	}

 public static void main(String[] args){
	 StudentInfo studentinfo = new StudentInfo();
	 studentinfo.studentName();
	 studentinfo.studentOtherDetails();
 }

}
