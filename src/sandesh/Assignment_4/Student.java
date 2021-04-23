package sandesh.Assignment_4;

public class Student {
	String studentNameInstance;
	
	void studentName(String studentName) {
		studentNameInstance = studentName;
	}
	
	void gainedMark(int marks) {
		if(marks > 90 && marks <= 100)
			System.out.println(studentNameInstance + " received grade A+");
		else if(marks > 80 && marks <= 90)
			System.out.println(studentNameInstance + " received grade A");
		else if(marks > 70 && marks <= 80)
			System.out.println(studentNameInstance + " received grade B+");
		else if(marks > 60 && marks <= 70)
			System.out.println(studentNameInstance + " received grade B");
		else if(marks > 0 && marks <= 60)
			System.out.println(studentNameInstance + " received grade C");
		else
			System.out.println("Please enter valid marks received by " + studentNameInstance);
	}
	
	public static void main(String[] args) {
		Student st1 = new Student();
		String studName = "Sandesh";
		int mark = -80;
		st1.studentName(studName);
		st1.gainedMark(mark);
	}
}
