/*Program 2: Student -> return unique list of Student.
 rno, first, lastname, address
 Note : if rno and firstname is same then objects are duplicate.
*/
package priyanka_Panat.coding_exam_18;

public class Student2 {
	int rollno;
	String firstname;
	String lastname;
	String address;

	@Override
	public String toString() {
		return "Student2 [rollno=" + rollno + ", firstname=" + firstname + ", lastname=" + lastname + ", address="
				+ address + "]";
	}

	public Student2(int rollno, String firstname, String lastname, String address) {
		super();
		this.rollno = rollno;
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
	}

	@Override
	public int hashCode() {
		return this.rollno;
	}

	@Override
	public boolean equals(Object obj) {
		Student2 s1 = (Student2) obj;
		if (this.rollno == s1.rollno && this.firstname == s1.firstname)
			return true;
		else
			return false;
	}
}
