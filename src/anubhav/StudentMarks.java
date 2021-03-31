

/*Create a class named as Student, which have methods like below.
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

package anubhav;

class StudentMarks{ //Have an existing assignment from past with class name Student, hence created a new class Name for this assignment
	String studName;
	
	void studentName(String name){
		studName=name;
		}
	
	void gainedMark(int marks){
		if (marks> 90){
			System.out.println(studName + " received grade A+");
		}else if (marks>80 && marks<90){
			System.out.println(studName + " received grade A");
		}else if (marks>70 && marks<80){
			System.out.println(studName + " received grade B+");
		}else if (marks>60 && marks<70){
			System.out.println(studName + " received grade B");
		}else{
			System.out.println(studName + " received grade C");
		}
	}
	
	public static void main(String[] args){
		StudentMarks studentMarks= new StudentMarks();
		studentMarks.studentName("Aditya Sinha");
		studentMarks.gainedMark(75);
	}
} 