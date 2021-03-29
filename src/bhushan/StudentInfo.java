package bhushan;
class StudentInfo{
	String Name="Shikha",middle_name="Amit",surname="Patel",birthdate="10th Aug 1998",Address="G-809, Heaven Apartment, Baner, Pune.";
	int rollNumber=34;
	
	void studentName(){
		System.out.println(Name);
		System.out.println(middle_name);
		System.out.println(surname);	
	}
	
	void studentOtherDetails(){
		System.out.println(birthdate);
		System.out.println(Address);
		System.out.println(rollNumber);
		
	}                
	public static void main(String[] args){
		StudentInfo s1 = new StudentInfo();
		s1.studentName();
		s1.studentOtherDetails();			
	}
}