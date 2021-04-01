package aashay;
/*
 * Create a class named as Student, which have methods like below.
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

class Student{
	String stdName;
	String totalMarks;
	
	void studentName(String name){
		stdName = name;
	}
	
	void gainedMark(int marks){
		String gradeA1 = "grade A+";
		String gradeA = "grade A";
		String gradeB1 = "grade B+";
		String gradeB = "grade B";
		String gradeC = "grade C";
		
		if(marks > 90){
			totalMarks = gradeA1;
		}else if(marks > 80 && marks<=90){
			totalMarks = gradeA;
		}else if(marks > 70 && marks<=80){
			totalMarks = gradeB1;
		}else if(marks >= 60 && marks<=70){
			totalMarks = gradeB;
		}
		else if(marks<60){
			totalMarks = gradeC;
		}
	}
	
	void display(){
		System.out.println(stdName+" received "+totalMarks);
	}
	
	public static void main(String[] args){
		Student student = new Student();
		student.studentName("Maulik");
		student.gainedMark(75);
		student.display();
		
	}
}