package aashay;

class StudentInfo
{
	String name, middleName, surname, birthDate, address;
	int rollNumber = 34;
	
	//method to print student name only
	void studentName()
	{	
		name = "Shikha";
		middleName = "Amit";
		surname = "Patel";
		
		System.out.println("Studens full name is:\n"+name+" \n"+middleName+" "+"\n"+surname+"\n");
	}
	
	
	//method to print student other details
	void studentOtherDetails()
	{
		birthDate = "10th August 1998";
		address = "G-809, Heaven Apartment, Baner, Pune";
		System.out.println("Studens other details are:\n"+""+birthDate+"\n"+ address+" "+"\n"+rollNumber);
	}
	
	//main method to create an object & reference variable to access methods in the class
	public static void main(String[] args)
	{
		StudentInfo stdName = new StudentInfo();
		StudentInfo stdDetails = new StudentInfo();

		stdName.studentName();
		stdDetails.studentOtherDetails();	
	}
	
}