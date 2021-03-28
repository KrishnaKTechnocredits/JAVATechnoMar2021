package meenu;

/* Assignment_1 -> Program: Create a class named StudentInfo ,which have methods like below.
    studentName() method should print details like Name, middle name, surname.
    studentOtherDetails() method print details like birthdate, Address, and Roll number.     
 */

class StudentInfo{

    String name = "Amit";
	String middleName = "Shikha";
	String surname = "Patel";
	String birthdate = "10th Aug 1998";
	String address = "G-809, Heaven Apartment, Baner, Pune";
	int rollNumber = 34;
	
	void studentName(){
	    System.out.println("FirstName is "+name);
		System.out.println("MiddleName is "+middleName);
		System.out.println("Surname is "+surname);
	}

	void studentOtherDetails(){
         System.out.println("Birthdate is "+birthdate);
         System.out.println("RollNumber is "+rollNumber);
         System.out.println("Address is "+address);

   	}

    public static void main(String[] args){
         StudentInfo s1 = new StudentInfo();
         s1.studentName();
         s1.studentOtherDetails();
  }
 } 
		 