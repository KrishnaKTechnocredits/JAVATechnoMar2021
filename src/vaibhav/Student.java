/*Java Assignment 4: 25th March 2021

2. Create a class named as Student, which have methods like below.
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

package vaibhav;

class Student{
	String stdName;	
	
	void studentName(String sName){
		stdName = sName;
	}
	
	void gainedMark (int mark){
		if (mark > 90 && mark <= 100){								
			System.out.println(stdName + " received grade A+");
		}else if (mark >80 && mark <=90){
			System.out.println(stdName + " received grade A");
		}else if (mark >70 && mark <=80){
			System.out.println(stdName + " received grade B+");
		}else if (mark >=60 && mark <=70){
			System.out.println(stdName + " received grade B");
		}else if(mark <60){
			System.out.println(stdName + " received grade C");
		}
	}
	
	public static void main (String[] args){
		Student student = new Student();
		student.studentName("Techno_73");
		student.gainedMark(73);
	}
}
