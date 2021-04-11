package pallavi.Assignment_9;

class StudentInfo{


  String name= "Shikha";
  String middleName= "Amit";
  String surname= "Patel";
  String birthdate ="10th Aug 1998";
  String address ="G-809, Heaven Apartment, Baner, Pune.34";
  int rollno= 34;
  
  
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
   
   public static void main(String args[]){
   StudentInfo stu=new StudentInfo();
   stu.studentName();
   stu.studentOtherDetails();
   
   }
}