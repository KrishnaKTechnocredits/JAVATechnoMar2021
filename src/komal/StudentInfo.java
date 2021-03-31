package

komal;class StudentInfo
{
	String name = "Komal";
	String middleName = "Jagannath";
	String surname = "Kadam";
	String birthdate = "14th Nov 1995";
	String address = "B-303 Downtown Langstan,Kharadi,Pune";
	int rollNumber = 18;
	
	void studentName(){
		System.out.println("Fierst Name is " +name);
		System.out.println("Middle Name is " +middleName);
		System.out.println("Surname is " +surname);
     	}
	void studentOtherDetails(){
	    System.out.println("Birthdate is- " +birthdate);
		System.out.println("Address is- " +address);
		System.out.println("RollNumber is- " +rollNumber);
	}
	 public static void main(String[] args)
	 {	 
	     StudentInfo s1=new StudentInfo();
			s1.studentName();
			s1.studentOtherDetails();
	  }
		
}