package krati_Jain;

class StudentGrades {
	String studentName;
	
	void studentName(String stuName) {
		studentName = stuName;
	}
	
	void gainedMark(int marks) {
		if (marks >= 90) {
			System.out.println(studentName +  " received grade A+");
		}else if (marks < 90 && marks >= 80) {
			System.out.println(studentName +  " received grade A");
		}else if (marks < 80 && marks >= 70) {
			System.out.println(studentName +  " received grade B+");
		}else if (marks < 70 && marks >= 60) {
			System.out.println(studentName +  " received grade B");
		}else {
			System.out.println(studentName +  " received grade C");
		}
	}
	
	public static void main(String[] a) {
		StudentGrades studentGrades = new StudentGrades();
		studentGrades.studentName("Krati Jain");
		studentGrades.gainedMark(82);
	}
}