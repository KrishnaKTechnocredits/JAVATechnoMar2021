/*Program 1: Student -> Sorting based on student rno.
 rno, first, lastname, address
*/
package shilpa.coding_exam_18;

public class StudentForSorting implements Comparable<StudentForSorting> {
	int rollNo;
	String firstName;
	String lastName;
	String address;

	public StudentForSorting(int rollNo, String firstName, String lastName, String address) {
		this.rollNo = rollNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}

	public int compareTo(StudentForSorting std) {
		if ((this.rollNo - std.rollNo) > 0)
			return 1;
		else if ((this.rollNo - std.rollNo) < 0)
			return -1;
		else
			return 0;
	}

	@Override
	public String toString() {
		return "[rollNo=" + rollNo + ", firstName=" + firstName + ", lastName=" + lastName + ", address=" + address
				+ "]";
	}

}
