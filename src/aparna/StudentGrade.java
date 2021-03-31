/*
2. Create a class named as StudentGrade, which have methods like below.
a. studentName()
b. gainedMark()

Expectations:
• If student gain mark above 90% display student name with grade A+
• If student gain marks between 80% to 90% display name with grade A
• If student gain marks between 70% to 80% display name with grade B+
• If student gain marks between 60% to 70% display name with grade B
• If student gain marks below 60% display name with grade C

Sample input : Student name - Maulik, mark - 75
Sample output : Maulik received grade B+
*/
package aparna;

class StudentGrade {
	String studentName;

	void studentName(String name) {
		studentName = name;
	}

	void gainedMark(double marks) {
		if (marks > 100 || marks < 0) {// if any one condition is true then Invalid Input get printed
			System.out.println("Invalid Input given by User");
		} else if (marks > 90) {
			System.out.println(studentName + " received grade A+");
		} else if (marks > 80 && marks <= 90) {
			System.out.println(studentName + " received grade A");
		} else if (marks > 70 && marks <= 80) {
			System.out.println(studentName + " received grade B+");
		} else if (marks > 60 && marks <= 70) {
			System.out.println(studentName + " received grade B");
		} else if (marks < 60 && marks >= 0) {
			System.out.println(studentName + " received grade C");
		} else {
			System.out.println("Please Input valid Number");
		}
	}

	public static void main(String[] args) {
		StudentGrade studentGrade = new StudentGrade();
		studentGrade.studentName("Jyoti Singh Baghel");
		studentGrade.gainedMark(95.8);
		studentGrade.studentName("Sadhna");
		studentGrade.gainedMark(70);
		studentGrade.studentName("Surbhi");
		studentGrade.gainedMark(80.6);
	}
}