/*
Test - 18 : 1st Jun'2021
 Program 1: Student -> Sorting based on student rno.
 rno, first, lastname, address
 */

package sourabh.CodingExam_18.ComparableExample;

public class Student implements Comparable<Student> {
	int strRno;
	String firstName;
	String lastName;
	String address;

	public Student(int strRno, String firstName, String lastName, String address) {
		super();
		this.strRno = strRno;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}

	@Override
	public int compareTo(Student student) {
		if (this.strRno - student.strRno > 0)
			return 1;
		else if (this.strRno - student.strRno < 0)
			return -1;
		else
			return 0;
	}

	@Override
	public String toString() {
		return "Student [strRno=" + strRno + ", firstName=" + firstName + ", lastName=" + lastName + ", address="
				+ address + "]\n\n";
	}
	

}
