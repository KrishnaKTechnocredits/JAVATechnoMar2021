/*Program 2: Student -> return unique list of Student.
 rno, first, lastname, address
 Note : if rno and firstname is same then objects are duplicate.
*/
package shilpa.coding_exam_18;

public class UniqueListStudent {
	int rollNo;
	String firstName;
	String lastName;
	String address;

	public UniqueListStudent(int rollNo, String firstName, String lastName, String address) {
		this.rollNo = rollNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}

	public int getRollNo() {
		return rollNo;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getAddress() {
		return address;

	}

	@Override
	public int hashCode() {
		return rollNo;

	}

	@Override
	public boolean equals(Object obj) {
		UniqueListStudent s1 = (UniqueListStudent) obj;
		if (this.rollNo == s1.rollNo && this.firstName == s1.firstName)
			return true;
		else
			return false;
	}

	@Override
	public String toString() {
		return "[rollNo=" + rollNo + ", firstName=" + firstName + ", lastName=" + lastName + ", address=" + address
				+ "]";
	}

}
