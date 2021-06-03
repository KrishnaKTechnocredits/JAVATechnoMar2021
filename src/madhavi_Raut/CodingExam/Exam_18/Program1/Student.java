package madhavi_Raut.CodingExam.Exam_18.Program1;
//Program 01 - Student -> Sorting based on Student rollNo using Comparable

public class Student implements Comparable<Student> {

	int rollNo;
	String fName, lName, address;

	public Student(int rollNo, String fName, String lName, String address) {
		this.rollNo = rollNo;
		this.fName = fName;
		this.lName = lName;
		this.address = address;
	}

	public int compareTo(Student student) {
		if (this.rollNo - student.rollNo > 0)
			return 1;
		else if (this.rollNo - student.rollNo < 0)
			return -1;
		else
			return 0;
	}

	public String toString() {
		return this.rollNo + " " + this.fName + " " + this.lName;
	}
}
