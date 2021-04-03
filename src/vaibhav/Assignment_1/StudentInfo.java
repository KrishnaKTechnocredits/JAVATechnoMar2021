
/* JAVA Assignment-1: 21st March 2021

Program Statement: 

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
 
 */

package vaibhav.Assignment_1;

class StudentInfo{
	String stdName = "Vaibhav";
	String mName = "Nagnath";
	String surName = "Tati";
	String dob = "14th July 1992";
	String address = "Ravet";
	int rollNumber = 101;
		
	
	void studentName(){
		System.out.println(stdName);
		System.out.println(mName);
		System.out.println(surName);
	}
	
	void studentOtherDetatils(){
		System.out.println(dob);
		System.out.println(address);
		System.out.println(rollNumber);
	}
	
	public static void main(String[] args){
		StudentInfo s1 = new StudentInfo();
		s1.studentName();
		s1.studentOtherDetatils();
	}
}