package shashank.coding_exam18;

public class Student implements Comparable<Student> {
	private int rollNumber;
	private String studentName, address;

	Student(int rollNumber, String studentName, String address) {
		this.rollNumber = rollNumber;
		this.studentName = studentName;
		this.address = address;
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return (this.rollNumber - o.rollNumber);
	}

	public String toString() {
		return (this.rollNumber + " " + this.studentName + " " + this.address);
	}
}
