package sourabh;

class StudentInfo{
	String name= "Sourabh";
	String surname= "Saha";
	String birthdate= "13-Aug-93";
	String address= "Kolkata";
	int rollNumber = 50;
	
	void studentName() {
		System.out.println(name);
		System.out.println(surname);
		
	}
	
	void studentOtherDetails(){
		
		System.out.println(birthdate);
		System.out.println(address);
		System.out.println(rollNumber);
	}
	
	public static void main(String[] args){
		
		StudentInfo studentinfo= new StudentInfo();
		studentinfo.studentName();
		studentinfo.studentOtherDetails();
	}

}