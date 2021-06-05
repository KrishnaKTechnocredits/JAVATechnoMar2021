package madhavi_Raut.CodingExam.Exam_18.Program2;

public class Student {
	int rollNo;
	String fName, lName, address;

	Student(int rollNo, String fName, String lName, String address) {
		this.rollNo = rollNo;
		this.fName = fName;
		this.lName = lName;
		this.address = address;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj == this)
			return true;
		if (obj == null)
			return false;
		if (this.getClass() != obj.getClass())
			return false;

		Student objStudent = (Student) obj;
		return (this.rollNo == objStudent.rollNo && this.fName.equals(objStudent.fName));

	}

	@Override
	public int hashCode() {
		int sumChar = 0;
		char[] charArr = fName.toCharArray();
		for (int index = 0; index < charArr.length; index++) {
			sumChar = charArr[index];
		}
		return sumChar;
	}

	@Override
	public String toString() {
		return rollNo + " " + fName + " " + lName + " " + address;

	}
}
