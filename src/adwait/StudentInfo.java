package adwait;

class StudentInfo{
	String name;
	String middlename;
	String surname;
	String address;
	String birthdate;
	int rollnum;
	
	
	void studentName(String name, String middlename, String surname){
		System.out.println(name);
		System.out.println(middlename);
		System.out.println(surname);
	} 
	
	void studentOtherDetails (String birthdate, String address, int rollnum){
		System.out.println(birthdate);
		System.out.println(address);
		System.out.println(rollnum);
	}
	
	public static void main (String [] args){
		StudentInfo studentInfo = new StudentInfo ();
		studentInfo.studentName("Adwait","Alka","Jojare");
		studentInfo.studentOtherDetails("01st Dec 1992","Hinjawadi Phase-3, Pune", 249);
	}
}