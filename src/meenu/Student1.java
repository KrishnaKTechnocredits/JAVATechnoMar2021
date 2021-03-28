package meenu;

/* Assignemtn_4 -> Program_2:Create a class named as Student, which have methods like below.
a. studentName()
b. gainedMark()

Expectations:
 • If student gain mark above 90% display student name with grade A+
 • If student gain marks between 80% to 90% display name with grade A
 • If student gain marks between 70% to 80% display name with grade B+
 • If student gain marks between 60% to 70% display name with grade B
 • If student gain marks below 60% display name with grade C
*/

class Student1{
	String name;
	
	void studentName(String nameOfStudent){
		name = nameOfStudent;
	}

	void gainedMarks(int marks){
		if(marks > 90 && marks <= 100){
			System.out.println(name+ " received "+" grade A+");
		}else if(marks <= 90 && marks > 80){
			System.out.println(name+" received "+" grade A");
		}else if(marks <= 80 && marks > 70){
			System.out.println(name+" received "+" garde B+");
		}else if(marks <= 70 && marks > 60){
			System.out.println(name+" received "+" garde B");
		}else if(marks <= 60 && marks >= 0){
			System.out.println(name+" received "+" garde C");
		}else if (marks > 100 || marks < 0){
			System.out.println(name+ " Invalid Input");
		}	
	}

	public static void main(String[] args){
		Student1 student1 = new Student1();
		student1.studentName("Neha");
		student1.gainedMarks(94);
		student1.studentName("Monika");
		student1.gainedMarks(80);
		student1.studentName("rahul");
		student1.gainedMarks(64);
		student1.studentName("Raj");
		student1.gainedMarks(105);
		student1.studentName("Naresh");
		student1.gainedMarks(-1);
	}
}	
