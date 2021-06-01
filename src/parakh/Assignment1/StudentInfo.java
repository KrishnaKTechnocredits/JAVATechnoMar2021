/*JAVA Assignment-1 : 21st March 2021
 * 
Program Statement : 
Print all details of Student like Name, Middle name, Surname, birthdate, Address, and Roll number.

1. Create class called “StudentInfo”
2. Define 5 variables : Name, middle name, surname, birthdate(eg: 10th Aug 1998) as String, Address as String and rollNumber as int.
3. Create two methods called studentName() and studentOtherDetails()
4. studentName() method should print details like Name, middle name, surname.
5. studentOtherDetails() method print details like birthdate, Address, and Roll number.
6. Create main method.
7. write a logic in main method.
	a. Create object of StudentInfo class.
	b. call studentName() and studentOtherDetails() method on reference variable
8. Compile & Run

Output example :
Shikha
Amit
Patel
10th Aug 1998
G-809, Heaven Apartment, Baner, Pune.
34

*/

package parakh.Assignment1;

public class StudentInfo {
	
	String Name = "Shikha";
	String middleName = "Amit";
	String Surname = "Patel";
	String birthDate = "10th Aug 1998";
	String Address = "G-809, Heaven Apartment, Baner, Pune.";
	int rollNumber = 34;
	
	void studentName() {
		System.out.println(Name);
		System.out.println(middleName);
		System.out.println(Surname);	
	}
	
	void studentOtherDetails() {
		System.out.println(birthDate);
		System.out.println(Address);
		System.out.println(rollNumber);	
	}
	
	public static void main(String args[]) {
		StudentInfo studentinfo = new StudentInfo();
		studentinfo.studentName();
		studentinfo.studentOtherDetails();
	}

}
