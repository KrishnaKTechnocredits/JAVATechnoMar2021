/*Assignment 4: Create a class named as Student, which have methods like below.
a. studentName()
b. gainedMark()
Expectations:
• If student gain mark above 90% display student name with grade A+
• If student gain marks between 80% to 90% display name with grade A
• If student gain marks between 70% to 80% display name with grade B+
• If student gain marks between 60% to 70% display name with grade B
• If student gain marks below 60% display name with grade C
Sample input : Student name - Maulik, mark - 75
Sample output : Maulik received grade B+*/
package prashant.Assignment_3_8;

public class Student {
	String stdName;

	void studentName(String name) {
		stdName = name;
	}

	void gainedMark(int mark) {
		if (mark > 90 && mark <= 100) {
			System.out.println(stdName + " recieved grade A+ ");
		} else if (mark <= 90 && mark > 80) {
			System.out.println(stdName + " recieved grade A ");
		} else if (mark <= 80 && mark > 70) {
			System.out.println(stdName + " recieved grade B+ ");
		} else if (mark <= 70 && mark > 60) {
			System.out.println(stdName + " recieved grade B ");
		} else if (mark > 0 && mark <= 60) {
			System.out.println(stdName + " recieved grade C");
		} else {
			System.out.println("Invalid Input");
		}
	}

	public static void main(String[] args) {
		Student studentmarks = new Student();
		studentmarks.studentName("Maulik");
		studentmarks.gainedMark(75);
	}
}
