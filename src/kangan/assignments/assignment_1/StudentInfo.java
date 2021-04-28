package kangan.assignments.assignment_1;

public class StudentInfo {
   String Name = "Kangan";
   String middleName = "Gautam";
   String surname = "Gaurav";
   String birthdate = "4th feb 1994";
   String address = "678 choa chu kang";
   int rollNumber = 14;
   
   void studentName() {
	   System.out.println(Name);
	   System.out.println(middleName);
	   System.out.println(surname);
   }

void studentOtherDetails() {
	System.out.println(birthdate);
	System.out.println(address);
	System.out.println(rollNumber);
}
public static void main(String[] args) {
	StudentInfo studentInfo = new StudentInfo();
	studentInfo.studentName();
	studentInfo.studentOtherDetails();
}
}
