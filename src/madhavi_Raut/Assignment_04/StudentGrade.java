/*Assignment 04
 Program 02
 Create a class named as Student, which have methods like below.
	a. studentName()
	b. gainedMark()
	
	Expectations:
	• If student gain mark above 90% display student name with grade A+
	• If student gain marks between 80% to 90% display name with grade A
	• If student gain marks between 70% to 80% display name with grade B+
	• If student gain marks between 60% to 70% display name with grade B
	• If student gain marks below 60% display name with grade C
	
	Sample input : Student name - Maulik, mark - 75
	Sample output : Maulik received grade B+ */
package madhavi_Raut.Assignment_04;

class StudentGrade {
	String studentName;

	void studentName(String name) {
		studentName = name;
	}

	void gainedMark(int marks) {
		if (marks > 90) {
			System.out.println(studentName + " received grade A+");
		} else if (marks > 80 && marks <= 90) {
			System.out.println(studentName + " received grade A");
		} else if (marks > 70 && marks <= 80) {
			System.out.println(studentName + " received grade B+");
		} else if (marks > 60 && marks <= 70) {
			System.out.println(studentName + " received grade B");
		} else {
			System.out.println(studentName + " received grade C");
		}
	}

	public static void main(String[] args) {
		StudentGrade studentGrade = new StudentGrade();
		studentGrade.studentName("Maulik");
		studentGrade.gainedMark(75);
	}
}
