/*
Program 1: Student -> Sorting based on student rno.
 rno, first, lastname, address
*/

package priyanka_Panat.coding_exam_18;

public class Student implements Comparable<Student> {
	int rollno;
	String firstname;
	String lastname;
	String address;

	public Student(int rollno, String firstname, String lastname, String address) {
		super();
		this.rollno = rollno;
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
	}

	@Override
	public int compareTo(Student stud) {
		if (this.rollno - stud.rollno > 0)
			return 1;
		else if (this.rollno - stud.rollno < 1)
			return -1;
		else
			return 0;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", firstname=" + firstname + ", lastname=" + lastname + ", address="
				+ address + "]";
	}

}
