//Return Unique Student

package sandesh.coding_exam_18;

public class UniqueStudentClass {

	int rNo;
	String firstName;
	String lastName;
	String address;

	UniqueStudentClass(int rNo, String firstName, String lastName, String address) {
		super();
		this.rNo = rNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}

	@Override
	public int hashCode() {
		return this.rNo;
	}

	@Override
	public boolean equals(Object obj) {
		UniqueStudentClass usc = (UniqueStudentClass) obj;
		if (this == usc || (this.rNo == usc.rNo && this.firstName == usc.firstName))
			return true;
		else
			return false;
	}

	@Override
	public String toString() {
		return "Roll Number " + this.rNo + " First Name " + firstName + " Last Name " + lastName + " Address " + address
				+ " : --- : ";
	}

}