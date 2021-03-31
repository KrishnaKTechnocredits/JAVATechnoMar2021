package priyanka_Panat;
/*
 Assignment 1
 */
class StudentInfo{
      String name="Shikha";
	  String middlename="Amit";
	  String surname="Patel";
	  String birthdate="10 Aug 1998";
	  String address="G-809, Heaven Apartment,Baner Pune.";
	  int rollno=34;
	  
	  void studentName(){
		  System.out.println(name);
		  System.out.println(middlename);
		  System.out.println(surname);
	  }
	  
	  void studentOtherDetails(){
		  System.out.println(birthdate);
	      System.out.println(address);
	      System.out.println(rollno);
			
	  }
	  public static void main(String[] args){
		  StudentInfo s1= new StudentInfo();
          s1.studentName();
          s1.studentOtherDetails();
      }
}	  
	  
	  
			
	  
	  