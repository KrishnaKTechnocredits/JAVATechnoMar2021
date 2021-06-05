package shashank.coding_exam18;

public class Student2 {
	private int rollNumber;
	private String studentName, address;

	Student2(int rollNumber, String studentName, String address) {
		this.rollNumber = rollNumber;
		this.studentName = studentName;
		this.address = address;
	}

	public String toString() {
		return (this.rollNumber + " " + this.studentName + " " + this.address);
	}

	@Override
	public int hashCode() {
		return this.rollNumber;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public String getStudentName() {
		return studentName;
	}

	public String getAddress() {
		return address;
	}

	@Override
	public boolean equals(Object obj) {
		Student2 std2 = (Student2) obj;
		System.out.println(this.rollNumber + " " + std2.rollNumber + this.studentName + " " + std2.studentName);
		if (this.rollNumber == std2.rollNumber && this.studentName.equals(std2.studentName))
			return true;
		else
			return false;
	}
}
