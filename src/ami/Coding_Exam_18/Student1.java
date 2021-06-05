package ami.Coding_Exam_18;

public class Student1 implements Comparable<Student1> {
	int rno;
	String fName;
	String lName;
	String address;

	public Student1(int rno, String fName, String lName, String address) {
		super();
		this.rno = rno;
		this.address = address;
		this.fName = fName;
		this.lName = lName;
	}

	public String toString() {
		return rno + " " + fName + " " + lName + " " + address;
	}

	public int compareTo(Student1 std) {
		return (this.rno - std.rno);
	}

}
