package kangan.assignments.assignment_4;

public class Student {
    static String studentName;
	static double studentMarks;
 
	void studentName(String name) {
		studentName = name;
		System.out.println("Student name is : " + name);
	}
	void gainedMark(double marks) {
		studentMarks = marks;
		
		if (marks >90) {
			System.out.println("grade A+");
		}
			else if (marks>80 && marks <= 90) {
				System.out.println("grade A");
		}
			else if (marks>70 && marks <= 80) {
				System.out.println("grade B+");
			}
			else if (marks>60 && marks <= 70) {
				System.out.println("grade B");
			}
			else {
				System.out.println("grade C");
			}
	}
	public static void main(String[] args) {
		Student student = new Student();
		student.studentName("Kangan");
		student.gainedMark(85.5);
		System.out.println(studentName + " received " + studentMarks);
	}
}
