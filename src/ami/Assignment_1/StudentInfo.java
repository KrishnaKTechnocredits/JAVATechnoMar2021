package ami.Assignment_1;

class StudentInfo{
   String name = "Shikha";
   String middleName = "Amit";
   String surname ="Patel";
   String birthdate = "10th Aug 1998";
   String address = "Hinjewadi 3,maan road";
   int rollNumber = 14;
   
   
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
   
   public static void main(String[] a){
	   StudentInfo studentInfo = new StudentInfo();
	   studentInfo.studentName();
	   studentInfo.studentOtherDetails();
   }
   
}

