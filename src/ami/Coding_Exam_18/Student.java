package ami.Coding_Exam_18;

public class Student {
	int rno;
	String fName;
	String lName;
	String address;

	public Student(int rno, String fName, String lName, String address) {
		super();
		this.rno = rno;
		this.address = address;
		this.fName = fName;
		this.lName = lName;
	}

	public int compareTo(Student std) {
		return (this.rno - std.rno);
	}

	public String toString() {
		return rno + " " + fName + " " + lName + " " + address;
	}

	@Override
	public int hashCode() {
		return (this.rno);
	}

	/*
	 * public String hashCode() { return this.fName; }
	 */

	@Override
	public boolean equals(Object obj) {
		Student std = (Student) obj;
		if (this.rno == std.rno && this.fName.equals(std.fName))
			;
		return true;
	}

}
