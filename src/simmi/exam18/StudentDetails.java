/*Test - 18 : 1st Jun'2021
 Program 1: Student -> Sorting based on student rno.
 rno, first, lastname, address*/

package simmi.exam18;

import java.util.ArrayList;
import java.util.Collections;

public class StudentDetails implements Comparable<StudentDetails> {
	int rollNum;
	String firstName;
	String lastName;
	String address;

	StudentDetails(int rollNum, String firstName, String lastName, String address) {
		this.rollNum = rollNum;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}

	public String toString() {
		return " Roll Num = " + rollNum + " First Name = " + firstName + " Last Name = " + lastName + " Address = "
				+ address;
	}

	public int compareTo(StudentDetails student) {
		if (this.rollNum - student.rollNum > 0)
			return 1;
		else if (this.rollNum - student.rollNum < 0)
			return -1;
		else
			return 0;
	}

	public static void main(String[] args) {
		ArrayList<StudentDetails> studentList = new ArrayList<StudentDetails>();

		StudentDetails student1 = new StudentDetails(5, "Sheldon", "Cooper", "Big Bang Theory");
		StudentDetails student2 = new StudentDetails(6, "Charlie", "Sheen", "Two and Half Men");
		StudentDetails student3 = new StudentDetails(2, "Stiles", "Stilinski", "Teen Wolf");
		StudentDetails student4 = new StudentDetails(1, "Jesse", "Pinkman", "Breaking Bad");
		StudentDetails student5 = new StudentDetails(4, "Micheal", "Scott", "The Office");
		StudentDetails student6 = new StudentDetails(3, "Dwight", "Schrute", "The Office");

		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);
		studentList.add(student4);
		studentList.add(student5);
		studentList.add(student6);

		Collections.sort(studentList);
		System.out.println(studentList);

	}
}
