//2. Create a class named as Student, which have methods like below.
//a. studentName()
//b. gainedMark()

//Expectations:
//• If student gain mark above 90% display student name with grade A+
//• If student gain marks between 80% to 90% display name with grade A
//• If student gain marks between 70% to 80% display name with grade B+
//• If student gain marks between 60% to 70% display name with grade B
//• If student gain marks below 60% display name with grade C

//Sample input : Student name - Maulik, mark - 75
//Sample output : Maulik received grade B+

/*
Assignment 4 - Program 2 - Program Statement : Create a class named as Student, which have methods like below.
*/

package paras;

class Student{
	
	String stuName;
	
	void studentName(String name){
		stuName = name;
	}
	
	void gainedMark(double percentage){
		if(percentage > 90){
			System.out.println(stuName+" Received grade A+");
		}else if(percentage <=90 && percentage >80){
			System.out.println(stuName+" Received grade A");
		}else if(percentage <=80 && percentage> 70){
			System.out.println(stuName+" Received grade B+");
		}else if(percentage <=70 && percentage> 60){
			System.out.println(stuName+" Received grade B");
		}else
			System.out.println(stuName+" Received grade C");
	}
	
	public static void main(String[] args){
		Student student = new Student();
		student.studentName("Paras");
		student.gainedMark(95);
		student.studentName("Akshay");
		student.gainedMark(85.5);
		student.studentName("Rahul");
		student.gainedMark(75.5);
		student.studentName("Naimish");
		student.gainedMark(65.5);
		student.studentName("Kevin");
		student.gainedMark(55.5);
	}
}