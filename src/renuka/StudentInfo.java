/*Assignment-1 :*/

package renuka;

class StudentInfo{
     String name = "Shikha";
	 String middleName = "Amit";
	 String surname = "Patel";
	 String birthdate = "10th August 1998";
	 String address = "G-809,Heaven Apartment,Baner,Pune";
	 int rollNumber = 34;
	 
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

     public static void main(String[] args){
	      StudentInfo studentDetails = new StudentInfo();
		  studentDetails.studentName();
		  studentDetails.studentOtherDetails();
	 
	 
	 }
}